package student_aleksandrs_korsaks.ak_lesson_9.level_3;

class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                '}';
    }
}
