package com.thelastlegend.FoodOrderingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.thelastlegend.FoodOrderingSystem.Services.FoodServices;
import com.thelastlegend.FoodOrderingSystem.model.FoodOrder;
import com.thelastlegend.FoodOrderingSystem.repository.FoodRepository;

@RestController
public class FoodController {
	
	
@Autowired 
private FoodRepository foodRepository;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public ResponseEntity<Object> Menu(@RequestBody FoodOrder foodOrder){
		//System.out.println("hello world");
		foodRepository.save(foodOrder);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public ResponseEntity<Object> getMenu(){
		List<FoodOrder> fo=foodRepository.findAll();
		return new ResponseEntity<Object>(fo, HttpStatus.OK);
	}
	
	@RequestMapping(value="/get/searchByItemName/{iName}",method=RequestMethod.GET)
	public ResponseEntity<Object> KnowMenu(@PathVariable String iName){
		List<FoodOrder> fo=foodRepository.findByItemName(iName);
		return new ResponseEntity<Object>(fo, HttpStatus.OK);
	}
	
	
	
}
