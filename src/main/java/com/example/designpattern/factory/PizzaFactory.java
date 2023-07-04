package com.example.designpattern.factory;

public class PizzaFactory {
    public static Pizza createPizza(String type){
        Pizza p = null;
        if(type.equals("cheese")){
            p = new CheesePizza();
        } else if (type.equals(" Meet")){
            p = new MeetPizza();
        }
        return p;
    }
}
