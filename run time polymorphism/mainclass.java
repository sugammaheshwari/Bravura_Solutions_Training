package day2interface;

public class mainclass {
	
	
	public static void main(String[] args)
	{
		laptop l1=new laptop(16,1000);				// parameterised constructor call
		computer c1=new computer(8,500);
		
		
		do_Work(l1);
		do_Work(c1);
	}
	
	
	public static void do_Work(gadget g)			// runtime polymorphism 
	{
		// does work according to following scheme
		// if its a laptop , then upgrades ram and HDD from existing computer (inherits from computer class ,overrides show_specs function
		// if its a computer then implements from the interface gadget .
		
		
		/*
		 *  note here order of if else is super important, if we write 
		 *  if(g instanceof computer )  first ,then since laptop extends computer class
		 *  it will result in true even if g is a laptop !!!
		 */
		
		if(g instanceof laptop)
		{
			System.out.println("entered instance of lappy");
			laptop l=(laptop) g;
			l.init_specs( 8, 500, true); 		//upgrading laptop specs !
			l.show_specs();  				// accessing show_specs method from laptop class
		}
		else if(g instanceof computer)
		{
			System.out.println("entered instance of computer");
			computer c=(computer)g;
			c.show_specs(); 			// accessing show_specs method from computer class 
		}
		
	}
	
	
	
	// function main2 to test and learn about run time polymorphism !
	
	public static void main2()
	{
		laptop l1=new laptop(8,1000);
		computer c1=(computer)l1; // computer c1=l1 , same thing !
		System.out.println(c1);

		// now even though in output c1 is displayed like an obj of laptop class ( due to typecasting) 
		//  still we can't access method of laptop class for object c1 , how to fix this ?
		
		laptop l=(laptop)c1;					// double type casting !!!
		l.init_specs(8, 500, true);
		
		System.out.println(l);
		
//		computer c2=new computer(5,50);
//		laptop l2=(laptop)c2;
		// this line will throw an error !
	
	}

}
