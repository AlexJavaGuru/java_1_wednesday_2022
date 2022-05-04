package student_aleksandr_zuk.lesson_10.level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListExample {

    public static void main(String[] args) {

        List<String> flowerList = new ArrayList<String>();

        flowerList.add("Rose");
        flowerList.add("Lily");
        flowerList.add("Tulip");

        Collections.sort(flowerList);
        for (String flower : flowerList) {
            System.out.println(" " + flower);
        }


    }

}
