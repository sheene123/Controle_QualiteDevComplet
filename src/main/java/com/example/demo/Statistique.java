package com.example.demo;

public class Statistique {
    Calculatrice calculatrice = new Calculatrice();
    public float moyenne(float x, float y){
        return calculatrice.div(
                calculatrice.add(x, y),
                2);
    }
}
