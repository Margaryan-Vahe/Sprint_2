package ru.yandex.practicum.model;

import ru.yandex.practicum.model.constants.Colour;
import ru.yandex.practicum.model.constants.Discount;

public class Apple extends Food implements Discountable{
    String colour;

    public Apple(int amount, double price, String colour){
        super(amount, price, true);
        this.colour = colour;
    }
    @Override
    public double getDiscount(){
        if (Colour.RED.equals(colour)) {
            return Discount.RED_APPLE;
        } else {
            return Discount.NONE;
        }
    }
}
