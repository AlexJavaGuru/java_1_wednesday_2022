package student_aleksandrs_korsaks.ak_lesson_9.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyListImpl implements MyList {

    private Man[] objects = new Man[0];

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

    private Man[] removeNullFromArray(Man[] arrayToRemove) {
        List<Man> values = new ArrayList<>();
        for (Man data : arrayToRemove) {
            if (data != null) {
                values.add(data);
            }
        }
        return values.toArray(new Man[0]);
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
        if ((position < 0) || (position > objects.length - 1)) {
            System.out.println("Position with this index is out of bound");
            return false;
        } else {
            objects = Arrays.copyOf(objects, objects.length + 1);
            if (objects.length - 1 - position >= 0) {
                System.arraycopy(objects, position, objects, position + 1, objects.length - 1 - position);
            }
            objects[position] = objectToAdd;
            return true;
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
            objects = removeNullFromArray(objects);
        }
    }

    @Override
    public List<Man> copyRange(int startPosition, int endPosition) {
        if ((objects == null) || (objects.length == 0)) {
            System.out.println("List is Empty");
            return new ArrayList<>();
        } else if (startPosition < 0) {
            System.out.println("Start position is out of bound");
            return new ArrayList<>();
        } else if (endPosition >= objects.length) {
            System.out.println("End possition is out of bound");
            return new ArrayList<>();
        } else {
            return Arrays.stream(Arrays.copyOfRange(objects, startPosition, endPosition)).toList();
        }
    }

    @Override
    public List<Man> copyAll() {
        Man[] copyOfObjects = new Man[objects.length];
        System.arraycopy(objects, 0, copyOfObjects, 0, objects.length);
        return Arrays.stream(copyOfObjects).toList();
    }
}

