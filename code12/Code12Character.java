public abstract class Code12Character {
	String name;
	int hp;
	
	public abstract void run();
	
	//引数をMonsterクラスにすることで、Monsterを継承しているクラスなら何でも受け付けられるようにできる
	public void attack(Code12Monster m) {
		System.out.println("attack");
	}
}