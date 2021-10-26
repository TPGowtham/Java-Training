package NestedClasses;

class OuterClass {
	int number = 12;
	public void Show()
	{
		System.out.println("Hello");
	}
	public void display()
	{
		
	}
	public static class InnerClass {
		int innernumber = 18;
		public void InnerMethod()
		{
			System.out.println("I am inner class");
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClass outer = new OuterClass();
		System.out.println(outer.number);
		outer.Show();
		
		OuterClass.InnerClass inner = new OuterClass.InnerClass();
		inner.InnerMethod();
		System.out.println(inner.innernumber);
				
		
		
	}

}
