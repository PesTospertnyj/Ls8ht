package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {

    public static String mark = "Toyota";
    public static String clas_aut = "S class";
    public static float weight = 1587.3f;


    public static void main(String[] args) {
        Driver driver = new Driver();
        Engine engine = new Engine();
        String fullName = driver.getFullName();
        int experience = driver.getExperience();
        int power = engine.getPower();
        String manufacturer = engine.getManufacturer();
        Car.start();
        Car.stop();
        Car.turnRight();
        Car.turnLeft();

        getInfo(fullName, experience, power, manufacturer);
    }

    private static void getInfo(String fullName, int experience, int power, String manufacturer) {
        System.out.println(fullName + " experience is " + experience + " years and power of auto is " + power + " manufacturer: " + manufacturer);
    }

    private static void start() {
        System.out.println("Поехали! :) ");
    }

    private static void stop() {
        System.out.println("Останавливаемся! :( ");
    }

    private static void turnRight() {
        System.out.println("Поворот направо!");
    }

    private static void turnLeft() {
        System.out.println("Поворот налево!");
    }
}
