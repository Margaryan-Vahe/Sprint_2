package ru.yandex.practicum;

import ru.yandex.practicum.model.Food;
import ru.yandex.practicum.model.Meat;
import ru.yandex.practicum.model.Apple;
import ru.yandex.practicum.model.constants.Colour;
import ru.yandex.practicum.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100.0);
        Apple redApple = new Apple(10, 50.0, Colour.RED);
        Apple greenApple = new Apple(8, 60.0, Colour.GREEN);

        Food[] products = new Food[] { meat, redApple, greenApple };
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getVegetarianTotalWithoutDiscount());
    }
}
