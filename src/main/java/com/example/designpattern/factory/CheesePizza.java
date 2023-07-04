package com.example.designpattern.factory;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
    System.out.println("preparing cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("Backing cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting cheese pizza");
    }
}
