package day01;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
//		사용자로부터 이름과 나이를 입력받아 "안녕하세요, [이름]님. [나이]살이시군요." 형식으로 환영 메시지를 출력하기
		
	String name = "송아성";
	int age = 33;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("이름 : ");
	sc.next();
	System.out.println("나이 : ");
	sc.nextInt();
	System.out.println("안녕하세요, " + name + "님. " + age + "살이시군요. ");
	
	}
}
