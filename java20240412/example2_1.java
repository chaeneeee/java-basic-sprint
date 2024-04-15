package java20240412;

import java.util.Scanner;

public class example2_1 {

    public static void main(String[] args) {


            //조건문으로 숫자는 0으로 나눌 수 없다.
            //사용자로부터 두 개의 숫자를 입력받아,
            // 이들에 대한 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
            //세 개의 다른 정수 값들을 비교하여
            // 가장 큰 수와 가장 작은 수를 결정하는 프로그램을 작성하세요.
            //&&, ||, ! 연산자를 사용하여 논리 연산

        Scanner scanner = new Scanner(System.in);
            System.out.println("첫 번째 수를 입력해주세요");
            String num1 = scanner.nextLine();
            System.out.println("연산자를 입력해주세요");
            String op = scanner.nextLine();
            System.out.println("두 번째 수를 입력해주세요");
            String num2 = scanner.nextLine();
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);

            double result = 0;

            if(num1.equals("0") || num2.equals("0")){
                System.out.println("0은 나눌 수 없는 수입니다.");
            } else if (op.equals("+")) {
                result = n1 +  n2;
            } else if (op.equals("-")) {
                result = n1 - n2;
            } else if (op.equals("*")) {
                result = n1 * n2;
            } else if (op.equals("/")){
                result = n1 / n2; }
            System.out.println(result);


        }

    }


