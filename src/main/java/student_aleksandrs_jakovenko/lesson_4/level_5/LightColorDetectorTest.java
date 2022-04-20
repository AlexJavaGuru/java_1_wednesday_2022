package student_aleksandrs_jakovenko.lesson_4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisTest();
    }
    public void violetTest(){
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(400);
        if (realResult == expectedResult) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }
    public void blueTest(){
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(477);
        if (realResult == expectedResult) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }
    public void greenTest(){
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(555);
        if (realResult == expectedResult) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }
    public void yellowTest(){
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(577);
        if (realResult == expectedResult) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }
    public void orangeTest(){
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(600);
        if (realResult == expectedResult) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }
    public void redTest(){
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(650);
        if (realResult == expectedResult) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }
    public void invisTest(){
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(100);
        if (realResult == expectedResult) {
            System.out.println("Invisible Light test = OK");
        } else {
            System.out.println("Invisible Light = FAIL");
        }
    }
}
