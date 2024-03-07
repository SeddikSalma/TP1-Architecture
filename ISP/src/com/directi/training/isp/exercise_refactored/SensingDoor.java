package com.isp.exercise_refactored;

public class SensingDoor implements ISensingDoor , IDoor {
    private boolean locked;
    private boolean opened;

    public SensingDoor(Sensor sensor) {
        sensor.register(this);
    }

    @Override
    public void lock() {
        locked = true;
    }

    @Override
    public void unlock() {
        locked = false;
    }

    @Override
    public void open() {
        if (!_ocked) {
            opened = true;
        }
    }

    @Override
    public void close() {
        opened = false;
    }

    @Override
    public void proximityCallback() {
        opened = true;
    }
}
