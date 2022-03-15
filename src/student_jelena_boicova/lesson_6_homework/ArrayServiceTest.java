package student_jelena_boicova.lesson_6_homework;

import java.util.Objects;

public class ArrayServiceTest {

    public static void main(String[] args){
        ArrayServiceTest test = new ArrayServiceTest();
        test.testSearchNumber();
        test.testNotSearchNumber();
        test.testCountOccurrences();
        test.testCountOccurrencesNegative();
        test.testReplaceFirst();
        test.testNotReplaceFirst();
        test.testReplaceAll();
        test.testNotReplaceAll();
        test.testRevert();

    }

    public void testSearchNumber(){
        ArrayService test = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        boolean actualResult = test.searchNumber(array,4);
        if (actualResult){
            System.out.println("Searched number is found in Massive");
        } else {
            System.out.println("Searched number is not found in Massive");
        }
    }

    public void testNotSearchNumber(){
        ArrayService test = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        boolean actualResult = test.searchNumber(array,37);
        if (actualResult){
            System.out.println("Searched number is found in Massive");
        } else {
            System.out.println("Searched number is not found in Massive");
        }
    }

    public void testCountOccurrences(){
        ArrayService test = new ArrayService();
        int[] array = {4, 8, 7, 5, 7};
        int expectedResult = 7;
        int actualResult = test.countOccurrences(array, 7);
        if (expectedResult == actualResult){
            System.out.println(expectedResult + "Occurrences OK");
        } else {
            System.out.println(expectedResult + "Occurrences FALSE");
        }
    }

    public void testCountOccurrencesNegative(){
        ArrayService test = new ArrayService();
        int[] array = {4, 8, 7, 5, 7};
        int expectedResult = 3;
        int actualResult = test.countOccurrences(array,3);
        if (expectedResult == actualResult){
            System.out.println(expectedResult + "Occurrences OK");
        } else {
            System.out.println(expectedResult + "Occurrences FALSE");
        }
    }

    public void testReplaceFirst(){
        ArrayService test = new ArrayService();
        int[] array = {2, 2, 3, 4, 5};
        int expectedResult = 2;
        boolean actualResult = test.replaceFirst(array, 2,1);
        if (actualResult){
            System.out.println(expectedResult + "First number replaced");
        } else {
            System.out.println(expectedResult + "First number not replaced");
        }
     }

     public void testNotReplaceFirst(){
         ArrayService test = new ArrayService();
         int[] array = {2, 2, 3, 4, 5};
         int expectedResult = 6;
         boolean actualResult = test.replaceFirst(array, 6,1);
         if (actualResult){
             System.out.println(expectedResult + "First number replaced");
         } else {
             System.out.println(expectedResult + "First number not replaced");
         }
     }

     public void testReplaceAll(){
         ArrayService test = new ArrayService();
         int[] array = {1, 2, 3, 2, 5};
         int expectedResult = 2;
         int actualResult = test.replaceAll(array, 2, 4 );
         if (expectedResult == actualResult){
             System.out.println(expectedResult + "All numbers replaced");
         } else {
             System.out.println(expectedResult + "All numbers not replaced");
         }
     }

     public void testNotReplaceAll(){
         ArrayService test = new ArrayService();
         int[] array = {10, 20, 30, 20, 20};
         int expectedResult = 5;
         int actualResult = test.replaceAll(array, 5, 4);
         if (expectedResult == actualResult){
            System.out.println(expectedResult + "All numbers replaced");
        } else {
            System.out.println(expectedResult + "All numbers not replaced");
        }
    }

    public void testRevert(){
        ArrayService test = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 4, 3, 2, 1};
        test.revert(array);
        if (array.equals(expectedResult)){
            System.out.println(expectedResult + "All numbers are reversed");
        } else {
            System.out.println(expectedResult + "All numbers not reversed");
        }

    }
}