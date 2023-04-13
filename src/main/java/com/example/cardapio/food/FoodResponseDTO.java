package com.example.cardapio.food;

public record FoodResponseDTO(Long id, String title, String img, Integer price) {

    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImg(), food.getPrice());
    }
}
