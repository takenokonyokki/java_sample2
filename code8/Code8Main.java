public class Code8Main {
	public static void main(String[] args) {
		//Code8Heroインスタンスを生成
		Code8Hero h = new Code8Hero();
		
		//フィールドに初期値をセット
		h.name = "ryuto";
		h.hp = 100;
		System.out.println("Hero" + " " + h.name + " " + "generation");
		
		//Code8Matangoインスタンスを2つ生成し初期値をセット
		Code8Matango m1 = new Code8Matango();
		m1.hp = 200;
		m1.suffix = 'A';
		
		Code8Matango m2 = new Code8Matango();
		m2.hp = 300;
		m2.suffix = 'B';
		
		
		//Code8Heroのメソッドを呼び出す
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		
		//Code8Matangoのメソッドを呼び出す
		m1.run();
		m2.run();
	}
}