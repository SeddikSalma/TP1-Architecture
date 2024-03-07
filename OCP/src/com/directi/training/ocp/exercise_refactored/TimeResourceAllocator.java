package com.ocp.exercise_refacto;

public class TimeResourceAllocator extends Resource {
    @Override
    protected int findFreeSlot() {
        return 0;
    }

    @Override
    protected void markSlotBusy(int resourceId) {
        // code core
    }

    @Override
    protected void markSlotFree(int resourceId) {
       // code core
    }
}
