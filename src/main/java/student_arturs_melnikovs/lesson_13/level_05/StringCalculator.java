package student_arturs_melnikovs.lesson_13.level_05;


class StringCalculator {

    //Сам не смог решить, нашёл в интернете
    int add(String numbers) {
        int l = numbers.length();
        int sum = 0;
        String temp = "";
        for (int i = 0; i < l; i++)
        {
            if (Character.isDigit(numbers.charAt(i)))
            {
                if (i < l-1 && Character.isDigit(numbers.charAt(i+1)))
                {
                    temp += numbers.charAt(i);
                }
                else
                {
                    temp += numbers.charAt(i);
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        return sum;
    }

}
