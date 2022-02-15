package student_jelena_boicova.lesson_3;

public class Dog {

    String nickname = "Max";
    int age = 15;

    public Dog(String nickname, int age){

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;

    }
    public String getNickname() {
        return nickname;

    }

    public void voice(){
        System.out.println(nickname + nickname + nickname + age);

    }
}
