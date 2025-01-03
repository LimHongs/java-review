package study;

public class Child extends Parent {

	public Child(int monny) {
		super(monny);
	}


	@Override
	void hello() {
		System.out.println("안녕하세요 자식입니다.");
	}
}
