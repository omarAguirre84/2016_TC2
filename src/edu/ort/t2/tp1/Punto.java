package edu.ort.t2.tp1;


public class Punto {

	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	////////////////////////////

	@Override
	 public String toString() {
	 return "[x=" + x + ", y=" + y + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Punto punto1 = new Punto();
		Punto punto2 = new Punto();
		
		punto1.setX(1);
		punto1.setY(3);
		
		punto2.setX(10);
		punto2.setY(20);
		System.out.println(punto1.toString());
		System.out.println(punto2.toString());
	}
}
