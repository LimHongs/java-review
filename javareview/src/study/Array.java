package study;

public class Array {
	public static void main(String[] args) {
		int [] arrayBox = new int [9];
		arrayBox = new int[9];
		System.out.println(arrayBox[3]);
// 객체는 기본적으로 참조자료형입니다. 객체라는것는 일단 jvm에 new키워드를 이용하여 메모리에 자바코드가 저장되는것을 의미함
// 그렇기때문에, MyClass obj; => 기본값이 null입니다.
// String은 참조자료형입니다. => null로 초기화가 된다.
// char => 기본자료형이지만
		String [] arrayBox2 = new String [2];
		// 2개의 공간이 만들어져쏙,기본값은 null입니다.
		System.out.println(arrayBox2[0]);
		System.out.println(arrayBox2[1]);

 //배열에 값을 넣는것을 초기화라고한다.
		int [] arrayBox1 = new int[9];
		arrayBox1[0] = 1;
		arrayBox1[1] = 2;
		arrayBox1[2] = 3;
		arrayBox1[3] = 4;
		arrayBox1[4] = 5;
		arrayBox1[5] = 6;
		arrayBox1[6] = 7;
		arrayBox1[7] = 8;
		arrayBox1[8] = 9;

		int [] arrayBoxEasy = {1,2,3,4,5,6,7,8,9};
		System.out.println(arrayBoxEasy);
		//[I@3d8c7aca => 배열의 값자체를 JVM 힙영역에 저장이 됨  하지만 배열같은 참조자료형은 이제 스택영역에있는
		// 주소값을 확인해서 힙영역의 데이터를 뽑아온다
		for(int i = 0; i < arrayBoxEasy.length; i++) {
			System.out.println(arrayBoxEasy[i]);
		}


	}
}
