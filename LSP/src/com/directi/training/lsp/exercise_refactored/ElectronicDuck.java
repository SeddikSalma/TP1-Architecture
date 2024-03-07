package com.lsp.exercise_refacto;

public class ElectronicDuck {
    private boolean on = false;

    @Override
    public void quack() {
        if (on) {
            System.out.println("Electronic duck quack...");
        }
    }

    @Override
    public void swim() {
        if (on) {
            System.out.println("Electronic duck swim");
        }
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }
}
