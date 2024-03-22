package org.example.service;

import org.example.dao.FoodInventoryMapper;
import org.example.model.FoodInventory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodInventoryService {
    private final FoodInventoryMapper foodInventoryMapper;

    public FoodInventoryService(FoodInventoryMapper foodInventoryMapper) {
        this.foodInventoryMapper = foodInventoryMapper;
    }

    public List<FoodInventory> getAllFoodInventory() {
        return foodInventoryMapper.getAllFoodInventory();
    }

    public FoodInventory getFoodInventoryByFoodItem(String foodItem) {
        return foodInventoryMapper.getFoodInventoryByFoodItem(foodItem);
    }

    public void addFoodInventory(FoodInventory foodInventory) {
        FoodInventory existingInventory = foodInventoryMapper.getFoodInventoryByFoodItem(foodInventory.getFoodItem());
        if (existingInventory != null) {
            int newQuantity = existingInventory.getQuantity() + foodInventory.getQuantity();
            existingInventory.setQuantity(newQuantity);
            foodInventoryMapper.updateFoodInventoryQuantity(existingInventory);
        } else {
            foodInventoryMapper.addFoodInventory(foodInventory);
        }
    }

    public void reduceFoodInventoryQuantity(FoodInventory foodInventory) {
        FoodInventory existingInventory = foodInventoryMapper.getFoodInventoryByFoodItem(foodInventory.getFoodItem());
        if (existingInventory != null) {
            int newQuantity = existingInventory.getQuantity() - foodInventory.getQuantity();
            existingInventory.setQuantity(newQuantity);
            foodInventoryMapper.reduceFoodInventoryQuantity(existingInventory);
        }
        // 可以添加逻辑处理，例如当食材不足时的异常处理或其他操作
    }
}