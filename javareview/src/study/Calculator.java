package study;


public class Calculator {
	// 리턴타입과 리턴값이 없는경우의 메소드 기능정의
	void add2(int a,int b) {
		int add2 = a + b;
		int result = a + b;
		System.out.println(result);
	}


	// 계산기 기능을 정의
	int add(int a, int b) {
		return a+b;
	}

	int subtract(int a,int b) {
		return a-b;
	}

	int multiply(int a, int b) {
		return a*b;
	}

	int divide(int a,int b) {
		if(b==0) {
			System.out.println("0으로 나눌수 없습니다");
		return 0;
		}
		return a/b;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		calculator.add2(3, 1);

		int sum = calculator.add(7, 8);

		int difference = calculator.subtract(10, 3);

		int product = calculator.multiply(3, 4);

		int divideResult = calculator.divide(9, 3);

		System.out.println(sum);
		System.out.println(difference);
		System.out.println(product);
		System.out.println(divideResult);

	}
}
