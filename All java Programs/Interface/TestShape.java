// 1
package Interface;
interface Shape {
	
	void draw();
	void color();
}
public class TestShape implements Shape {

	@Override
	public void draw() {
		System.out.println("this is draw method");	
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("this is color method");		
	}
	public static void main(String args[])
	{
		TestShape ts = new TestShape();
		ts.color();
		ts.draw();
	}
}

