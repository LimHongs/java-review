package study;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getName());
		person.setName("안녕");
		System.out.println(person.getName());
	}
}
// 오버라이딩 : 부모클래스에서 정의한 메서드를 자식클래스에서 메서드를 재정의(Override) 하는것을 의미 자식클래스한테 상속할때는 extends를 사용할것
// 오버로딩: 동일한 이름의 메서드를 여러 개 정의하되 매개변수의 타입이나 개수를 다르게 정의하는것 상속관계는 필요없음
