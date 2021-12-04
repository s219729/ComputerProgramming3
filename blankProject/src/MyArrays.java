public class MyArrays {
    public static int max(int[] array){
        if(array == null){
            return 0;
        }
        if(array.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static int odd(int[] array){
        if(array == null){
            return 0;
        }
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 != 0){
                counter += 1;
            }
        }
        return counter;
    }

}
