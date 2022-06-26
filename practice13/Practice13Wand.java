public class Practice13Wand {
	private String name;
	private double power;
	
	public String getName() {
		return this.name;
	}
	
	public double getPower() {
		return this.power;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである");
		}
		if (name.length() < 3) {
			throw new IllegalArgumentException("名前は3文字以上でなければならない");
		}
		this.name = name;
	}
	
	public void setPower(double power) {
		if (power < 0.5 || power > 100) {
			throw new IllegalArgumentException("杖の増幅率は0.5以上100以下でなければならない");
		}
		this.power = power;
	}
}