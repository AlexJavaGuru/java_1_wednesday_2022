package student_aleksandrs_korsaks.ak_lesson_8.level_3;

class Bridge extends Construction {
    protected int bridgeLength;
    protected boolean isBridgeReady;

    public Bridge(int yearOfConstruct, int investments, int creationCost, int bridgeLength, boolean isBridgeReady) {
        super(yearOfConstruct, investments, creationCost);
        this.bridgeLength = bridgeLength;
        this.isBridgeReady = isBridgeReady;
    }

    @Override
    void construct(Construction constructionObject) {
        isBridgeReady = true;
    }
}
