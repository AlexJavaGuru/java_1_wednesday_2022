package student_arturs_melnikovs.lesson_08.level_06;

class VarargsExample {

    public int sumOfAllNumbers(int ... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        VarargsExample varargsExample = new VarargsExample();
        System.out.println(varargsExample.sumOfAllNumbers(2, 4, 5, 10));
    }
}
