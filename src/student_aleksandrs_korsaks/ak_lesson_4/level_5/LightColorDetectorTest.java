package student_aleksandrs_korsaks.ak_lesson_4.level_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.outOfBoundTest1();
        lightColorDetectorTest.outOfBoundTest2();
    }

    public void violetTest() {
        int testValue = 380;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(testValue);
        checkTestResult("violetTest", expectedResult, realResult);
    }

    public void blueTest() {
        int testValue = 450;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(testValue);
        checkTestResult("blueTest", expectedResult, realResult);
    }

    public void greenTest() {
        int testValue = 495;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(testValue);
        checkTestResult("greenTest", expectedResult, realResult);
    }

    public void yellowTest() {
        int testValue = 570;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(testValue);
        checkTestResult("yellowTest", expectedResult, realResult);
    }

    public void orangeTest() {
        int testValue = 590;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(testValue);
        checkTestResult("orangeTest", expectedResult, realResult);
    }

    public void redTest() {
        int testValue = 620;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(testValue);
        checkTestResult("redTest", expectedResult, realResult);
    }

    public void outOfBoundTest1() {
        int testValue = 751;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(testValue);
        checkTestResult("outOfBoundTest1", expectedResult, realResult);
    }

    public void outOfBoundTest2() {
        int testValue = 379;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(testValue);
        checkTestResult("outOfBoundTest2", expectedResult, realResult);
    }


    public void checkTestResult(String testName, String expectedResult, String realResult) {
        if (realResult.equals(expectedResult)) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}
