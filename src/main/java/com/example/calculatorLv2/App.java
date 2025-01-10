package com.example.calculatorLv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            char operator = sc.next().charAt(0);

            if (num2 == 0 && operator == '/') {
                System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                continue;
            } else if (operator != '+' && operator != '-'
                    && operator != '*' && operator != '/') {
                System.out.println("잘못 입력하였습니다.");
                continue;
            }

            // 연산 수행
            int result = calculator1.calculate(num1, num2, operator);

            // 연산 결과 불러오기
            System.out.println("결과: " + result);

            // 연산 결과를 컬렉션에 저장하기
            calculator1.setResultList(result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String text = sc.next();

            if (text.equals("exit")) {
                System.out.println("종료되었습니다.");
                break;
            }
        }
        // 연산 종료 후 저장된 전체 결과값 출력
        System.out.println("전체 결과값: " + calculator1.getResultList());

        // 연산 종료 후 저장된 연산 결과 중 가장 먼저 저장된 데이터 삭제
        calculator1.removeResult();
        System.out.println("가장 먼저 저장된 결과값 삭제: " + calculator1.getResultList());
        sc.close();
    }
}
