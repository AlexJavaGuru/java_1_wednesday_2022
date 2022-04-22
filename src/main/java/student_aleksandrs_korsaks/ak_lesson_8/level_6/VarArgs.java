package student_aleksandrs_korsaks.ak_lesson_8.level_6;

class VarArgs {
    static VarArgs varArgs = new VarArgs();

    public static void main(String[] args) {
        System.out.println(varArgs.calculatePerimeter(5));
        System.out.println(varArgs.calculatePerimeter(5, 10));
        System.out.println(varArgs.calculatePerimeter());
    }

    int calculatePerimeter(int... sideN) {
        int sidesQuantityOfShape = sideN.length;
        if (sidesQuantityOfShape != 0) {
            if (sidesQuantityOfShape == 1) {
                System.out.print("Perimeter of square is ");
                return 4 * sideN[0];
            } else if (sidesQuantityOfShape == 2) {
                System.out.print("Perimeter of rectangle is ");
                return 2 * (sideN[0] + sideN[1]);
            }
        }
        return 0;
    }
}

