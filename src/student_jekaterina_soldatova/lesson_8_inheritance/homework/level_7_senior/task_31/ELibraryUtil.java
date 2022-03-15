package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;

class ELibraryUtil {

    static Object[] removeFromArray(Object name, Object[] arrayOfNames) {
        Object[] newArray = new String[arrayOfNames.length - 1];
        for (int i = 0, j = 0; i < arrayOfNames.length - 1; i++) {
            if (!(arrayOfNames[i].equals(name))) {
                newArray[j++] = arrayOfNames[i];
            }
        }
        return newArray;
    }
    static Object[][] removeFromArray(Object name, Object[][] arrayOfNames) {
        Object[][] newArray = new Object[arrayOfNames.length - 1][arrayOfNames[0].length];
        for (int i = 0, j = 0; i < arrayOfNames.length - 1; i++) {
            if (!(arrayOfNames[i][0].equals(name))) {
                newArray[j++][0] = arrayOfNames[i];
            }
        }
        return newArray;
    }

    static Object[] addToArray(Object name, Object[] arrayOfNames) {
        Object[] newArray = new String[arrayOfNames.length+1];
        System.arraycopy(arrayOfNames, 0, newArray, 0, arrayOfNames.length);
        newArray[newArray.length-1] = name;
        return newArray;
    }

    static Object[][] takeBook(Object name, Object[][] arrayOfNames, Date dateWhenTaken) {
        Object[][] newArray = new String[arrayOfNames.length+1][arrayOfNames[0].length];
        System.arraycopy(arrayOfNames, 0, newArray, 0, arrayOfNames.length);
        newArray[newArray.length-1][0] = name;
        newArray[newArray.length-1][1] = dateWhenTaken;
        newArray[newArray.length-1][2] = returnDate(dateWhenTaken);
        return newArray;
    }

    static Date returnDate(Date dateWhenTaken) {
        Calendar returnDate = Calendar.getInstance();
        returnDate.setTime(dateWhenTaken);
        returnDate.add(Calendar.DATE, 30);
        return returnDate.getTime();
    }
}
