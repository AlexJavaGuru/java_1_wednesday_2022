package student_aleksandrs_korsaks.ak_lesson_8.level_7.Task_31;

import java.util.Objects;

class Reader {
    private long readerId;
    String readerName;
    String readerSurname;
    private String readerPersonalCode;
    int readerPhoneNumber;
    String readerAddress;

    public Reader(String readerName, String readerSurname, String readerPersonalCode, int readerPhoneNumber, String readerAddress) {
        this.readerName = readerName;
        this.readerSurname = readerSurname;
        this.readerPersonalCode = readerPersonalCode;
        this.readerPhoneNumber = readerPhoneNumber;
        this.readerAddress = readerAddress;
    }

    public long getReaderId() {
        return readerId;
    }

    public void setReaderId(long readerId) {
        this.readerId = readerId;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getReaderSurname() {
        return readerSurname;
    }

    public void setReaderSurname(String readerSurname) {
        this.readerSurname = readerSurname;
    }

    public String getReaderPersonalCode() {
        return readerPersonalCode;
    }

    public void setReaderPersonalCode(String readerPersonalCode) {
        this.readerPersonalCode = readerPersonalCode;
    }

    public int getReaderPhoneNumber() {
        return readerPhoneNumber;
    }

    public void setReaderPhoneNumber(int readerPhoneNumber) {
        this.readerPhoneNumber = readerPhoneNumber;
    }

    public String getReaderAddress() {
        return readerAddress;
    }

    public void setReaderAddress(String readerAddress) {
        this.readerAddress = readerAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reader)) return false;
        Reader reader = (Reader) o;
        return getReaderId() == reader.getReaderId() && getReaderPhoneNumber() == reader.getReaderPhoneNumber() && getReaderName().equals(reader.getReaderName()) && getReaderSurname().equals(reader.getReaderSurname()) && getReaderPersonalCode().equals(reader.getReaderPersonalCode()) && getReaderAddress().equals(reader.getReaderAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReaderId(), getReaderName(), getReaderSurname(), getReaderPersonalCode(), getReaderPhoneNumber(), getReaderAddress());
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", readerName='" + readerName + '\'' +
                ", readerSurname='" + readerSurname + '\'' +
                ", readerPersonalCode='" + readerPersonalCode + '\'' +
                ", readerPhoneNumber=" + readerPhoneNumber +
                ", readerAddress='" + readerAddress + '\'' +
                '}';
    }
}
