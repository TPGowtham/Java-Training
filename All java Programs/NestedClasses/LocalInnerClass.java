package NestedClasses;


class ClassOuter {
	int no = 12;
	public void display() {
		
	}
	public void hello() {
		System.out.println("Hello method");
		class Local {
			int number = 14;
			void msg()
			{
				System.out.println("Local inner class");
			}
		}
		Local l = new Local();
		l.msg();
		System.out.println(l.number);
			
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassOuter o = new ClassOuter();
		o.hello();
		System.out.println(o.no);
		
	}

}
