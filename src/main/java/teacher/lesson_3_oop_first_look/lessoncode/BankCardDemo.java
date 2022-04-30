package teacher.lesson_3_oop_first_look.lessoncode;

import java.util.Scanner;

public class BankCardDemo {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String myName = "Alex";
        BankCard firstCard = new BankCard();

        BankCard secondCard = new BankCard("Swedbank", 1111222233334444L, 1234, 1000);

        int firstCardBalance = firstCard.getBalance();
        System.out.println(firstCardBalance);
//        secondCard.getBalance();
        firstCard.setBalance(1000000);
        int secondCardBalance = firstCard.getBalance();
        System.out.println(secondCardBalance);

        BankCard testBankCard;

        testBankCard = new BankCard("Citadele", 1231455125L, 4321, 200);

        testBankCard = new BankCard("DNB", 76531L, 6453, 23523);
    }
}
