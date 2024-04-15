package java20240412;

public class example4_3 {


    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 5, 6, 7, 8, 3, 4, 36, 6, 105, 23};
        findMaxMinNumber(array);
    }

    public static void findMaxMinNumber(int[] array) {
        int maxNum = array[0];  //array의 첫번째 값부터 비교해야해서
        int minNum = array[0];
        for (int i = 0; i < array.length; i++) {
            maxNum = Math.max(maxNum, array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            minNum = Math.min(minNum, array[i]);


        }
        System.out.println(minNum + "와" + maxNum);


        /**
         *
         * fineMaxNumber(new int [] {1,2,4,6,7,8,1-};
         * fineMinNumber(new int [] {-1,-2,-4,-5,-34};
         *
         *int max = arr[0];
         * int min= arr[0]
;
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         for(int i =0; i<arr.length; i++){
         if(max < arr[i]){
         max = arr[i];
         }
         if(min > arr[i]){
         min = arr[i];
         }}
         System.out.println("최대값은 : %d, 최소값은 :%d%n" , max, min);
         */





    }
}
