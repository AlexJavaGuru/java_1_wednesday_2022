package student_arturs_melnikovs.lesson_07.level_06;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        if (!containsNumbersInRange(in, numberFrom,numberTo)) {
            System.out.println("Array doesn't contain numbers requested range");
            return new int[1];
        }
        int arrayLength = countNumbersInRange(in, numberFrom, numberTo);
        int[] arrayCopy = createArrayOfCorrectSize(arrayLength);
        int indexOfArrayCopy = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                arrayCopy[indexOfArrayCopy] = in[i];
                indexOfArrayCopy++;
            }
        }
        return arrayCopy;
    }

    private boolean containsNumbersInRange(int[] in, int numberFrom, int numberTo) {
        for (int number : in) {
            if (number >= numberFrom && number <= numberTo) {
                return true;
            }
        }
        return false;
    }

    private int countNumbersInRange(int[] in, int numbersFrom, int numbersTo) {
        int numbersInRange = 0;
        for (int number : in) {
            if (number >= numbersFrom && number <= numbersTo) {
                numbersInRange++;
            }
        }
        return numbersInRange;
    }

    private int[] createArrayOfCorrectSize(int lengthOfArray) {
        return new int[lengthOfArray];
    }
}
