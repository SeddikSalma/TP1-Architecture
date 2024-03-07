package com.ocp.exercise_refacto;

public abstract class Resource {
    public int allocate() {
        int resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
    };

    public void free(int resourceId) {

        markSlotFree(resourceId);
    };

    abstract void markSlotFree(int resourceId);

    abstract int findFreeSlot();

    abstract void markSlotBusy(int resourceId);

}