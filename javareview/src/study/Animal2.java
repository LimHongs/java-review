package study;

public abstract class Animal2 {

	abstract void sound();
	// 추상메소드 나중에 animal2 를 상속받을떄 반드시 구현

	void sleep() {
		System.out.println("가는중");
	}
}
