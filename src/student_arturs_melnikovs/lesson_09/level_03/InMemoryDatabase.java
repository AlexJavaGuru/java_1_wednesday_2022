package student_arturs_melnikovs.lesson_09.level_03;


class InMemoryDatabase implements ProductDatabase {

    Product[] products = new Product[0];

    public Product[] getProducts() {
        return products;
    }

    @Override
    public void save(Product product) {
        Product[] temp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }
        temp[temp.length-1] = product;
        products = temp;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }

}
