package student_aleksandrs_korsaks.ak_lesson_8.level_3;

class Building extends Construction {

    protected String buildingType;
    protected boolean isBuildingReady;

    public Building(int yearOfConstruct, int investments, int creationCost, String buildingType, boolean isBuildingReady) {
        super(yearOfConstruct, investments, creationCost);
        this.buildingType = buildingType;
        this.isBuildingReady = isBuildingReady;
    }

    @Override
    void construct(Construction constructionObject) {
        isBuildingReady = true;
    }
}
