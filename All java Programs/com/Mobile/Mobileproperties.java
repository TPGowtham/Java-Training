package com.Mobile;
class Mobileproperties
 {
		public void showProperty()
		{
			System.out.println("color of mobile is black");
		}
}

class MobilepropertiesChild extends Mobileproperties {

	public void showProperty()
	{
		System.out.println("color of mobile is black");
	}

		public void main(String[] args) {

			MobilepropertiesChild m = new MobilepropertiesChild();
			
			m.showProperty();
	}
	
}
