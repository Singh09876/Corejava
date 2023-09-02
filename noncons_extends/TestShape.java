package com.rays.noncons_extends;

public class TestShape {
public static void main(String[] args) {
	Shape s=new Shape();
	s.area();
	Rectangle r=new Rectangle();
	r.setLenght(15);
	r.setWidth(40);
	r.area();
	
	Circle c=new Circle();
	c.setRadius(10);
	 
	Tringle t=new Tringle();
	t.setBase(10);
	t.setHight(20);
	t.area();
	
	
}

}
