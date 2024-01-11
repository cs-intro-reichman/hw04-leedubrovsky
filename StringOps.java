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

        while (i < string.length()){
            if (string.charAt(i) >= '0' && string.charAt(i) <= '9' ){ // maybe i can switch it too - instead of 48 i will write '0'
                sentence += string.charAt(i);
            }else if ((string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o'  || string.charAt(i) == 'u') ){
                sentence += (char) (string.charAt(i) - 32 );
            }else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z' && (string.charAt(i) != 'A' || string.charAt(i) != 'E' || string.charAt(i) != 'I' || string.charAt(i) != 'O' || string.charAt(i) != 'U')){
             sentence += (char) (string.charAt(i) +32 );

            }else{
                sentence += (char) (string.charAt(i));
            }
            i++;
        }

        return sentence;
    }

    public static String camelCase (String string) {
        // Write your code here:
        String sentence = "";
        boolean firstWord = false;

        for (int i = 0; i < string.length(); i++){
            char currentChar = string.charAt(i);

            if ((currentChar != ' ')){ 
                
                if (firstWord){
                    sentence += (char) (currentChar >= 'A' && currentChar <= 'Z' ? currentChar + 32 : currentChar);
                    firstWord = false;

                }else {
                    sentence += (char) (currentChar);
                }

                int remainingChar = i + 1;
                while (remainingChar < string.length() && string.charAt(remainingChar) != ' ') {
                    remainingChar++;
                }

                for ( int j = i + 1; j < remainingChar; j++){
                sentence += (char) (string.charAt(j) >= 'A' && string.charAt(j) <= 'Z' ? string.charAt(j) + 32 : string.charAt(j));
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
                array[index] = string.charAt(j);
                index++;
            }

        }

        return array;
    }
}