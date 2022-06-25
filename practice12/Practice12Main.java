public class Practice12Main {
	public static void main(String[] args) {
		//12-2① objに対して呼び出せるメソッドは何か
		X obj = new A();
		obj.a();
//		obj.b(); Xクラスでは、定義されていないため、エラー発生
//		obj.c(); Xクラスでは、定義されていないため、エラー発生
		
		
		//12-2②
		Y y1 = new A();
		Y y2 = new B();
		y1.a(); //Aa
		y2.a(); //Ba
		
		
		//12-3
		Y[] y = new Y[2];
		y[0] = new A();
		y[1] = new B();
		
		for (Y yab : y) {
			yab.b();
		}
	}
}