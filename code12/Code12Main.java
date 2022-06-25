public class Code12Main {
	public static void main(String[] args) {
		Code12Character[] c = new Code12Character[5];
		c[0] = new Code12Hero();
		c[1] = new Code12Hero();
		c[2] = new Code12Hero();
		c[3] = new Code12Hero();
		c[4] = new Code12Hero();
		
		//配列でCode12Characterクラスを指定することで、Code12Characterを継承しているクラスなら何でも受け付けられるようにできる
		for (Code12Character ch : c) {
			ch.hp += 50;
		}
		
	}
}