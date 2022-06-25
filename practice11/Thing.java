//インタフェース
public interface Thing {
	//抽象メソッドとは、詳細未定のメソッド
	//抽象メソッドの形は、 public abstract 戻り値の型 メソッド名（引数リスト）;
	//インタフェースに宣言されるメソッドは、 public abstractが省略できる
	
	double getWeight(); //public abstract double getWeight()の
	
	void setWeight(double weight); // public abstract void setWeight(double weight)の省略形
}