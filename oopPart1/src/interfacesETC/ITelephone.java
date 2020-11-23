package interfacesETC;

public interface ITelephone {
	
	//We don't need access modifiers.
	public void powerOn();
	public void dial(int phoneNumber);
	public void answer();
	public boolean callPhone(int phoneNumber);
	public boolean isRinging();

}
