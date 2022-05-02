package teacher.lesson_9_interfaces.lessoncode.boxexample;

public class ShopService {

    WarehouseService warehouseService;

    public ShopService(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    public void putItem(Item item) {
        warehouseService.putIntoTheBox(item);
    }

    public void applySorting() {
        warehouseService.sorting();
    }
}
