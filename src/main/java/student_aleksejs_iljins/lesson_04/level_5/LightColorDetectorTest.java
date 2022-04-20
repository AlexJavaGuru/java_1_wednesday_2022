package student_aleksejs_iljins.lesson_04.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest LightColorDetectorTest = new LightColorDetectorTest();
        LightColorDetectorTest.violet();
        LightColorDetectorTest.blue();
        LightColorDetectorTest.green();
        LightColorDetectorTest.yellow();
        LightColorDetectorTest.orange();
        LightColorDetectorTest.red();
        LightColorDetectorTest.invisible();
        LightColorDetectorTest.invisiblTwo();
    }

    public void violet() {
        String expectedResult = "Violet";
        LightColorDetector LightColorDetector = new LightColorDetector();
        String result = LightColorDetector.color(384);
        if (result == expectedResult) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }
    public void blue() {
        String expectedResult = "Blue";
        LightColorDetector LightColorDetector = new LightColorDetector();
        String result = LightColorDetector.color(480);
        if (result == expectedResult) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }
    public void green() {
        String expectedResult = "Green";
        LightColorDetector LightColorDetector = new LightColorDetector();
        String result = LightColorDetector.color(560);
        if (result == expectedResult) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }
    public void yellow() {
        String expectedResult = "Yellow";
        LightColorDetector LightColorDetector = new LightColorDetector();
        String result = LightColorDetector.color(575);
        if (result == expectedResult) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }
    public void orange() {
        String expectedResult = "Orange";
        LightColorDetector LightColorDetector = new LightColorDetector();
        String result = LightColorDetector.color(619);
        if (result == expectedResult) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }
    public void red() {
        String expectedResult = "Red";
        LightColorDetector LightColorDetector = new LightColorDetector();
        String result = LightColorDetector.color(620);
        if (result == expectedResult) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }
    public void invisible() {
        String expectedResult = "Invisible Light";
        LightColorDetector LightColorDetector = new LightColorDetector();
        String result = LightColorDetector.color(1);
        if (result == expectedResult) {
            System.out.println("Invisible till 380 test = OK");
        } else {
            System.out.println("Invisible till 380 test = FAIL");
        }
    }
    public void invisiblTwo() {
        String expectedResult = "Invisible Light";
        LightColorDetector LightColorDetector = new LightColorDetector();
        String result = LightColorDetector.color(1000);
        if (result == expectedResult) {
            System.out.println("Invisible after 750 test = OK");
        } else {
            System.out.println("Invisible after 750  test = FAIL");
        }
    }
}
