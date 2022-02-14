package student_jekaterina_soldatova.lesson_4.middle;

import java.util.Objects;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.colorTestSmaller();
        lightColorDetectorTest.colorTestBigger();

        lightColorDetectorTest.colorTestViolet();
        lightColorDetectorTest.colorTestBlue();
        lightColorDetectorTest.colorTestGreen();
        lightColorDetectorTest.colorTestYellow();
        lightColorDetectorTest.colorTestOrange();
        lightColorDetectorTest.colorTestRed();
    }

    void colorTestSmaller() {
        int wavelength = 10;
        String expectedResult = "Invisible";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("Too small invisible test = OK");
        } else {
            System.out.println("Too small invisible test = FAIL");
        }
    }

    void colorTestBigger() {
        int wavelength = 1000;
        String expectedResult = "Invisible";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("Too big invisible test = OK");
        } else {
            System.out.println("Too big invisible test = FAIL");
        }
    }

    void colorTestViolet() {
        int wavelength = 390;
        String expectedResult = "Violet";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }

    void colorTestBlue() {
        int wavelength = 490;
        String expectedResult = "Blue";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }

    void colorTestGreen() {
        int wavelength = 500;
        String expectedResult = "Green";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }

    void colorTestYellow() {
        int wavelength = 580;
        String expectedResult = "Yellow";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }

    void colorTestOrange() {
        int wavelength = 600;
        String expectedResult = "Orange";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }

    void colorTestRed() {
        int wavelength = 750;
        String expectedResult = "Red";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }
}