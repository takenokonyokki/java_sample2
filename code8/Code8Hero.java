public class Code8Hero {
	//属性を宣言するにはクラスブロックの中に変数宣言を記述する
	//クラスブロックに宣言された変数(name,hp)をフィールドという
	String name;
	int hp;
	
	//sleepメソッド
	//thisは特別に準備された変数で、「自分自身のインスタンス」という意味
	//.(ドット)は「の」という意味
	public void sleep() {
		this.hp = 100; //自分自身のインスタンスのhpフィールドに100を代入
		System.out.println(this.name + "100HP up");
	}
	
	//sitメソッド
	public void sit(int sec) { //int secで引数を指定
		this.hp += sec; //何秒座るかは引数で受け取る 座った秒数だけhpが回復する
		System.out.println(this.name + " " + sec + " " + "sit");
	}
	
	//slipメソッド
	public void slip() {
		this.hp -= 5; //自分自身のインスタンスのhpフィールドに-5をして代入
		System.out.println(this.name + " " + "slip");
	}
	
	//rubメソッド
	public void run() {
		System.out.println(this.name + " " + "run");
		System.out.println("lastHP" + " " + this.hp);
	}
}