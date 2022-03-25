package student_alex_stranger.lesson_4.level_7;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest(405);
        lightColorDetectorTest.blueTest(475);
        lightColorDetectorTest.greenTest(505);
        lightColorDetectorTest.yellowTest(585);
        lightColorDetectorTest.orangeTest(619);
        lightColorDetectorTest.redTest(620);
        lightColorDetectorTest.invisibleLightTest(795);
        lightColorDetectorTest.invisibleLightTest(200);
    }
    public void violetTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Violet";
        checkResult(actualResult, expectedResult, "Violet");
    }
    public void blueTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Blue";
        checkResult(actualResult, expectedResult, "Blue");
    }
    public void greenTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Green";
        checkResult(actualResult, expectedResult, "Green");
    }
    public void yellowTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Yellow";
        checkResult(actualResult, expectedResult, "Yellow");
    }
    public void orangeTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Orange";
        checkResult(actualResult, expectedResult, "Orange");
    }
    public void redTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Red";
        checkResult(actualResult, expectedResult, "Red");
    }
    public void invisibleLightTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Invisible Light";
        checkResult(actualResult, expectedResult, "Invisible Light");
    }
    public void checkResult(String actualResult, String expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("Light color detector test " + testName + " = OK");
        } else {
            System.out.println("Light color detector test " + testName + " = FAIL");
        }
    }
}
