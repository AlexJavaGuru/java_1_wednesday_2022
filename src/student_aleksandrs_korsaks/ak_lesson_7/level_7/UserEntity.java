package student_aleksandrs_korsaks.ak_lesson_7.level_7;

import java.util.Objects;

class UserEntity {

    private long id;
    private String userName;
    private String userSurname;
    private String personalCode;
//    private static final AtomicInteger COUNTER = new AtomicInteger(1);

    UserEntity(String userName, String userSurname, String personalCode) {
//        this.id = COUNTER.getAndIncrement();
        this.userName = userName;
        this.userSurname = userSurname;
        this.personalCode = personalCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity that)) return false;
        return getId() == that.getId() && Objects.equals(getUserName(), that.getUserName()) && Objects.equals(getUserSurname(), that.getUserSurname()) && Objects.equals(getPersonalCode(), that.getPersonalCode());
    }

    @Override
    public String toString() {
        return  "\n" + "User ID = " + id +
                ", Name = '" + userName + '\'' +
                ", Surname = '" + userSurname + '\'' +
                ", Personal Code = '" + personalCode + '\'' + "\n";
    }
}
