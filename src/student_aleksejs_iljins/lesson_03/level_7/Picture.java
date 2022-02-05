package student_aleksejs_iljins.lesson_03.level_7;

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
    public int setYear(){
        System.out.println("Год написания картины: " + year);
        return year;
    }
    public void setAuthor(){
        System.out.println("Автор картины: " + author);
    }
}
