public class Practice10Matango {
	int hp = 50; //hpフィールド定義　50で初期化
	char suffix; //suffixフィールド定義
	
	//引数char型の変数suffixのコンストラクタ
	public Practice10Matango(char suffix) {
		this.suffix = suffix; //引数でもらったsuffixを受け取る
	}
	
	//attackメソッド引数Code10Heroクラス型の変数h
	public void attack(Code10Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}