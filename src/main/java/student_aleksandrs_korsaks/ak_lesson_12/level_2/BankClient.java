package student_aleksandrs_korsaks.ak_lesson_12.level_2;

import java.util.Objects;

class BankClient {

    private String uid;
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankClient that)) return false;
        return getUid().equals(that.getUid()) && getFullName().equals(that.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUid(), getFullName());
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "unique ID = '" + uid + '\'' +
                ", Full name = '" + fullName + '\'' +
                '}';
    }
}
