package com.example.designpattern.factory;

public class MeetPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("preparing Meet pizza");
    }

    @Override
    public void bake() {
        System.out.println("Backing Meet pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Meet pizza");
    }
}
