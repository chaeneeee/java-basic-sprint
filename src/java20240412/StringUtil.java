package java20240412;

public class StringUtil {


        /**
         *  reverse 하나의 String 을 매개변수로 받아
         *  그 문자열을 뒤집은 결과를 반복
         *  concat 두개의 String 을 매개변수로 받아
         *  이를 연결한 결과를 반환
         *  contains 하나의 String 과 하나의 문자를 매개변수로 받아
         *  주어진 문자열이 해당 문자를 포함하는지 여부를 반환
         *  유틸리티 파일은 static 으로 만든다
         */

        public static String reverse(String str) {
            String reverseString = "";  // 거꾸로 된 결과값 넣는 곳
            for (int i = str.length() - 1; i >= 0; i--) {
// 거꾸로 돌아야한다 str.length()  -1 이 마지막 index  i 는 index[0] 번 까지 --로 거꾸로 for문 돈다
                reverseString = reverseString + str.charAt(i);
            }                   //문자열          문자 타입으로 더해지면 문자열로 변환된다 문자열이 세서
            return reverseString;
        }
        public static String concat(String str1, String str2) {
            return str1 + str2;

        }

    public static String concat(String str1, String str2 ,String str3) {
        return str1 + str2 + str3 ;
            //오버로딩
    }


                //이렇게 안쓰고
//            String concatString = "";
            // String 더하는 건 연산자 쓸 수 있다.
//            concatString = str1 + str2;
//                return concatString;

//            return str1+str2; //바로 리턴해도 된다.


        public static boolean contains(String str, char c) {

            for (int i=0; i<str.length(); i++){
                if(str.charAt(i) ==  c ){   //equlas 안 쓰는 이유는 문자열이 아니라 문자라서
                     return  true;  // 끝까지 돌았는데도 못만났을 경우가 false 반복문이 종료될 시점에 false 를 넣어야한다
                }                   //반복문이 종료될 때 false가 나와야한다 else 넣지 않아도 된다 true 나오면 어치피 끝나니까

                }return false;
            }

            public static boolean contains2(String str1, String str2){
                for(int i=0; i < str2.length() - str1.length(); i++) {
                    boolean currentStingisEqual = true;
                    for(int j= i; j< i+str1.length(); i++){
            if(str2.charAt(j)!= str1.charAt(j-i)) {
                currentStingisEqual= false;
            }
                    }
                    if (currentStingisEqual) return  true;
                }


            return  false;
            }



    }

