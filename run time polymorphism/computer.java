package day2interface;

public class computer implements gadget{

	private int ram;
	private int HDD;
	
	
	computer(int r,int h)
	{
		ram=r;
		HDD=h;
	}
	
	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHDD() {
		return HDD;
	}

	public void setHDD(int hDD) {
		HDD = hDD;
	}

	public void init_specs(int ram,int hdd)
	{
		this.ram=ram;
		this.HDD=hdd;
	}
	
	public void show_specs()
	{
		System.out.println(gadget.has_battery);
		System.out.println(this.ram);
		System.out.println(this.HDD);
	}
	
	@Override
	public String toString() {
		return "computer [ hasbattery =" + gadget.has_battery+ " ram=" + ram + ", HDD=" + HDD + "]";
	}

	
	
}
