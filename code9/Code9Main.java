public class Code9Main {
	public static void main(String[] args) {
		
		Code9Hero h = new Code9Hero();
		/*new Code9Hero()で生成されたインスタンスを変数hに代入しているのではなく、
		 　実際はnewによって生成されるインスタンスのために確保されたメモリの先頭番地を代入いている。
		 　よって、変数hには、Code8Heroインスタンスのすべての情報(nameやhp)が入っているのではなく、
		 　Code9Heroインスタンスの情報を参照する場所のアドレス情報が入っている。
		 　変数hに入っているアドレス情報のことを参照という。
		 　このことからクラス型や配列型のことを参照型と呼ばれている。*/
		
		
		h.hp = 100;
		/*1.変数hのアドレス情報を参照する。
		 *2.そのメモリ内にアクセスする。
		 *3.そのメモリ内にあるhpフィールド部分探し出して100に書き換える
		 *この動作のことを参照の解決やアドレス解決という。*/
		
		
		Code9Hero h1 = new Code9Hero(); //Code9Heroインスタンスを生成し、このメモリの先頭番地をh1に代入
		h1.hp = 100; //h1のアドレス情報からhpフィールド部分を探し出し100に書き換える
		Code9Hero h2; //変数h2を定義
		h2 = h1; //変数h1の先頭番地をh2に代入。なので、h1とh2は同じ情報が入っており、全く同じのインスタンスとなる
		h2.hp = 200; //h2はh1と同じアドレス情報からhpフィールドを探し出して200に書き換えている。
		System.out.println(h1.hp); //よって、h1.hpは24行目で200に書き換えられているため、200と出力される
		
		
		
		Code9Sword s = new Code9Sword(); //Code9Swordのインスタンスを生成し、このメモリの先頭番地をsに代入
		s.name = "炎の剣"; //sのアドレス情報からnameフィールド部分を探し出して炎の剣を代入
		s.damage = 10; //上記と同じく10を代入
		Code9Hero h3 = new Code9Hero(); //Code9Heroのインスタンスを生成し、このメモリの先頭番地をh3に代入
 		h3.name = "ryuto"; //h3のアドレス情報からnameフィールド部分を探し出してryutoを代入
		h3.hp = 2000; //上記と同じく2000を代入
		h3.sword = s; //上記と同じで、今回はs(Code9Swordのアドレス情報)を代入
		System.out.println("現在の武器は" + h3.sword.name); //h3.swordはCode9Swordのアドレス情報が入っているので、そのnameは炎の剣となっている。よって、炎の剣と出力される。
		
		
		
		Code9Hero h4 = new Code9Hero(); //Code9Heroのインスタンスを生成し、このメモリの先頭番地をh4に代入
		h4.name = "moe"; //h4のアドレス情報からnameフィールドを探し出してmoeを代入
		h4.hp = 200; //上記と同じく200を代入
		Code9Hero h5 = new Code9Hero(); //Code9Heroのインスタンスを生成し、このメモリの先頭番地をh5に代入
// 		h5.name = "choko"; //h5のアドレス情報からnmaeフィールドを探し出してchokoを代入
//		h5.hp = 300; //上記と同じく300を代入
		Code9Wizard w = new Code9Wizard(); //Code9Wizardのインスタンスを生成し、このメモリの先頭番地をwに代入
		w.name = "tomoko"; //wのアドレス情報からnameフィールドを探し出してtomokoを代入
		w.hp = 20; //上記と同じく20を代入
		
		w.heal(h4); //Code9Wizardクラス型である変数wのhealメソッドを呼び出して、h4を渡す
		//healメソッドは引数にCode9Heroクラス型を指定しているため、Code9Heroクラス型の変数h4を渡している
		//処理として、healメソッドは
			/*public void heal(Code9Hero h) {
				h.hp += 10;
				System.out.println(h.name + "HPを10回復した" + "=" + h.hp);
			} 
			となっているため、h4のhpは200であり、hpに10をプラスされて、moeのHPを10回復した=210と出力される*/
		
		w.heal(h5); //上記と同じで、h5が引数として渡され、chokoのHPを10回復した=310と出力される
		w.heal(h5); //2回目なので310に10がプラスされた状態になる
	}
	
	
	
}
