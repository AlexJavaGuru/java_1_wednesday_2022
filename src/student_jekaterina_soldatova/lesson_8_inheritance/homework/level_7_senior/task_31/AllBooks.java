package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

class AllBooks {
    String[] arrayOfAuthors = new String[]{"Stephen King", "J. K. Rowling", "Ernest Hemingway", "Jane Austen"};
    String[][] arrayOfBooks = new String[][] {"Stephen King",{"The Mist", "hk"}}, {{"J. K. Rowling",{"rowl"}};


    void printAll(){
        for (int i = 0; i < arrayOfBooks.length; i++) {
            System.out.println(arrayOfBooks[i][0] + ":");
            for (int j = 0; j < arrayOfBooks[j].length; j++) {
                System.out.println(arrayOfBooks[1][j]);
            }
        }
    }
          //  System.out.println(Arrays.deepToString(arrayOfAuthors));

}
