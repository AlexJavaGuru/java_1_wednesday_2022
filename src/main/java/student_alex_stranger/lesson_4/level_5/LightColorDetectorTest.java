package student_alex_stranger.lesson_4.level_5;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleLightTest();
    }
    public void violetTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 380;
        String expectedResult = ("Violet");
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }
    public void blueTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 450;
        String expectedResult = ("Blue");
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }
    public void greenTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 495;
        String expectedResult = ("Green");
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }
    public void yellowTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 570;
        String expectedResult = ("Yellow");
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }
    public void orangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 590;
        String expectedResult = ("Orange");
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }
    public void redTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 620;
        String expectedResult = ("Red");
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }
    public void invisibleLightTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 800;
        String expectedResult = ("Invisible light");
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Invisible light test = OK");
        } else {
            System.out.println("Invisible light test = FAIL");
        }
    }


}
