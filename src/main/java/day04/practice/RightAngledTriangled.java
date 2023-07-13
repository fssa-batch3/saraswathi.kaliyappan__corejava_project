package day04.practice;

class RightAngledTriangle extends Polygon {
	
	protected double a1;
	protected double a2;
	protected double a3;
	
	public RightAngledTriangle(double a, double b,double c) throws Exception {
		super(3);
		if(a1 <= 0 || a2 <= 0|| a3 <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.a1 = a;
		this.a2 = b;
		this.a3 = c;
	}
	@Override
	public double circumstance() {
		// TODO Auto-generated method stub
		return this.a1 + this.a2+this.a3;  // formula: a3 = 2 * (l + W)
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}
	
}