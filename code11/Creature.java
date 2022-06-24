//すべてのメソッドは抽象メソッドであり、基本的にフィールドを1つも持たないが満たされた場合
//インタフェース(interface)として特別扱いできる
public interface Creature {
	void run(); //インタフェースに宣言されたメソッドは自動的にpublicかつabstractになるため、省略できる。
}