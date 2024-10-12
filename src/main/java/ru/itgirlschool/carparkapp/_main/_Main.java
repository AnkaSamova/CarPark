package ru.itgirlschool.carparkapp._main;

import ru.itgirlschool.carparkapp.entity.Car;

public class _Main {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "sky");
        Car car2 = new Car();
        car2.brand = "Mazda";
        car2.color = "red";
        Car car3 = new Car("Tesla", "metallic");
        System.out.println("Машина марки " + car1.brand + " имеет цвет " + car1.color);
        System.out.println("Машина марки " + car2.brand + " имеет цвет " + car2.color);
        System.out.println("Машина марки " + car3.brand + " имеет цвет " + car3.color);
    }
}