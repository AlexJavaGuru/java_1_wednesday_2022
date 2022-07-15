package student_aleksandrs_korsaks.ak_lesson_12.level_5_6;

import java.util.Objects;

public class Product {

    private String title;
    private Integer price;
    private String description;

    public Product(String title, Integer price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getTitle().equals(product.getTitle()) && getPrice().equals(product.getPrice()) && getDescription().equals(product.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getPrice(), getDescription());
    }

    @Override
    public String toString() {
        return "Product{" +
                "title = '" + title + '\'' +
                ", price = " + price +
                ", description = '" + description + '\'' +
                '}';
    }
}
