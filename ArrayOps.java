public class ArrayOps {
    public static void main(String[] args) {
        int [] array = {1,2,3,-4,5};
        int [] arr = {1,3,-4,5};
        System.out.println(containsTheSameElements(array, arr));
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        boolean stopRun = false; 
        for (int j = 0; j <= array.length; j++){
            stopRun = false;
            for (int i = 0; i < array.length; i++){
                 if (array[i] == j){
                    stopRun = true;
                }
                if ((stopRun == false) && (i == array.length-1)){
                    return j;
                }

            }
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int secondMax = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] >= max){
                secondMax = max;
                max = array[i];
           // }else if (array[i] > secondMax && array[i] < max){
           //     secondMax = array[i];
           }
            
            }
            return secondMax;

         }



    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        int bigger = 0;
        int smaller = 0;
        boolean theSame = false;

        if (array1.length >= array2.length){
            bigger = array1.length;
            smaller = array2.length;
        }else{
            bigger = array2.length;
            smaller = array1.length;
        }
        for (int i = 0; i < smaller; i ++){
            boolean found = false;

            for (int j = 0; j < bigger; j++){

                if (i < array1.length && j < array2.length && array1[i] == array2[j]){
                    found = true;
                    break;
                }
                
            }
            if (!found){
                    theSame = false;
                    break;
                }else {
                    theSame = true;
                }

        }
        return theSame;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
