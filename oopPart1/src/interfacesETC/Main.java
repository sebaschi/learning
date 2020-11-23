package interfacesETC;

public class Main {

	public static void main(String[] args) {
		ITelephone sebsPhone;
		sebsPhone = new DeskPhone(799642729);
		sebsPhone.powerOn();
		sebsPhone.callPhone(799642729);
		sebsPhone.answer();
		
		sebsPhone = new MobilePhone(789);
		sebsPhone.powerOn();
		sebsPhone.callPhone(789);
		sebsPhone.answer();
		
	}

}
