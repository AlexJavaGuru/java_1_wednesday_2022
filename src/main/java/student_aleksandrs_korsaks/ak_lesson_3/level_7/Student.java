package student_aleksandrs_korsaks.ak_lesson_3.level_7;

class Student {
    private String studentName;
    private int studentAge;
    private boolean studentActivityStatus = true;
    private int phoneNumber;

    public Student(String studentName, int studentAge, int phoneNumber) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.phoneNumber = phoneNumber;
    }

    void changeStudentActivityStatus(boolean status) {
        System.out.println();
        studentActivityStatus = status;
        if (status) {
            System.out.println("Student " + Student.this.studentName + " has been enrolled in university");
        } else System.out.println("Student " + Student.this.studentName + " has been expelled from the university");
        System.out.println();
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student {" +
                "Name and Surname - '" + studentName + '\'' +
                "; Age - " + studentAge +
                "; studying status - " + studentActivityStatus +
                "; phone number - " + phoneNumber +
                '}';
    }
}
