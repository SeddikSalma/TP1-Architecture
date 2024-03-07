package com.lsp.exercise_refacto;

public class Pool {
    public void run() {
        Duck donaldDuck = new Duck();
        
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
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
