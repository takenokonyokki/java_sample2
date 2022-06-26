public class Practice13Wizard {
	private int hp;
	private int mp;
	private String name;
	private Practice13Wand wand;
	
	public int getHp() {
		return this.hp;
	}
	
	public int getMp() {
		return this.mp;
	}
	
	public String getName() {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである");
		}
		if (name.length() < 3) {
			throw new IllegalArgumentException("名前は3文字以上でなければならない");
		}
		return this.name;
	}
	
	public Practice13Wand getWand() {
		return this.wand;
	}
	
	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		}
		else {
			this.hp = hp;
		}
		this.hp = hp;
	}
	
	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("mpは0以上でなければならない");
		}
		this.mp = mp;
	}
	
	public void setPractice13Wand(Practice13Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("杖が装備されていません");
		}
		this.wand = wand;
	}
	
	public void heal(Code13Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}
}