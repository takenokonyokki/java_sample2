public class Code13King {
	void talk(Code13Hero h) {
		//Code13Heroのnameはprivateによりh.nameでは呼び出せないため、h.getName()メソッドを経由して呼び出すようにする
		System.out.println("ようこそ我が国へ、勇者" + h.getName() + "よ");
	}
}