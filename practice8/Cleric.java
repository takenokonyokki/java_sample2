//import java.util.*;
//8-1
public class Cleric {
	//8-2
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;
	
	//8-3
	public void selfAid() {
		System.out.println(this.name + "slfAid");
		this.hp = this.MAXHP;
		this.mp -= 5;
		System.out.println("lifup");
	}
	
	//8-4
	public int pray(int sec) {
		int recover = new java.util.Random().nextInt(3) + sec; //ランダム生成した数値に秒数を足す
		
		//Math.minメソッドは引数に指定した2つの値のうち小さいほうを取得する
		//よって、MAXMPからmpを引いた値かランダム生成した値のrecoverの小さいほうを取得している
		//MAXMP-mpにしている理由は、最大mp量を上回る回復量にしないため
		//例)MAXMPは10、mpが5で、ランダム生成した値が10だとしたときに、10の方を回復量にしたらMAXMPが15になってしまいMAXMPを超えてしまうから
		int recoverActual = Math.min(this.MAXMP - this.mp, recover); 
		
		this.mp += recoverActual; //mpにrecoverActualの値を足す
		System.out.println("MP" + "+" + recoverActual);
		
		return recoverActual; //戻り値は実際に回復した量を表すrecoverActualを指定している
	}
}