package com.isp.exercise_refactored;

public class TimedDoor implements IDoor {
    private static final int TIME_OUT = 100;
    private boolean locked;
    private boolean opened;

    public TimedDoor(Timer timer) {
        timer.register(TIME_OUT, this);
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
        if (!locked) {
            opened = true;
        }
    }

    @Override
    public void close() {
        opened = false;
    }
     @Override
    public void timeOutCallback() {
        _locked = true;
    }
    
}
