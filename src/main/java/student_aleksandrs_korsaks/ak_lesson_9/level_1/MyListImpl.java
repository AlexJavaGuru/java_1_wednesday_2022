package student_aleksandrs_korsaks.ak_lesson_9.level_1;

import java.util.Arrays;
import java.util.List;

class MyListImpl implements MyList {

    private Man[] objects = new Man[10];

    public Man[] getObjects() {
        return objects;
    }

    private boolean isArrayFull(Man[] arrayToCheck) {
        for (Man object : arrayToCheck) {
            if (object == null) {
                return false;
            }
        }
        return true;
    }

    private int findNextEmptySpaceIndex(Man[] arrayToCheck) {
        int index = 0;
        for (int i = 0; i < arrayToCheck.length; i++) {
            if (arrayToCheck[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void addElement(Man objectToAdd) {
        if (isArrayFull(objects)) {
            objects = Arrays.copyOf(objects, objects.length + 1);
            objects[objects.length - 1] = objectToAdd;
        } else {
            objects[findNextEmptySpaceIndex(objects)] = objectToAdd;
        }
    }

    @Override
    public boolean addElementInPosition(Man objectToAdd, int position) {
        if ((position <= 0) || (position > objects.length - 1)) {
            System.out.println("Position with this index is out of bound");
            return false;
        } else if (objects[position] == null) {
            objects[position] = objectToAdd;
            return true;
        } else {
            System.out.println("Position with this index isn`t empty");
            return false;
        }
    }

    @Override
    public void removeElement(Man objectToRemove) {
        int j = 0;
        for (int i = 0; i < objects.length; i++) {
            if ((objects[i] != null) && (objects[i].equals(objectToRemove))) {
                objects[i] = null;
                j++;
            }
        }
        if (j >= 1) {
            objects = Arrays.copyOf(objects, objects.length - j + 2);
        }
    }

    @Override
    public List<Man> copyRange(int startPosition, int endPosition) {
        return null;
    }

    @Override
    public List<Man> copyAll() {
        return null;
    }
}
