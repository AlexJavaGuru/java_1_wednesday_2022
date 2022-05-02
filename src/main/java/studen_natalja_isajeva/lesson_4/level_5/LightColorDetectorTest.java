package studen_natalja_isajeva.lesson_4.level_5;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleTest();
    }


    public void violetTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Violet";
        String realResult = LightColorDetector.detect(400);
        if (realResult.equals(expectedResult)) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");

        }
    }
    public void blueTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Blue";
        String realResult = LightColorDetector.detect(460);
        if (realResult.equals(expectedResult)) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");

        }
    }
    public void greenTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Green";
        String realResult = LightColorDetector.detect(500);
        if (realResult.equals(expectedResult)) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");

        }
    }
    public void yellowTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Yellow";
        String realResult = LightColorDetector.detect(580);
        if (realResult.equals(expectedResult)) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");

        }
    }
    public void orangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Orange";
        String realResult = LightColorDetector.detect(600);
        if (realResult.equals(expectedResult)) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");

        }
    }
    public void redTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Red";
        String realResult = LightColorDetector.detect(700);
        if (realResult.equals(expectedResult)) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");

        }
    }
    public void invisibleTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Invisible Light";
        String realResult = LightColorDetector.detect(760);
        if (realResult.equals(expectedResult)) {
            System.out.println("Invisible Light test = OK");
        } else {
            System.out.println("Invisible Light test = FAIL");

        }
    }
}


