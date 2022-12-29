package bloco8;

public class TriangleObject { // public == pode ser acessado por outro arquivo.
	public double a, b, c, area;
	
	public void calcArea() {
		double p;
		p = (this.a + this.b + this.c)/2;
		this.area = Math.sqrt(p * (p-this.a) * (p-this.b) * (p-this.c));
	}
	
}
