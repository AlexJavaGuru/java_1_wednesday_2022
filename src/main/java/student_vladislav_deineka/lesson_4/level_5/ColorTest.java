package student_vladislav_deineka.lesson_4.level_5;

public class ColorTest {

        private  Color color = new Color();

        public static void main(String[] args) {
            ColorTest color = new ColorTest();
            color.testViolet(405);
            color.testBlue(475);
            color.testGreen(505);
            color.testYellow(585);
            color.testOrange(619);
            color.testRed(620);
            color.testInvisible(760);
        }
        public void testViolet(int wavelength) {
            String result = color.detect(wavelength);
            checkResults(result.equals("Violet"), "Color test - Violet");
        }
        public void testBlue(int wavelength) {
            String result = color.detect(wavelength);
            checkResults(result.equals("Blue"), "Color test - Blue");
        }
        public void testGreen(int wavelength) {
            String result = color.detect(wavelength);
            checkResults(result.equals("Green"), "Color test - Green");
        }
        public void testYellow(int wavelength) {
            String result = color.detect(wavelength);
            checkResults(result.equals("Yellow"), "Color test - Yellow");
        }
        public void testOrange(int wavelength) {
            String result = color.detect(wavelength);
            checkResults(result.equals("Orange"), "Color test - Orange");
        }
        public void testRed(int wavelength) {
            String result = color.detect(wavelength);
            checkResults(result.equals("Red"), "Color test - Red");
        }
        public void testInvisible(int wavelength) {
            String result = color.detect(wavelength);
            checkResults(result.equals("Invisible Light"), "Color test - Invisible Light");
        }

        private void checkResults(boolean condition, String testName) {
            if (condition) {
                System.out.println(testName + " = OK");
            } else {
                System.out.println(testName + " = FAIL");
            }
        }

    }

