package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.FoodInventory;

import java.util.List;

@Mapper
public interface FoodInventoryMapper {
    List<FoodInventory> getAllFoodInventory();

    FoodInventory getFoodInventoryByFoodItem(String foodItem);

    void addFoodInventory(FoodInventory foodInventory);

    void updateFoodInventoryQuantity(FoodInventory foodInventory);

    void reduceFoodInventoryQuantity(FoodInventory foodInventory);
}
