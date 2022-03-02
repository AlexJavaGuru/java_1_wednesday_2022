package student_konstantin_kolesnik.lesson4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lcdTest = new LightColorDetectorTest();
        lcdTest.violetTest();
        lcdTest.blueTest();
        lcdTest.greenTest();
        lcdTest.yellowTest();
        lcdTest.orangeTest();
        lcdTest.redTest();
        lcdTest.invisibleTest();
    }

    void violetTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(381);
        if (result.equals("Violet")) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL ");
        }
    }
    void blueTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(474);
        if (result.equals("Blue")) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }
    void greenTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(555);
        if (result.equals("Green")) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }
    void yellowTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(577);
        if (result.equals("Yellow")) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }
    void orangeTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(600);
        if (result.equals("Orange")) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }
    void redTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(666);
        if (result.equals("Red")) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }
    void invisibleTest() {
        LightColorDetector lcd = new LightColorDetector();
        String result = lcd.detect(123);
        if (result.equals("Invisible Light")) {
            System.out.println("Invisible light test = OK");
        } else {
            System.out.println("Invisible light test = FAIL");
        }
    }
}
