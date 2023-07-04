package com.example.designpattern.factory;

public class PizzaStore {
    Pizza orderPizza(String type){
        Pizza p = PizzaFactory.createPizza(type);
        p.prepare();
        p.bake();
        p.cut();
        return p;
    }


}
