package com.lsp.exercise_refacto;

public class ElectronicPool {
    public void run() {
       ;
        Duck electricDuck = new ElectronicDuck();
        quack(electricDuck, electricDuck);
        swim(electricDuck, electricDuck);
    }

    private void quack(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
