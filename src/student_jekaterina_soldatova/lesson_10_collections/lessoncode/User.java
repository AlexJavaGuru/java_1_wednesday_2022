package student_jekaterina_soldatova.lesson_10_collections.lessoncode;

import java.util.Objects;

public class User {

    private String name;
    private Long code;

    public User(String name, Long code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(code, user.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code);
    }
}
