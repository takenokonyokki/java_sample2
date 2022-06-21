public class Code9Hero {
	String name;
	int hp;
	Code9Sword sword;
	
	public void attack() {
		System.out.println(this.name + "攻撃した");
		System.out.println("敵に5ポイントのダメージを与えた");
	}
	
	//コンストラクタ　クラスがnewされた直後に自動的に実行されるという特別な性質を持っている
	//コンストラクタは開発者が呼び出すものではなく、JVMが実行してくれるもの
	/*コンストラクタの条件
	 *①メソッド名がクラス名と完全に等しい
	 *②メソッド宣言に戻り値が記述されていない（voidもダメ）*/
	public Code9Hero() {
		this("JVM"); //this(引数)の形は、同一クラス内の別コンストラクタの呼び出しをJVMに依頼する
	}
	
	
	//コンストラクタのオーバーロード(同じ名前だが、引数が異なるメソッドを複数定義する)
	//コンストラクタで引数を指定
	public Code9Hero(String name) { //これで、コンストラクタで毎回異なる追加情報を受け取れる
		this.hp = 200;
		this.name = name; //引数の値でnameフィールドを初期化する
	}
}