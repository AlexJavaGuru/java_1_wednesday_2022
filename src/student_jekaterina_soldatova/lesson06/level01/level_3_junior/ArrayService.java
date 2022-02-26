package student_jekaterina_soldatova.lesson06.level01.level_3_junior;

class ArrayService {
    boolean ArrayIncludesNumber(int[] arrayToCheck, int numberToCheck){
        for (int i: arrayToCheck) {
            if (i == numberToCheck) {
                return true;
            }
        }
        return false;
    }
    int CountArrayIncludesNumber(int[] arrayToCheck, int numberToCheck){
        int numberOfTimes = 0;
        for (int i: arrayToCheck) {
            if (i == numberToCheck) {
                numberOfTimes++;
            }
        }
        return numberOfTimes;
    }
}
