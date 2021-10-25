import com.calculatearea.*;
public class To_calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();
		RectanglePerimeter rp = new RectanglePerimeter();
		Square s = new Square();
		SquarePerimeter sp = new SquarePerimeter();
		
		System.out.println("Rectangle Area : " + r.rectangleArea(4,4));
		System.out.println("Rectangle Perimeter  : " + rp.rectanglePerimeter(4, 4));
		System.out.println("Square Area : " + s.squareArea(10));
		System.out.println("Square Perimeter  : " + sp.squarePerimeter(10));
	}

}
