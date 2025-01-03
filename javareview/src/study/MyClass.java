package study;

public class MyClass {
	//자바클래스에는 변수(속성)와 메소드(기능)가 있다.

	static	int a =1;
	static	int b =2;

	void methodOne() {
		int c =3; // 지역변수
		System.out.println(this.a);
		System.out.println(c);
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.methodOne();
		System.out.println(myClass.b);
	}

}
