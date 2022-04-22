package student_nadezda_travkina.lesson3.level7;

public class CatDemo {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Barsik", 3, "British Shorthair");
        String name = firstCat.getName();
        int age = firstCat.getAge();
        String breed = firstCat.getBreed();
        System.out.println("Cat name is " + name + "\n" + "Cat age is " + age + "\n" + "Cat breed is " + breed);
    }

}

