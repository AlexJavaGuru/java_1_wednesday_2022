package student_jekaterina_soldatova.lesson11.level_1_intern;

class SafeInteractableDemo {

    public static void main(String[] args) {
        SafeInteractable safe = new SafeInteractable("012368f", 56.87);
        safe.putMoneyInSafe("012368f", 965.09);
        System.out.println(safe.getMoneyFromSafe("012368f", 45.90));
    }
}

