package ru.yandex.practicum.service;

import ru.yandex.practicum.model.Discountable;
import ru.yandex.practicum.model.Food;

public class ShoppingCart {
    public Food[] items;
    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalWithoutDiscount() {
        double sum = 0;
        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            sum += item.getPrice() * item.getAmount();
        }
        return sum;
    }

    public double getTotalWithDiscount() {
        double sum = 0;
        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            double base = item.getPrice() * item.getAmount();
            double discountPercent = 0;
            discountPercent = ((Discountable) item).getDiscount();
            sum += base * (100 - discountPercent) / 100;
        }
        return sum;
    }

    public double getVegetarianTotalWithoutDiscount() {
        double sum = 0;
        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            if (item.isVegetarian()) {
                sum += item.getPrice() * item.getAmount();
            }
        }
        return sum;
    }
}
