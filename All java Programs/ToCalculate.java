import com.calculate.*;
public class ToCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition a = new Addition();
		Subtraction s = new Subtraction();
		Multiplication m = new Multiplication();
		
		System.out.println("Addition : " + a.addition(4, 55));
		System.out.println("Subtraction : " + s.subtraction(55, 45));
		System.out.println("Multiplication : " + m.multiplication(4, 55));
	}

}
