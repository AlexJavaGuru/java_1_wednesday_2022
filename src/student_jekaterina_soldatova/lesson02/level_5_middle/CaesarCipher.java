//please run MiddleTask18

package student_jekaterina_soldatova.lesson02.level_5_middle;

class CaesarCipher {
    String Shift(String original, int offset) {
        String newLine = "";
        char newLetter;
        byte codeA = (int) 'A';
        byte codeZ = (int) 'Z';
        byte aCode = (int) 'a';
        byte zCode = (int) 'z';

        for (char letter : original.toCharArray()){
            if ((int)letter >= codeA && (int)letter <= codeZ){
                if ((int)letter - offset < codeA){
                    newLetter = (char) (codeZ - (offset - ((int)letter - codeA)) + 1);
                }
                else{
                    newLetter = (char) ((int)letter - offset);
                }
                newLine += newLetter;
            }

            else if ((int)letter >= aCode && (int)letter <= zCode){
                if ((int)letter - offset < aCode){
                    newLetter = (char) (zCode - (offset - ((int)letter - aCode)) + 1);
                }
                else{
                    newLetter = (char) ((int)letter - offset);
                }
                newLine += newLetter;
            }

            else {
                newLine += letter;
            }

        }

        return newLine;
    }

}
