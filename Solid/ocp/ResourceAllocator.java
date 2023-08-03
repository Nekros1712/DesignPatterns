package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */

interface Resource {
    int findFreeSlot();
    void markSlotBusy(int resourceId);
    void markSlotFree(int resourceId);
}

class TimeResource implements Resource {

    @Override
    public int findFreeSlot() { return 0; }

    @Override
    public void markSlotBusy(int resourceId) {}

    @Override
    public void markSlotFree(int resourceId) {}
}

class SpaceResource implements Resource {

    @Override
    public int findFreeSlot() { return 0; }

    @Override
    public void markSlotBusy(int resourceId) {}

    @Override
    public void markSlotFree(int resourceId) {}
}

public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource) {
        int resourceId = resource.findFreeSlot();
        resource.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(Resource resource, int resourceId) {
        resource.markSlotFree(resourceId);
    }
}
