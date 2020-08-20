package day3_CustumException;

public class TicketBooker {

	private int tickets;
	
	public TicketBooker(int t) throws Custum{
		if(t<1 || t>6)
		{
			throw new Custum("please enter tickets in valid range (ie b/w 1-6 inclusive )");
		}
		else {
			this.tickets=t;
			System.out.println("Successfully bought "+ this.tickets + " tickets");
		}
	}
}
