
public class person2 {
	
	int ID;
	String LASTNAME;
	String FIRSTNAME;
	int AGE;
	
	public person2(int iD, String lASTNAME, String fIRSTNAME, int aGE) {
		super();
		ID = iD;
		LASTNAME = lASTNAME;
		FIRSTNAME = fIRSTNAME;
		AGE = aGE;
	}
	@Override
	public String toString() {
		return "person2 [ID=" + ID + ", LASTNAME=" + LASTNAME + ", FIRSTNAME=" + FIRSTNAME + ", AGE=" + AGE + "]";
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getLASTNAME() {
		return LASTNAME;
	}
	public void setLASTNAME(String lASTNAME) {
		LASTNAME = lASTNAME;
	}
	public String getFIRSTNAME() {
		return FIRSTNAME;
	}
	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
}
