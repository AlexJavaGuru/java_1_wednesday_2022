package teacher.lesson_9_interfaces.lessoncode.boxexample;

public class Application {

    public static void main(String[] args) {

        WarehouseService warehouseService = new WarehouseServiceFastImpl();
        ShopService shopService = new ShopService(warehouseService);

        shopService.putItem(new Item());
        shopService.applySorting();
    }
}
