package student_aleksandr_zuk.lesson_11.level_2;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }


    public ConstructorChaining(String constructorName, int parameterCount) {
        ConstructorChaining test = new ConstructorChaining("name");
        this.constructorName = constructorName;
        this.parameterCount = parameterCount;
    }
}
