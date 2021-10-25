package com.Mobile;
class Square {
	
	public void CalcArea()
	{
		System.out.println("No parameters");
	}
	public int CalcArea(int a)
	{
		return a * a;
	}
	public double CalcArea(double a)
	{
		return a * a;
	}
	public float CalcArea(float a)
	{
		return a * a;
	}		
	
}
public class Shapecalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		s.CalcArea();
		System.out.println(s.CalcArea(55));
		System.out.println(s.CalcArea(5.3));
		System.out.println(s.CalcArea(12.12345));
	}
}
