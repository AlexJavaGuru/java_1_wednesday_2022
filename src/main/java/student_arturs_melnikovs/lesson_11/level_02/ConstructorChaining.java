package student_arturs_melnikovs.lesson_11.level_02;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(int parameterCount, String constructorName) {
        this(constructorName);
        this.parameterCount = parameterCount;
    }

}
