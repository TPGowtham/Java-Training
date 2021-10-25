// 3
package Interface;

interface Drawable {
	void draw();	
    void squareArea();
	void squareArea(int l);
	
}
public class Square implements Drawable{

	@Override
	public void draw() {
		System.out.println("this is draw() method");		
		
	}

	public void squareArea(int length) {
		
		
	}

	@Override
	public void squareArea() {
		// TODO Auto-generated method stub
		
	}

}
