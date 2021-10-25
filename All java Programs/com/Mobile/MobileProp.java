package com.Mobile;

 class MobilePropParent {
	  void showProperty()
		{
			System.out.println("color of mobile is black");
		}
	  void display()
		{
			System.out.println("displaying");
		}
 }
 class MobilePropChild extends MobilePropParent{
	 
	  void showProperty()
		{
			System.out.println("color of mobile is black");
		}
 }
 public class MobileProp{
		
	public static void main(String[] args) {

		MobilePropChild m = new MobilePropChild();
		
		m.showProperty();
		m.display();
	}
}


