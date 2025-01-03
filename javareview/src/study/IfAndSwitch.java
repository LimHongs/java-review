package study;

public class IfAndSwitch {
	public static void main(String[] args) {
		String today ="월요일";
		if(today =="월요일") {
			System.out.println("월요일입니다");
		}else {
			System.out.println("월요일아닙니다");
		}

		String book ="비트코인";
		switch(book) {
		case "주식":
			System.out.println("이책은주식입니다");
			break;
		case "비트코인":
			System.out.println("비트코인입니다");
			break;

		default:
			System.out.println("아무것도아닙니다");
		}
	}
}
