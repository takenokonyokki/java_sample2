public class Main9 {
	public static void heal(int hp) { //healメソッドを定義
		hp += 10;
	}
	
	public static void heal(Thief thief) { //healメソッドを定義　引数違いによる　オーバーロード
		thief.hp += 10;
	}
	
	public static void main(String[] args) {
		int baseHp = 25; //int型のbaseHp変数に25を代入
		Thief t = new Thief("ryuto", baseHp); //Thiefインスタンスを生成し、Thiefクラス型の変数tに代入
		heal(baseHp); //引数int型のhealメソッドを呼出し int型のbaseHpを渡しても呼び出し元の値は変化しない
		System.out.println(baseHp + " : " + t.hp); //baseHpは25、t.hpも25
		heal(t); //引数Thiefクラス型のhealメソッドを呼出し 参照渡しにより呼出し元の値が変化する
		System.out.println(baseHp + " : " + t.hp); //baseHpは25、t.hpは35
	}
}