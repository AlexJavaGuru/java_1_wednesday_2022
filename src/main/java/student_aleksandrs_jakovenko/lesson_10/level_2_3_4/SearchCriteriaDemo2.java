package student_aleksandrs_jakovenko.lesson_10.level_2_3_4;

public class SearchCriteriaDemo2 {

    public static void main(String[] args) {

        SearchCriteria searchCriteria = new SearchCriteria() {
            @Override
            public boolean match(Book book) {
                System.out.println("Hello from match method");
                System.out.println(book.getAuthor() + " " + book.getTitle());
                return false;
            }
        };


        searchCriteria.match(new Book("A", "B"));
    }
}
