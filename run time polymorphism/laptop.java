package day2interface;

public class laptop extends computer{

	boolean upgraded=false;
	
	laptop(int r,int h)
	{
		super(r,h);
	}
	
	public void init_specs(int r,int h,boolean upgrade)
	{
		if(upgrade) 
		{
			upgraded=true;
			int ram=super.getRam();ram+=r;					// upgrading 
			int hdd=super.getHDD();hdd+=h;
			//System.out.println(ram+" "+hdd);
			super.setHDD(hdd);super.setRam(ram);
		}
		else
			upgraded=false;
	}


	@Override
	public void show_specs() {
		// TODO Auto-generated method stub
		System.out.println("upgraded status:"+ upgraded);
		super.show_specs();
	}
	


	@Override
	public String toString() {
		super.show_specs();
		return "laptop [upgraded=" + upgraded + "]";
	}

	public boolean isUpgraded() {
		return upgraded;
	}
	
	
	
	
	
}
