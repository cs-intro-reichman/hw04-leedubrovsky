public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
     
        
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here: 
        String sentence = ""; //+ (char) + (str.charAt(0) + 32);
        int i = 0;

        while (i < string.length()) {
            char currentChar = string.charAt(i);

            if (currentChar >= '0' && currentChar <= '9') {
                sentence += currentChar;
            } else if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                sentence += (char) (currentChar - 32);
            } else if (currentChar >= 'A' && currentChar <= 'Z' && currentChar != 'A' && currentChar != 'E' && currentChar != 'I' && currentChar != 'O' && currentChar != 'U') {
                sentence += (char) (currentChar + 32);
            } else {
                sentence += currentChar;
            }
            i++;
        }

        return sentence;
    }

    public static String camelCase (String string) {
        // Write your code here:
        String sentence = "";
        boolean firstWord = true;  // Set to true to convert the first word to lowercase

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            if (currentChar != ' ') {
                if (firstWord) {
                    sentence += (char) (currentChar >= 'A' && currentChar <= 'Z' ? currentChar + ('a' - 'A') : currentChar);
                    firstWord = false;
                } else {
                    sentence += (char) (currentChar >= 'a' && currentChar <= 'z' ? currentChar - ('a' - 'A') : currentChar);
                }

                // Find the end of the current word
                int remainingChar = i + 1;
                while (remainingChar < string.length() && string.charAt(remainingChar) != ' ') {
                    remainingChar++;
                }

                // Convert the rest of the word to lowercase
                for (int j = i + 1; j < remainingChar; j++) {
                    sentence += (char) (string.charAt(j) >= 'A' && string.charAt(j) <= 'Z' ? string.charAt(j) + ('a' - 'A') : string.charAt(j));
                }

                i = remainingChar - 1;
            }
        }

        return sentence;
    }


    
    

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (chr == (char)string.charAt(i)){
                count++;
            }
        }
        int [] array = new int[count];
        int index = 0;
        
        for (int j = 0; j < string.length(); j++){
             if (chr == (char)string.charAt(j)){
                array[index] = j;
                index++;
            }

        }

        return array;
    }
}