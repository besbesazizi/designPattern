package com.example.designpattern.factory;

public class VeggiePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("preparing Veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("Backing Veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Veggie pizza");
    }
}
