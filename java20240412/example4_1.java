package java20240412;

import java.util.Arrays;

public class example4_1 {
    public static void main(String[] args) {

        //10개의 정수 값을 저장할 수 있는 배열을 생성하고,
        // 1부터 10까지의 값을 배열에 저장한 후, 이를 출력하세요.
        int [] arr = new int [10];
        arr = new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(arr));
        //toString 가지고 있는 정보나 값들을 문자열로 만들어 줌

    }

}

