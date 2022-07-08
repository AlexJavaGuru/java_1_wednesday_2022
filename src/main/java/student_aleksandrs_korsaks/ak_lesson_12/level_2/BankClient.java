package student_aleksandrs_korsaks.ak_lesson_12.level_2;

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
    public String toString() {
        return "BankClient{" +
                "unique ID = '" + uid + '\'' +
                ", Full name = '" + fullName + '\'' +
                '}';
    }
}
