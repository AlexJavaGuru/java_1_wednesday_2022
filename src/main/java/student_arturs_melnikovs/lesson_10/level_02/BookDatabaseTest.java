package student_arturs_melnikovs.lesson_10.level_02;


import student_arturs_melnikovs.lesson_10.level_03.*;

import java.util.*;

class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabaseTest tester = new BookDatabaseTest();
        tester.testDeleteBook1();
        tester.testDeleteBook2();
        tester.testDeleteBook3();
        tester.testDeleteBook4();
        tester.testFindById1();
        tester.testFindById2();
        tester.testFindByAuthor1();
        tester.testFindByAuthor2();
        tester.testFindByTitle1();
        tester.testFindByTitle2();
        tester.testCountAllBooks1();
        tester.testCountAllBooks2();
        tester.testCountAllBooks3();
        tester.testDeleteByAuthor1();
        tester.testDeleteByTitle1();
        tester.testFindCriteria1();
        tester.testFindCriteria2();
        tester.testFindCriteria3();
        tester.testFindCriteria4();
        tester.testFindCriteria5();
        tester.testFindUniqueAuthors1();
        tester.testFindUniqueAuthors2();
        tester.testFindUniqueTitle1();
        tester.testFindUniqueTitle2();
        tester.testFindUniqueBooks1();
        tester.testFindUniqueBooks2();
        tester.testContains1();
        tester.testContains2();
        tester.testGetAuthorToBooksMap1();
        tester.testGetEachAuthorBookCount1();
    }

    private void testGetEachAuthorBookCount1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "a");
        Book book2 = new Book("1", "b");
        Book book3 = new Book("1", "c");
        Book book4 = new Book("2", "d");
        Book book5 = new Book("2", "e");
        Book book6 = new Book("3", "f");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("1", 3);
        expected.put("2", 2);
        expected.put("3", 1);
        checkResult(expected.equals(bookDatabase.getEachAuthorBookCount()));
    }

    private void testGetAuthorToBooksMap1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "a");
        Book book2 = new Book("1", "b");
        Book book3 = new Book("1", "c");
        Book book4 = new Book("2", "d");
        Book book5 = new Book("2", "e");
        Book book6 = new Book("2", "f");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);
        Map<String, List<Book>> expected = new HashMap<>();
        List<Book> firstAuthor = new ArrayList<>(Arrays.asList(book1, book2, book3));
        List<Book> secondAuthor = new ArrayList<>(Arrays.asList(book4, book5, book6));
        expected.put("1", firstAuthor);
        expected.put("2", secondAuthor);
        checkResult(expected.equals(bookDatabase.getAuthorToBooksMap()));
    }

    private void testContains2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "1");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        checkResult(!bookDatabase.contains(book3));
    }

    private void testContains1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        checkResult(bookDatabase.contains(book1));
    }

    private void testFindUniqueBooks2() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Set<Book> expected = new HashSet<>();
        checkResult(expected.equals(bookDatabase.findUniqueBooks()));
    }

    private void testFindUniqueBooks1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("3", "1");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Set<Book> expected = new HashSet<>();
        expected.add(book1);
        expected.add(book2);
        checkResult(expected.equals(bookDatabase.findUniqueBooks()));
    }

    private void testFindUniqueTitle2() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("3", "1");
        Book book3 = new Book("4", "1");
        Book book4 = new Book("2", "1");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Set<String> expected = new HashSet<>();
        expected.add("1");
        checkResult(expected.equals(bookDatabase.findUniqueTitles()));
    }

    private void testFindUniqueTitle1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("1", "2");
        Book book3 = new Book("1", "3");
        Book book4 = new Book("2", "1");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Set<String> expected = new HashSet<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        checkResult(expected.equals(bookDatabase.findUniqueTitles()));
    }

    private void testFindUniqueAuthors2() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("1", "2");
        Book book3 = new Book("1", "3");
        Book book4 = new Book("1", "4");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Set<String> expected = new HashSet<>();
        expected.add("1");
        checkResult(expected.equals(bookDatabase.findUniqueAuthors()));
    }

    private void testFindUniqueAuthors1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("1", "2");
        Book book3 = new Book("3", "3");
        Book book4 = new Book("2", "1");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Set<String> expected = new HashSet<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        checkResult(expected.equals(bookDatabase.findUniqueAuthors()));
    }

    private void testFindCriteria5() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        SearchCriteria titleCriteria = new TitleSearchCriteria("1");
        SearchCriteria authorCriteria = new AuthorSearchCriteria("3");
        SearchCriteria orCriteria = new OrSearchCriteria(titleCriteria, authorCriteria);
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "1");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book3);
        checkResult(expected.equals(bookDatabase.find(orCriteria)));
    }

    private void testFindCriteria4() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        SearchCriteria titleCriteria = new TitleSearchCriteria("1");
        SearchCriteria authorCriteria = new AuthorSearchCriteria("3");
        SearchCriteria andCriteria = new AndSearchCriteria(titleCriteria, authorCriteria);
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "1");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        checkResult(expected.equals(bookDatabase.find(andCriteria)));
    }

    private void testFindCriteria3() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        SearchCriteria yearCriteria = new YearOfIssueSearchCriteria("2000");
        Book book1 = new Book("1", "1", "2000");
        Book book2 = new Book("2", "2", "2001");
        Book book3 = new Book("3", "1", "2000");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book3);
        checkResult(expected.equals(bookDatabase.find(yearCriteria)));
    }

    private void testFindCriteria2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        SearchCriteria titleCriteria = new TitleSearchCriteria("1");
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "1");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book3);
        checkResult(expected.equals(bookDatabase.find(titleCriteria)));
    }

    private void testFindCriteria1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        SearchCriteria authorCriteria = new AuthorSearchCriteria("1");
        Book book1 = new Book("1", "1");
        Book book2 = new Book("1", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        checkResult(expected.equals(bookDatabase.find(authorCriteria)));

    }

    private void testDeleteByTitle1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("1", "2");
        Book book3 = new Book("3", "3");
        Book book4 = new Book("2", "1");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        expected.add(book3);
        bookDatabase.deleteByTitle("1");
        checkResult(expected.equals(bookDatabase.getMyBooks()));
    }

    private void testDeleteByAuthor1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("1", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        bookDatabase.deleteByAuthor("1");
        checkResult(expected.equals(bookDatabase.getMyBooks()));
    }

    private void testCountAllBooks3() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.delete(book1);
        checkResult(bookDatabase.countAllBooks() == 2);
    }

    private void testCountAllBooks2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        checkResult(bookDatabase.countAllBooks() == 0);
    }

    private void testCountAllBooks1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        checkResult(bookDatabase.countAllBooks() == 3);
    }

    private void testFindByTitle2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        checkResult(expectedResult.equals(bookDatabase.findByTitle("4")));
    }

    private void testFindByTitle1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "1");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        checkResult(expectedResult.equals(bookDatabase.findByTitle("1")));
    }

    private void testFindByAuthor2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        checkResult(expectedResult.equals(bookDatabase.findByAuthor("4")));
    }

    private void testFindByAuthor1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("1", "2");
        Book book3 = new Book("2", "3");
        Book book4 = new Book("1", "4");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book4);
        checkResult(expectedResult.equals(bookDatabase.findByAuthor("1")));
    }

    private void testFindById2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Optional<Object> expectedResult = Optional.empty();
        Optional<Book> actualResult = bookDatabase.findById(4L);
        checkResult(expectedResult.equals(actualResult));
    }

    private void testFindById1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Optional<Book> expectedResult = Optional.of(book1);
        Optional<Book> actualResult = bookDatabase.findById(1L);
        checkResult(expectedResult.equals(actualResult));
    }

    private void testDeleteBook1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        checkResult(bookDatabase.delete(1L));
    }
    private void testDeleteBook2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        checkResult(!bookDatabase.delete(4L));
    }
    private void testDeleteBook3() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        checkResult(bookDatabase.delete(book1));
    }
    private void testDeleteBook4() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        checkResult(!bookDatabase.delete(book3));
    }

    private void checkResult(Boolean actualResult) {
        if (actualResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has FAILED");
        }
    }
}