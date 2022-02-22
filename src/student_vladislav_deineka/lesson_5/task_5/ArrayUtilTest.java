package student_vladislav_deineka.lesson_5.task_5;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldPrintArray();
        test.shouldFindMinNumber();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = arrayUtil.createArray(5);
        if (array.length == 5) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        array[0] = 5;
        array[1] = 4;
        array[2] = 3;
        array[3] = 2;
        array[4] = 1;

        if (arrayUtil.findMinNumber(array) == 1) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);

        array[0] = 5;
        array[1] = 4;
        array[2] = 3;
        array[3] = 2;
        array[4] = 1;

        if (arrayUtil.findMaxNumber(array) == 1) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

}
