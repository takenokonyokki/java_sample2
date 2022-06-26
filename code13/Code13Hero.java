//publicは、すべてのクラスから呼び出せる。
//privateは、自分自身のクラスからのみ呼び出せる。
//何も書いていない場合は、package privateとなり、自分と同じパッケージに属するクラスからのみ呼び出せる。
//protectedは、自分と同じパッケージに属するか、自分を継承したクラスからのみ呼び出せる。

public class Code13Hero {
	private int hp; //privateは他のクラスからはアクセスできないようになる（変更ができない）。このCode13Heroクラス内であれば、thisを用いて読み書きはできる。
	private String name;
	
	//引数ありのコンストラクタ
//	public Code13Hero(String name, int hp) {
//		this.name = name;
//		this.hp = hp;
//	}
	
	//nameをprivateに設定しているため、他のクラスからは呼び出せない状態になっているため、メソッドを追加して他のクラスからnameを呼び出せるようにする
	//単にnameフィールドの中身を呼び出し、元に返すだけの単純なメソッドのことを総称してgetterメソッドという
	/*getterメソッドの定石(常識、習慣)
	 * public フィールドの型 getフィールド名() {
	 * 	return this.フィールド名;
	 * }
	 */
	public String getName() {
		return this.name;
	}
	
	
	//setterメソッド
	//ある特定のフィールドに指定された値を代入するだけのメソッドのこと
	/*setterメソッドの定石
	 * public void setフィールド名(フィールドの型 任意の変数名) {
	 * 	this.フィールド名 = 任意の変数名;
	 * }
	 */
	//値が妥当なのかをチェックすることができる
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断");
		}
		if (name.length() >= 9) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断");
		}
		this.name = name; //thisを付け忘れると後々問題が起きる可能性が出る
	}
	
	//publicなので、どのクラスからでも使用可能
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	
	//privateなので、このクラス内でのみ使用可能
	private void die() { //privateにすることで他のクラスから呼び出せなくする。このCode13Heroクラス内であれば呼び出せる。
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAMEOVERです");
	}
	
	//何も書いていないので、package privateとなり、このクラスと同じパッケージに属するクラスのみ使用可能
	void sleep() {
		this.hp = 100; //privateでもthisを用いて書くことができる
		System.out.println(this.name + "は眠って回復した");
	}
	
	public void attack(Code8Matango m) {
		System.out.println(this.name + "の攻撃");
		this.hp -= 2; //privateでもthisを用いて書くことができる
		if (this.hp <= 0) { //もしこのインスタンスのhpが0以下になったら
			this.die(); //dieメソッドはprivateメソッドであり、このクラス以外からは呼び出すことはできない。
		}
	}
}