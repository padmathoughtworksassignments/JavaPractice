package org.example;

import java.util.List;

public class VehicleDaoImpl implements  VehicleDao{
    VehicleDaoImpl ()

    @Override
    public boolean add(Vehicle vehicle) {
        return false;
    }

    @Override
    public Vehicle findByCode(int code) {
        return null;
    }

    @Override
    public List<Vehicle> findAll() {
        return List.of();
    }

    @Override
    public List<Vehicle> findByName(String Name) {
        return List.of();
    }

    @Override
    public List<Vehicle> findByBrand(String Brand) {
        return List.of();
    }

    @Override
    public List<Vehicle> findByColor(String Color) {
        return List.of();
    }

    @Override
    public List<Vehicle> findByModel(String Model) {
        return List.of();
    }

    @Override
    public List<Vehicle> findByCostRange(double min, double max) {
        return List.of();
    }

    @Override
    public List<Vehicle> findByFuel(String Fuel) {
        return List.of();
    }
}
