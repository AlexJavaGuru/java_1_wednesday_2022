package teacher.lesson_12_exceptions.lessoncode;

import teacher.lesson_12_exceptions.lessoncode.Human.Builder;

public class HumanDemo {

    public static void main(String[] args) {

        Builder humanBuilder = new Builder("15432532")
                .withAge(23)
                .withName("Alex")
                .withHeight(2.0);

        Human human = humanBuilder.build();

    }
}
