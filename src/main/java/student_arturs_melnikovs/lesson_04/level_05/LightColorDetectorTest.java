package student_arturs_melnikovs.lesson_04.level_05;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();

        test.testLightColorViolet();
        test.testLightColorBlue();
        test.testLightColorGreen();
        test.testLightColorYellow();
        test.testLightColorOrange();
        test.testLightColorRed();
        test.testInvisibleLightFirst();
        test.testInvisibleLightSecond();

    }

    public void testLightColorViolet() {
        LightColorDetector detector = new LightColorDetector();
        int waveLength = 400;
        String expectedResult = "Violet";
        String actualResult = detector.detectColor(waveLength);
        checkResult(expectedResult, actualResult, "Violet color test");
    }
    public void testLightColorBlue() {
        LightColorDetector detector = new LightColorDetector();
        int waveLength = 460;
        String expectedResult = "Blue";
        String actualResult = detector.detectColor(waveLength);
        checkResult(expectedResult, actualResult, "Blue color test");
    }
    public void testLightColorGreen() {
        LightColorDetector detector = new LightColorDetector();
        int waveLength = 500;
        String expectedResult = "Green";
        String actualResult = detector.detectColor(waveLength);
        checkResult(expectedResult, actualResult, "Green color test");
    }
    public void testLightColorYellow() {
        LightColorDetector detector = new LightColorDetector();
        int waveLength = 580;
        String expectedResult = "Yellow";
        String actualResult = detector.detectColor(waveLength);
        checkResult(expectedResult, actualResult, "Yellow color test");
    }
    public void testLightColorOrange() {
        LightColorDetector detector = new LightColorDetector();
        int waveLength = 600;
        String expectedResult = "Orange";
        String actualResult = detector.detectColor(waveLength);
        checkResult(expectedResult, actualResult, "Orange color test");
    }
    public void testLightColorRed() {
        LightColorDetector detector = new LightColorDetector();
        int waveLength = 650;
        String expectedResult = "Red";
        String actualResult = detector.detectColor(waveLength);
        checkResult(expectedResult, actualResult, "Red color test");
    }
    public void testInvisibleLightFirst() {
        LightColorDetector detector = new LightColorDetector();
        int waveLength = 370;
        String expectedResult = "Invisible Light";
        String actualResult = detector.detectColor(waveLength);
        checkResult(expectedResult, actualResult, "Invisible light first test");
    }
    public void testInvisibleLightSecond() {
        LightColorDetector detector = new LightColorDetector();
        int waveLength = 760;
        String expectedResult = "Invisible Light";
        String actualResult = detector.detectColor(waveLength);
        checkResult(expectedResult, actualResult, "Invisible light second test");
    }

    public void checkResult(String expectedResult, String actualResult, String testName) {
        if(expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has not passed");
            System.out.println("Expected result was " + expectedResult + ", actual result is " + actualResult);
        }
    }
}
