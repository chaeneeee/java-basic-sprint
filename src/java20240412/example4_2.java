package java20240412;

import java.util.Scanner;

public class example4_2 {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("1번 점수는?");
            int num1 = scanner.nextInt();
            System.out.println("2번 점수는?");
            int num2 = scanner.nextInt();
            System.out.println("3번 점수는?");
            int num3 = scanner.nextInt();
            System.out.println("4번 점수는?");
            int num4 = scanner.nextInt();
            System.out.println("5번 점수는?");
            int num5 = scanner.nextInt();
            //5명의 학생의 점수를 입력받아 배열에 저장한다음
            //평균 점수를 계산하여 출력하기
            int num [] = new int [5];
            num= new int[]{num1,num2,num3,num4,num5};

            System.out.println("평균 점수는 " + (num1+num2+num3+num4+num5)/5);

        }
}
