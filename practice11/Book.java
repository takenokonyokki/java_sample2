public class Book extends TangibleAsset { //TangibleAssetクラスを継承
	//継承先にないものを追加
	String isbn;
	
	//コンストラクタ
	public Book(String name, int price, String color, String isbn) {
		//super(引数);で、親クラスのコンストラクタを呼び出す
		super(name, price, color);
		this.isbn = isbn;
	}

	//メソッドを追加
	public String getIsbn() {
		return this.isbn;
	}
	
	
}