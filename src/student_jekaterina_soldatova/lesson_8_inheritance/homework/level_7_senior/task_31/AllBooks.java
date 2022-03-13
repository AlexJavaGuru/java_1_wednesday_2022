package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

class AllBooks {
    String[][][] arrayOfBooks = new String[][][] {
            {{"Stephen King"},{
                    "The Mist",
                    "The Shining",
                    "Pet Sematary"}
            },
            {{"Jane Austen"}, {
                "Pride and Prejudice"}
            },
            {{"J. K. Rowling"}, {
                    "Harry Potter and the Philosopher's Stone",
                    "Harry Potter and the Chamber of Secrets",
                    "Harry Potter and the Prisoner of Azkaban",
                    "Harry Potter and the Goblet of Fire",
                    "Harry Potter and the Order of the Phoenix",
                    "Harry Potter and the Half-Blood Prince",
                    "Harry Potter and the Deathly Hallows"}
            }
    };


    void printAll(){
        for (int i = 0; i < arrayOfBooks.length; i++) {
            System.out.println(arrayOfBooks[i][0][0] + ":");
            for (int j = 0; j < arrayOfBooks[i][1].length; j++) {
                System.out.println("\t" + arrayOfBooks[i][1][j]);
            }
        }
    }

}
