// 2
package Interface;

interface shapes {
	void shapeMethod();
}

interface shape3d extends shapes {
	void shapeMethod3d();
}

public class TestShapes implements shape3d {

	@Override
	public void shapeMethod() {
	
		System.out.println("this is shapeMethod()");		
	}

	@Override
	public void shapeMethod3d() {
	
		System.out.println("this is shapeMethod3d()");		
	}

}
