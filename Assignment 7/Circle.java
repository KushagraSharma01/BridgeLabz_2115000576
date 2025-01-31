class Circle{
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	public void circumference(){
		System.out.println("Circumference of the circle is : "+(2*3.145915*radius));
	}
	public void area(){
		System.out.println("Area of the circle is : "+(3.145915*radius*radius));
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}
}