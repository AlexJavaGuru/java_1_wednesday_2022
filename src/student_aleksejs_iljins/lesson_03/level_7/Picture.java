package student_aleksejs_iljins.lesson_03.level_7;
//Task 29
class Picture {
    String name;
    int year;
    String author;

    public Picture(String name, int year, String author){
        this.name = name;
        this.year = year;
        this.author = author;
    }
    public void setName(){
        System.out.println("Название картины: " + name);
    }
    public void setYear(){
        System.out.println("Год написания картины: " + year);
    }
    public void setAuthor(){
        System.out.println("Автор картины: " + author);
    }
}
