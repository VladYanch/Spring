package com.example.springcalc;

import org.springframework.beans.factory.annotation.Value;

public class Calculate {


    private int a;
//    @Value(value = "5")
    private int b;

    private int result;
    private String operation;

    @Value(value = "2")
    public void setA(int a) {
        this.a = a;
    }

    @Value(value = "3")
    public void setB(int b) {
        this.b = b;
    }

    @Value(value = "aa")
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getResult() {
        return result;
    }

    public String getOperation() {
        return operation;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
