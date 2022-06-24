public class Code10Main {
	public static void main(String[] args) {
		Code10Hero h = new Code10Hero();
		h.name = "ryuto";
		h.run();
		SuperHero sh = new SuperHero(); //親クラスであるCode10Heroも呼び出される
		sh.name = "moe";
		sh.run();
		
		Weapon w = new Weapon();
	}
}