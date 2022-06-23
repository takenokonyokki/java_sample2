public class Code10Hero {
	String name;
	int hp = 100;
	
	public void attack(Code8Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントダメージを与えた");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	//finalを付けることでメソッドでもオーバーライドを禁止できる
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ");
	}
	
	
	//コンストラクタ
	public Code10Hero() {
		System.out.println("1");
	}
}