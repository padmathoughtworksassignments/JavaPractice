package org.example;

import java.util.List;

public interface VehicleDao {
    boolean add (Vehicle vehicle);
    Vehicle findByCode (int code);
    List<Vehicle> findAll();
    List<Vehicle> findByName(String Name);
    List<Vehicle> findByBrand(String Brand);
    List<Vehicle> findByColor(String Color);
    List<Vehicle> findByModel(String Model);
    List<Vehicle> findByCostRange(double min, double max);
    List<Vehicle> findByFuel(String Fuel);
}
