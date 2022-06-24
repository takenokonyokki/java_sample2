public class Item {
	String name; //nameフィールド
	int price; //priceフィールド
	
	//引数String nameのコンストラクタ
	public Item(String name) {
		this.name = name; //nameは引数から受け取る
		this.price = 0; //priceは0で初期化
		System.out.println(this.name);
	}
	
	//引数String nameとint priceのコンストラクタ　また、オーバーロード
	public Item(String name, int price) {
		this.name = name; //nameは引数で受け取る
		this.price = price; //price1も引数で受け取る
		System.out.println(this.name + " " + this.price);
	}
	
}