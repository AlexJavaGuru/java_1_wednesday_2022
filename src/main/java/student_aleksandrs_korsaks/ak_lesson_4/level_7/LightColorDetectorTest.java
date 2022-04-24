package student_aleksandrs_korsaks.ak_lesson_4.level_7;

class LightColorDetectorTest {
    LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.testViolet();
        lightColorDetectorTest.testBlue();
        lightColorDetectorTest.testGreen();
        lightColorDetectorTest.testYellow();
        lightColorDetectorTest.testOrange();
        lightColorDetectorTest.testRed();
        lightColorDetectorTest.testInvisible();
    }

    public void testViolet() {
        int wavelength = 405;
        String result = lightColorDetector.detect(wavelength);
        checkResultTest("testViolet", result.equals("Violet"));
    }

    public void testBlue() {
        int wavelength = 475;
        String result = lightColorDetector.detect(wavelength);
        checkResultTest("testBlue", result.equals("Blue"));
    }

    public void testGreen() {
        int wavelength = 505;
        String result = lightColorDetector.detect(wavelength);
        checkResultTest("testGreen", result.equals("Green"));
    }

    public void testYellow() {
        int wavelength = 585;
        String result = lightColorDetector.detect(wavelength);
        checkResultTest("testYellow", result.equals("Yellow"));
    }

    public void testOrange() {
        int wavelength = 619;
        String result = lightColorDetector.detect(wavelength);
        checkResultTest("testOrange", result.equals("Orange"));
    }

    public void testRed() {
        int wavelength = 620;
        String result = lightColorDetector.detect(wavelength);
        checkResultTest("testRed", result.equals("Red"));
    }

    public void testInvisible() {
        int wavelength = 760;
        String result = lightColorDetector.detect(wavelength);
        checkResultTest("testInvisible", result.equals("Invisible Light"));
    }

    public void checkResultTest(String testName, boolean result) {
        if (result) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}

