package study;

public class WateringDispenser {

		int sharedWater =12;
		//가장 바깥영역에 있는 변수선언한 전역변수
		// 지역변수는 해당영역에서만 사용가능
		void drinkWater(int amount) {
			sharedWater = sharedWater - amount;
		}

		void checkWater() {
			if(sharedWater>0) {
				int y = sharedWater;
			}
		}

		public static void main(String[] args) {

		}
}
