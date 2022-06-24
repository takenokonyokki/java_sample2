public class PoisonMatanago extends Practice10Matango {
	//int型のpoisonCount（毒攻撃回数）が5
	int poisonCount = 5;
	
	//引数char型の変数suffixのコンストラクタ
	public PoisonMatanago(char suffix) {
		super(suffix); //引数1つの親コンストラクタを呼出し、引数で受け取ったsuffixを与える
	}
	
	public void attack(Code10Hero h) {
		super.attack(h); //親インスタンス部分のattack(h)を呼出している　super();とは別物であるので注意
		if (this.poisonCount > 0) { //もし、poisonCountが0以上であればのif文
			System.out.println("さらに毒の胞子をばらまいた");
			int dmg = h.hp / 5; //dmgに、変数hのhpを5で割ったものを代入　毒攻撃の固定ダメージ
			h.hp -= dmg; //変数hのhpからdmg(毒固定ダメージ)を引く
			System.out.println(dmg + "ポイントのダメージ");
			this.poisonCount--; //poisonCountを1引く
		}
	}
}