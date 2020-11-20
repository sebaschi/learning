package oopPart1;

public class VipCustomer {

	private String name;
	private double limit;
	private String eMial;
	
	public VipCustomer() {
		this("noName", 10000.0, "noEmail");
	}
	public VipCustomer(String name, String eMail) {
		this(name, 10000.0, eMail);
	}
	public VipCustomer(String name, double limit, String eMail) {
		this.name = name;
		this.limit = limit;
		this.eMial = eMail;
	}
}
