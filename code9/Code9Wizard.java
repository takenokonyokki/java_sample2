public class Code9Wizard {
	String name;
	int hp;
	
	public void heal(Code9Hero h) {
		h.hp += 10;
		System.out.println(h.name + "HPを10回復した" + "=" + h.hp);
	}
}