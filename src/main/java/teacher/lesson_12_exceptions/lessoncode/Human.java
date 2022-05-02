package teacher.lesson_12_exceptions.lessoncode;

public class Human {

    private String personalNumber;
    private String name;
    private int age;
    private String sex;
    private double height;
    private double weight;
    private String nationality;




    public static class Builder {

        private String personalNumber;
        private String name;
        private int age;
        private String sex;
        private double height;
        private double weight;
        private String nationality;

        public Builder(String personalNumber) {
            this.personalNumber = personalNumber;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder withHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder withWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder withNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Human build() {
            Human human = new Human();
            human.personalNumber = this.personalNumber;
            human.name = this.name;
            human.age = this.age;
            human.sex = this.sex;
            human.height = this.height;
            human.weight = this.weight;
            human.nationality = this.nationality;
            return human;
        }
    }
}
