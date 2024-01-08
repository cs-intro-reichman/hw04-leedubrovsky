public class ArrayOps {
    public static void main(String[] args) {
        int [] array = {2,8,3,7,8};
        System.out.println(secondMaxValue(array));
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
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
