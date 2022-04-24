package student_aleksejs_iljins.lesson_03.level_1;

class Robot {
     String name;
     String model;

     public void sayHello(){
         System.out.println("Hello!");
     }

     public Robot(String name, String model){
         this.name = name;
         this.model = model;
     }
     public void sayYourName(){
         System.out.println("My name is " + this.name);
     }
     public void modelNumber(){
         System.out.println("Model number: " + this.model);
     }
}