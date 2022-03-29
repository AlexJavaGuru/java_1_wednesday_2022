package student_igors.lessons_4.level_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest testRunner = new LightColorDetectorTest();
        testRunner.violetTests();
        testRunner.blueTests();
        testRunner.greenTests();
        testRunner.yellowTests();
        testRunner.orangeTests();
        testRunner.redTests();
        testRunner.invisibleLightTests();
    }

    void violetTests() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 400;
        String expectedResult = "Violet";
        String actualResult = victim.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("VioletTests hase passed");
        } else {
            System.out.println(" VioletTests FAILED");
            System.out.println("Expected: " + expectedResult + " Actual: " + actualResult);
        }
    }

    void blueTests() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 470;
        String expectedResult = "Blue";
        String actualResult = victim.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("BlueTests hase passed");
        } else {
            System.out.println(" BlueTests FAILED");
            System.out.println("Expected: " + expectedResult + " Actual: " + actualResult);
        }
    }

    void greenTests() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 500;
        String expectedResult = "Green";
        String actualResult = victim.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("GreenTests hase passed");
        } else {
            System.out.println(" GreenTests FAILED");
            System.out.println("Expected: " + expectedResult + " Actual: " + actualResult);
        }
    }
    void yellowTests() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 580;
        String expectedResult = "Yellow";
        String actualResult = victim.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("YellowTests hase passed");
        } else {
            System.out.println(" YellowTests FAILED");
            System.out.println("Expected: " + expectedResult + " Actual: " + actualResult);
        }
    }
    void orangeTests() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 600;
        String expectedResult = "Orange";
        String actualResult = victim.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("OrangeTests hase passed");
        } else {
            System.out.println(" OrangeTests FAILED");
            System.out.println("Expected: " + expectedResult + " Actual: " + actualResult);
        }
    }
    void redTests() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 700;
        String expectedResult = "Red";
        String actualResult = victim.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("RedTests hase passed");
        } else {
            System.out.println(" RedTests FAILED");
            System.out.println("Expected: " + expectedResult + " Actual: " + actualResult);
        }
    }
    void invisibleLightTests() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 800;
        String expectedResult = "Invisible Light";
        String actualResult = victim.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("InvisibleLightTests hase passed");
        } else {
            System.out.println(" InvisibleLightTests FAILED");
            System.out.println("Expected: " + expectedResult + " Actual: " + actualResult);
        }
    }
}










//380 ... 449 - Фиолетовый ("Violet")
  //      450 ... 494 - Синий ("Blue")
    //    495 ... 569 - Зеленый ("Green")
      //  570 ... 589 - Желтый ("Yellow")
 //       590 ... 619 - Оранжевый ("Orange")
   //     620 ... 750 - Красный ("Red")
     //   Вне диапазонов - невидимый спектр ("Invisible Light")