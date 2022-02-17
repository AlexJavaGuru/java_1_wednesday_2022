package student_arturs_melnikovs.lesson_04.level_07;

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
    }
    public void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Violet";
        checkResult(expectedResult, result, "Violet test");
    }
    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Blue";
        checkResult(expectedResult, result, "Blue test");
    }
    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Green";
        checkResult(expectedResult, result, "Green test");
    }
    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Yellow";
        checkResult(expectedResult, result, "Yellow test");
    }
    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Orange";
        checkResult(expectedResult, result, "Orange test");
    }
    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Red";
        checkResult(expectedResult, result, "Red test");
    }
    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        String expectedResult = "Invisible Light";
        checkResult(expectedResult, result, "Invisible Light test");
    }
    public void checkResult(String expectedResult, String result, String testName) {
        if(expectedResult.equals(result)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}

