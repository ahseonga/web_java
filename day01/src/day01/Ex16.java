package day01;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
//		두 개의 실수형 변수 num1과 num2를 선언하고, 사용자로부터 입력을 받아 두 수를 나눈 결과를 소숫점 두 자리까지 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 실수 입력 : ");
		double num1 = sc.nextDouble();
		System.out.println("두번째 실수 입력 : ");
		double num2 = sc.nextDouble();
		
		double result = num1/num2;
		
		System.out.printf("결과 값은 : %.2f", result);
		
		

	}
}
