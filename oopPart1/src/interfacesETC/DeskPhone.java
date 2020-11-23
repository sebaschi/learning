package interfacesETC;

public class DeskPhone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;

	public DeskPhone(int myNumber) {
		this.myNumber = myNumber;
	}

	public int getMyNumber() {
		return myNumber;
	}

	public void setMyNumber(int myNumber) {
		this.myNumber = myNumber;
	}

	public void setRinging(boolean isRinging) {
		this.isRinging = isRinging;
	}

	@Override
	public void powerOn() {
		System.out.println("NO action, this phone doesn't have a power button");
		
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now dialing " + phoneNumber + " on deskphone");
		
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the desk phone");
			isRinging = false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("RINGRING");
		} else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
