package student_andrejs_saldavs.lesson_04.level_5;

class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.detectVioletTest();
        lightColorDetectorTest.detectBlueTest();
        lightColorDetectorTest.detectGreenTest();
        lightColorDetectorTest.detectYellowTest();
        lightColorDetectorTest.detectOrangeTest();
        lightColorDetectorTest.detectRedTest();
        lightColorDetectorTest.detectInvisibleLightTestOne();
        lightColorDetectorTest.detectInvisibleLightTestTwo();

    }

    public void detectVioletTest() {
        int wavelength = 400;
        String expectedResult = "Violet";
        LightColorDetector detector = new LightColorDetector();

        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Test 1 has passed");
        } else {
            System.out.println("Test 1 has failed");
        }
    }

    public void detectBlueTest() {
        int wavelength = 470;
        String expectedResult = "Blue";
        LightColorDetector detector = new LightColorDetector();

        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Test 2 has passed");
        } else {
            System.out.println("Test 2 has failed");
        }
    }

    public void detectGreenTest() {
        int wavelength = 530;
        String expectedResult = "Green";
        LightColorDetector detector = new LightColorDetector();

        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Test 3 has passed");
        } else {
            System.out.println("Test 3 has failed");
        }
    }

    public void detectYellowTest() {
        int wavelength = 580;
        String expectedResult = "Yellow";
        LightColorDetector detector = new LightColorDetector();

        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Test 4 has passed");
        } else {
            System.out.println("Test 4 has failed");
        }
    }

    public void detectOrangeTest() {
        int wavelength = 600;
        String expectedResult = "Orange";
        LightColorDetector detector = new LightColorDetector();

        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Test 4 has passed");
        } else {
            System.out.println("Test 4 has failed");
        }
    }

    public void detectRedTest() {
        int wavelength = 700;
        String expectedResult = "Red";
        LightColorDetector detector = new LightColorDetector();

        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Test 5 has passed");
        } else {
            System.out.println("Test 5 has failed");
        }
    }

    public void detectInvisibleLightTestOne() {
        int wavelength = 300;
        String expectedResult = "Invisible Light";
        LightColorDetector detector = new LightColorDetector();

        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Test 6 has passed");
        } else {
            System.out.println("Test 6 has failed");
        }
    }

    public void detectInvisibleLightTestTwo() {
        int wavelength = 800;
        String expectedResult = "Invisible Light";
        LightColorDetector detector = new LightColorDetector();

        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Test 7 has passed");
        } else {
            System.out.println("Test 7 has failed");
        }
    }

}
