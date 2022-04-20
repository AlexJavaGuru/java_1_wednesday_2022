package student_aleksandrs_jakovenko.lesson_7.level_6;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int arraySize = countNumbers(in, numberFrom, numberTo);
        int[] arrayCopy = createArray(arraySize);
        if (checkNumbersInArray(in, numberFrom,numberTo) == false) {
            return new int[0];
        }

        int indexOfArrayCopy = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                arrayCopy[indexOfArrayCopy] = in[i];
                indexOfArrayCopy++;
            }
        }
        return arrayCopy;
    }

    int[] createArray(int arraySize) {
        return new int[arraySize];
    }

    boolean checkNumbersInArray(int[] in, int numberFrom, int numberTo) {
        for (int i = 0; i < in.length; i++) {
            if (i >= numberFrom && i <= numberTo) {
                return true;
            }
        }
        return false;
    }

    int countNumbers(int[] in, int numbersFrom, int numbersTo) {
        int count = 0;
        for (int i : in) {
            if (i >= numbersFrom && i <= numbersTo) {
                count++;
            }
        }
        return count;
    }


}
