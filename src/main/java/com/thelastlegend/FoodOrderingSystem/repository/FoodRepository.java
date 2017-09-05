package com.thelastlegend.FoodOrderingSystem.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thelastlegend.FoodOrderingSystem.model.FoodOrder;


@Repository
public interface FoodRepository extends JpaRepository<FoodOrder, Integer>{

	//List<FoodOrder> findByName(String iName);

	//List<FoodOrder> findOne(String iName);

	List<FoodOrder> findByItemName(String iName);

	

}
