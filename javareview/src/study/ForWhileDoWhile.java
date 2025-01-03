package study;

import java.util.Scanner;

public class ForWhileDoWhile {
	public static void main(String[] args) {
		/*
		 * //for(초기식,조건식,증강식){} for(int i = 1; i< 10; i++) {
		 * System.out.println("숫자: "+i); }
		 */
		//초기식
		//while(조건식){반복할코드;증강식} => 결말이 정해진경우
		//while(조건식) => 결말이 정해져있지 않은 경우
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        while(input.equals("안녕")) {
        	System.out.println("안녕3");
        	break;
        }
	}
}
