package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

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

    static Object[] addToArray(Object name, Object[] arrayOfNames) {
        Object[] newArray = new String[arrayOfNames.length+1];
        System.arraycopy(arrayOfNames, 0, newArray, 0, arrayOfNames.length);
        newArray[newArray.length-1] = name;
        return newArray;
    }

}
