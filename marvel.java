
public class marvel {
	
	
    public static void main(String[] args) {
        Hero justHero = new Hero("���� ����");
        Hero IronMan = new IronAbility("���̾��");
        Hero SpiderMan = new SpiderAblity("�����̴���");
        justHero.attack();
        IronMan.attack();
        SpiderMan.attack();
        
        IronAbility IA=new IronAbility("���̾��");
        SpiderAblity SA=new SpiderAblity("�����̴���");
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
        System.out.printf("[%s]�� �Ϲ� ����!\n", name);
    }
}
class IronAbility extends Hero implements Healer {
	
	public IronAbility(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void attack() {
		System.out.printf("[%s]�� ��û�� ����!!!\n", name);
	}
	@Override
	public void heal() {
		System.out.printf("[%s]�� ü���� Ǯ��.\n", name);
		
	}
	@Override
	public void recovery() {
		System.out.printf("[%s]�� ü�� ȸ������ �����մϴ�.\n", name);
		
	}
	
}
class SpiderAblity extends Hero implements Spider {
	
	public SpiderAblity(String name) {
		super(name);
		
	}

	public void attack() {
		System.out.printf("[%s]�� �Ź��� ����!!!\n", name);
	}

	@Override
	public void WebSpray() {
		System.out.printf("[%s]�� �Ź����� �վ���ϴ�.!!!\n", name);
		
	}

	@Override
	public void teleport() {
		System.out.printf("[%s]�� �Ź�����Ÿ�� �̵��մϴ�.\n", name);
		
	}
}

