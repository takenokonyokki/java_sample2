//抽象メソッドはないが、抽象クラスとしておくことで、インスタンス化を禁止している
//クラス型がインタフェースを継承する場合は、implementsを使用する
//クラス同士、インタフェース同士で継承する場合は、extendsを使用する
public abstract class TangibleAsset extends Asset implements Thing {
	//フィールド
	String color;
	double weight; //Thing interfaceを継承したため必要になったdouble型
	
	//共通のコンストラクタ
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	//共通のメソッド
	//getColorメソッド
	public String getColor() {
		return this.color;
	}
	
	//Thing interfaceを継承したため必要になったメソッド
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}