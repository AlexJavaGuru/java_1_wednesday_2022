package student_aleksandrs_korsaks.ak_lesson_7.level_6;

class ArrayCopy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] out = new int[sizeOfArray(in, numberFrom, numberTo)];
        int j = 0;
        for (int i = 0; i < in.length; i++) {
            if ((in[i] >= numberFrom) && (in[i] <= numberTo)) {
                out[j] = in[i];
                j++;
            }
        }
        return out;
    }

    private int sizeOfArray(int[] in, int numberFrom, int numberTo) {
        int counter = 0;
        for (int i : in) {
            if ((i >= numberFrom) && (i <= numberTo)) {
                counter++;
            }
        }
        return counter;
    }
}
