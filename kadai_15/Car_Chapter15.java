package kadai_15;

public class Car_Chapter15 {
	// フィールド
		private int gear = 1;
		private int speed = 10;
		
		// メソッド
		public void gearChange(int afterGear) {
			switch(afterGear) {
			case 1  -> speed = 10;
			case 2  -> speed = 20;
			case 3  -> speed = 30;
			case 4  -> speed = 40;
			case 5  -> speed = 50;
			default -> speed = 10;
			}
			
			
			System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
			this.gear = afterGear;
		}
		public void run() {
			System.out.println("速度は時速" + speed + "kmです" );
		}

}
