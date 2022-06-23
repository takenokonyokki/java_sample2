//クラス名　extends　継承したいクラス名の形にすると、継承したいクラスと同じメンバの定義は省略できるようになる 
public class SuperHero extends Code10Hero {
	boolean flying;
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}
	
	//親クラスに書いてあるメソッドを再定義すると、上書きされる。このことをオーバーライドという。
	public void run() {
		System.out.println(this.name + "撤退した");
	}
	
//	public void slip() { オーバーライドしようとするとエラーが発生する
//	}
	
	
	//親インスタンスのメソッドを呼び出す
	//super.メソッド名;
	//superとは「今より1つ内側のインスタンス部分」を表す予約語である
	public void attack(Code8Matango m) { //attackメソッドをオーバーライド
		super.attack(m); //親インスタンスのattackメソッドを呼び出す
		if (this.flying) { //もし、飛んでいたら
			super.attack(m); //親インスタンスのattackメソッドを呼び出す
		}
	}
	
	
	//コンストラクタ
	public SuperHero() {
		//この行に自動的にsuper();が挿入される
		System.out.println("2");
	}
	
}