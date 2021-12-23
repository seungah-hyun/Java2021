package ����;

public abstract class GameObject { // �߻� Ŭ����
	protected int distance; // �� �� �̵� �Ÿ�
	protected int x, y; // ���� ��ġ(ȭ�� �� ���� ��ġ)
		
	public GameObject(int startX, int startY, int distance) { // �ʱ� ��ġ�� �̵� �Ÿ� ����
		this.x = startX; this.y = startY;
		this.distance = distance;
		}
		public int getX() { return x; }
		public int getY() { return y; }
		public boolean collide(GameObject p) { // �� ��ü�� ��ü p�� �浹������ true ����
			if(this.x == p.getX() && this.y == p.getY())
				return true;
			else 
				return false;
		}
		
		public abstract void move(); // �̵��� ���� ���ο� ��ġ�� x, y ����
		public abstract char getShape();// ��ü�� ����� ��Ÿ���� ���� ����
		protected abstract boolean collide1(GameObject p);
		 
		
}