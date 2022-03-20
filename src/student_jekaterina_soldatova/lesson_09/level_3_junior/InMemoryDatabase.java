package student_jekaterina_soldatova.lesson_09.level_3_junior;

class InMemoryDatabase implements ProductDatabase {

    static Product[] createArray(int length) {
        Product[] productArray = new Product[length];
        return productArray;
    }

    @Override
    public void save(Product product, Product[] arrayOfProducts) {
        Product[] newArrayOfProducts = new Product[arrayOfProducts.length+1];
        newArrayOfProducts[newArrayOfProducts.length-1] = product;
        arrayOfProducts = newArrayOfProducts;
    }

    @Override
    public Product findByTitle(String productTitle) {
        return null;
    }

    static void copyProductToArray(Product product) {

    }
}
