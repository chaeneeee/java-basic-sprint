package java20240412;

import java.util.Scanner;

public class example2_2 {

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("첫 번째 수를 입력해주세요");
                int num1 = scanner.nextInt();
                System.out.println("두 번째 수를 입력해주세요");
                int num2 = scanner.nextInt();
                System.out.println("세 번째 수를 입력해주세요");
                int num3 = scanner.nextInt();

                int [] numbers= {num1, num2, num3 };
                int bestnum =0;

                for (int i=0; i<numbers.length; i++ ){
                    for (int j=0; j<numbers.length; j++){
                        if ( bestnum < numbers[j]){
                            bestnum = numbers[j];
                        }else bestnum= bestnum;
                    }

                }
                System.out.println(bestnum);




            }
        }

//음수값을 넣으면 오류가 뜬다 .
