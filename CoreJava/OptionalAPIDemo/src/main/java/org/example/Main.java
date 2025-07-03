package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.of("Sam");

        String city = null;
        Optional<String> optionalCity = Optional.ofNullable(city);

        Optional<String> emptyName = Optional.empty();
        if (optionalName.isPresent())
        {
            System.out.println("Name is present : " + optionalName.get());
        }

        optionalName.ifPresent(name-> System.out.println("Name : " + name));

        String defaultName = emptyName.orElse("Guest");
        System.out.println("Default Name : " + defaultName);

        String generateName = optionalCity.orElseGet(()->"Unknown City");
        System.out.println("Generate Name : " + generateName);

        String requiredName = emptyName.orElseThrow(()-> new IllegalStateException("Name not found"));
        System.out.println("Required Name : " + requiredName);
    }
}