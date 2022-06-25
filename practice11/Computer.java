public class Computer extends TangibleAsset {
	//継承先にないものを追加
	String makerName;
	
	//コンストラクタ
	public Computer(String name, int price, String color, String makerName) {
		//super(引数);は、親クラスのコンストラクタを呼び出す
		super(name, price, color);
		this.makerName = makerName;
	}
	
	//メソッド追加
	public String getMakerName() {
		return this.makerName;
	}
}