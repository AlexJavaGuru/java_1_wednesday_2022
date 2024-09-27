package student_jekaterina_soldatova.lesson11.level_2_intern;

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