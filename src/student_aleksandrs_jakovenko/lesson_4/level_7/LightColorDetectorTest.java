package student_aleksandrs_jakovenko.lesson_4.level_7;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
        lightColorDetector.testInvisible(100);
    }

    public void checkResult(String actualResult, String expectedResult, String testName){
        if (actualResult == expectedResult){
            System.out.println("LightColorDetector test - " + testName + " = OK");
        } else System.out.println("LightColorDetector test - " + testName + " = FAIL");
    }

    public void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Violet";
        checkResult(actualResult, expectedResult, "Violet");
    }

    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Blue";
        checkResult(actualResult, expectedResult, "Blue");
    }

    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Green";
        checkResult(actualResult, expectedResult, "Green");
    }

    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Yellow";
        checkResult(actualResult, expectedResult, "Yellow");
    }

    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Orange";
        checkResult(actualResult, expectedResult, "Orange");
    }

    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Red";
        checkResult(actualResult, expectedResult, "Red");
    }

    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(wavelength);
        String expectedResult = "Invisible Light";
        checkResult(actualResult, expectedResult, "Invisible");
    }
}
