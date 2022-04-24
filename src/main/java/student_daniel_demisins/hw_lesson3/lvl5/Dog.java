package student_daniel_demisins.hw_lesson3.lvl5;

public class Dog {
    String name;
    int age;
    String color;




    public Dog(){}


    public void getVoice(){
        System.out.println(name+ " " +name+ " " +name);
        System.out.println(age);
        System.out.println(color);




    }

    public Dog(String name, int age, String color){
        this.name= name;
        this.age= age;
        this.color= color;

    }


    public void happyBirthday(){
        this.age= age+1;
    }

    public void changeColor(String newColor){
        this.color= newColor;



    }

}
