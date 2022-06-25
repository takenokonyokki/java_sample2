//未来に備えた、継承元となるクラス（継承の材料）を作るうえでの問題点・不都合
//abstractを記述し、抽象クラスとして宣言する
//抽象クラスは、newによるインスタンス化が禁止される
public abstract class Charcter {
	String name;
	int hp;
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	//戦う
//	public void attack(Code8Matango m) {
//		System.out.println(this.name + "の攻撃");
//		m.hp -= 10; //未来に完成するであろういろいろなクラスでは、与えるダメージが異なるため、確定できない詳細未定になる
//		System.out.println("敵にポイントのダメージを与えた");
//	}
	
	//上記のattackメソッドの問題点を解決する方法を以下に記述
	
	//詳細未定のメソッド（抽象メソッド）を宣言
	//public abstract 戻り値の型 メソッド名(引数リスト);
	//abstract（アブストラクト）とは、「抽象的」、「あいまい」という意味
	//下記の記述は、抽象メソッドといい、attack()メソッドは宣言すべきだが、具体的にどう動くか、内容がどうなるかまでは現時点では確定できないので、メソッド内部の処理はここでは記載しないということ
	public abstract void attack(Code8Matango m);
}