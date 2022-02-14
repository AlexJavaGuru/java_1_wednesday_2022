package student_jelena_boicova.lesson_4_homerwork;

public class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.violetTest();
    }

    public void violetTest() {
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(380);
        if (realResult == expectedResult) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }

}
