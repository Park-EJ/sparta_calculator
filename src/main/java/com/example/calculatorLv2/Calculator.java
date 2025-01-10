package com.example.calculatorLv2;

import java.util.ArrayList;

public class Calculator {
    private int result;
    private ArrayList<Integer> resultList = new ArrayList<Integer>();

    // 연산 수행
    public int calculate(int num1, int num2, char operation) {
        result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;
    }

    // 연산 전체 결과값 불러오기
    public ArrayList<Integer> getResultList() {
        return this.resultList;
    }

    // 연산 결과를 컬렉션에 저장하기
    public void setResultList(int result) {
        this.resultList.add(result);
    }

    // 연산 종료 후 저장된 연산 결과 중 가장 먼저 저장된 데이터 삭제
    public void removeResult() {
        resultList.removeFirst();
    }
}