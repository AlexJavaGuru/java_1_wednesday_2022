package student_andrejs_saldavs.lesson_07.level_7;

import java.util.Objects;

class UserEntity {

    private long id;
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
        return id == that.id && personalCode == that.personalCode && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }
}
