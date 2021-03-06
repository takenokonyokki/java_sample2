//Itemクラスを継承
//クラスの継承は、子クラスは親クラスの一種であるが成り立つ場合に利用する
//Weaponクラス（子クラス）は、Itemクラス（親クラス）の一種である
public class Weapon extends Item {
	//この行には、自動的にsuper();がある。super();とは親(Item)インスタンスのコンストラクタを呼び出すもの
	//そして、Itemクラスには引数なしのコンストラクタはなく、3行目では引数なしでコンストラクタを呼び出そうとしているのでエラーが発生する
	//エラーを解決するには、引数ありのコンストラクタを呼び出さなければならない。
	
	public Weapon() {
		//super();に与える引数の数と型によって、「親インスタンス部分が初期化されるときに利用されるコンストラクタ」を明示的に指定できる
		super("3", 40); //親クラスの引数String nameのコンストラクタ呼出し、文字列3を与える
		System.out.println("4");
	}
}