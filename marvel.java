
public class marvel {
	
	
    public static void main(String[] args) {
        Hero justHero = new Hero("그저 영웅");
        Hero IronMan = new IronAbility("아이언맨");
        Hero SpiderMan = new SpiderAblity("스파이더맨");
        justHero.attack();
        IronMan.attack();
        SpiderMan.attack();
        
        IronAbility IA=new IronAbility("아이언맨");
        SpiderAblity SA=new SpiderAblity("스파이더맨");
        IA.heal();
        IA.recovery();
        SA.WebSpray();
        SA.teleport();
    }
}


interface Healer {
    void heal();
    void recovery();
}

interface Spider {
    void WebSpray();
    void teleport();
}

class Hero {
    protected String name;
    protected int hp = 100;

    public Hero(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.printf("[%s]의 일반 공격!\n", name);
    }
}
class IronAbility extends Hero implements Healer {
	
	public IronAbility(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void attack() {
		System.out.printf("[%s]의 엄청난 공격!!!\n", name);
	}
	@Override
	public void heal() {
		System.out.printf("[%s]의 체력이 풀피.\n", name);
		
	}
	@Override
	public void recovery() {
		System.out.printf("[%s]의 체력 회복력이 증가합니다.\n", name);
		
	}
	
}
class SpiderAblity extends Hero implements Spider {
	
	public SpiderAblity(String name) {
		super(name);
		
	}

	public void attack() {
		System.out.printf("[%s]의 거미줄 공격!!!\n", name);
	}

	@Override
	public void WebSpray() {
		System.out.printf("[%s]의 거미줄을 뿜어냅니다.!!!\n", name);
		
	}

	@Override
	public void teleport() {
		System.out.printf("[%s]의 거미줄을타고 이동합니다.\n", name);
		
	}
}

