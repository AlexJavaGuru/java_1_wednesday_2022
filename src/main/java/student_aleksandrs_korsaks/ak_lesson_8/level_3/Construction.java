package student_aleksandrs_korsaks.ak_lesson_8.level_3;

abstract class Construction {

    private int yearOfConstructionStart;
    private int investments;
    private int creationCost;

    public Construction(int yearOfConstruct, int investments, int creationCost) {
        this.yearOfConstructionStart = yearOfConstruct;
        this.investments = investments;
        this.creationCost = creationCost;
    }

    abstract void construct (Construction constructionObject);
}
