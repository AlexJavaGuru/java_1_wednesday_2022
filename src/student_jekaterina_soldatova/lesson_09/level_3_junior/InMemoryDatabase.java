package student_jekaterina_soldatova.lesson_09.level_3_junior;

class InMemoryDatabase implements ProductDatabase {

    Product[] productArray;

    InMemoryDatabase(Product[] productArray){
        this.productArray = productArray;
    }

    @Override
    public void save(Product product) {
        Product[] newArrayOfProducts = new Product[productArray.length+1];
        System.arraycopy(productArray, 0, newArrayOfProducts, 0, productArray.length);
        newArrayOfProducts[newArrayOfProducts.length-1] = product;
        productArray = newArrayOfProducts;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product: productArray) {
            if (productTitle.equalsIgnoreCase(product.getTitle())) {
                return product;
            }
        }
        return null;
    }

}
