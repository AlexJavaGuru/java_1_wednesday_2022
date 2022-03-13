package student_arturs_melnikovs.lesson_07.level_07;

import java.util.Objects;

class UserEntity {
    private int id;
    private String firstName;
    private String lastName;
    private String personalCode;

    public UserEntity(int id, String firstName, String lastName, String personalCode) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalCode = personalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id && firstName.equals(that.firstName) && lastName.equals(that.lastName);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }
}
