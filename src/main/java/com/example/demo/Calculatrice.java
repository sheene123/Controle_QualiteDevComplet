package com.example.demo;

public class Calculatrice {
    String marque;
    public float add(float operande1, float operande2){
        return operande1 + operande2;
    }
    public float div(float numerateur, float denominateur) {
        if(denominateur == 0){
            throw new ArithmeticException("Div par O");
        }
        return numerateur / denominateur;
    }
    public float mult(float operande1, float operande2){
        return operande1 * operande2;
    }
}
