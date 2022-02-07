package student_aleksejs_iljins.lesson_03.level_7;
//Task 29
class Table {
    int height;
    int width;
    int length;

    public Table(int height, int width, int length){
        this.height = height;
        this.width = width;
        this.length = length;
    }
    void setHeight(){
        System.out.println("Высота стола: " + height + " см");
    }
    void setWidth(){
        System.out.println("Ширина стола: " + width + " см");
    }
    void setLength(){
        System.out.println("Длина стола: " + length + " см");
    }
    int getResult(){
        return length * width;
    }
}
