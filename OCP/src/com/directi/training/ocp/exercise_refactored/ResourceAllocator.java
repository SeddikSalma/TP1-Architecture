package com.ocp.exercise_refacto;

public abstract class ResourceAllocator {
    public int allocate() {
        int resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(int resourceId) {
        markSlotFree(resourceId);
    }

   
}
