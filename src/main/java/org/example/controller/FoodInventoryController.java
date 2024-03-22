package org.example.controller;

import org.example.model.FoodInventory;
import org.example.service.FoodInventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 食物库存
 */
@RestController
@RequestMapping("/foodInventory")
public class FoodInventoryController {
    private final FoodInventoryService foodInventoryService;

    public FoodInventoryController(FoodInventoryService foodInventoryService) {
        this.foodInventoryService = foodInventoryService;
    }

    @PostMapping
    public List<FoodInventory> getAllFoodInventory() {
        return foodInventoryService.getAllFoodInventory();
    }

    @PostMapping("/{foodItem}")
    public FoodInventory getFoodInventoryByFoodItem(@PathVariable String foodItem){
        return foodInventoryService.getFoodInventoryByFoodItem(foodItem);
    }

    @PostMapping("/add")
    public void addFoodInventory(@RequestBody FoodInventory foodInventory) {
        foodInventoryService.addFoodInventory(foodInventory);
    }

    @PostMapping("/reduce")
    public void reduceFoodInventoryQuantity(@RequestBody FoodInventory foodInventory) {
        foodInventoryService.reduceFoodInventoryQuantity(foodInventory);
    }
}
