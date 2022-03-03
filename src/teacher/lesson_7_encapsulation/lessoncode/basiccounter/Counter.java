package teacher.lesson_7_encapsulation.lessoncode.basiccounter;

/*
State
1. Current counter value cannot be accessed directly
‣ Behaviour
2. Can increment, decrement and clear counter value
3. Can set counter value to any specified positive
number (otherwise set to 0)
4. Can be constructed only within the same package
 */

public class Counter {

    int count;

    Counter() {
        count = 0;
    }

    public void increment() {
        count += 1;
    }

    public void decrement() {
        count -= 1;
    }

    public int getCount() {
        return count;
    }

    public void setCounter(int value) {
        if (isPositive(value)) {
            count = value;
        } else {
            count = 0;
        }
    }

    private boolean isPositive(int value) {
        return value > 0;
    }
}
