package org.example;

public class Vehicle
{
    private int code;
    private String name;
    private String brand;
    private String model;
    private String color;
    private String cost;
    private String fuel;

    public Vehicle(int code, String name, String brand, String model, String color, String cost, String fuel) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.cost = cost;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cost='" + cost + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}

