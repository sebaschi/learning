package interfacesETC;

public class MobilePhone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;

	public MobilePhone(int myNumber) {
		this.myNumber = myNumber;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
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
		isOn = true;
		System.out.println("Mobile Phone power up");
		
	}

	@Override
	public void dial(int phoneNumber) {
		if(isOn) {
			System.out.println("Now dialing " + phoneNumber + " on mobile phone");
		} else {
			System.out.println("Phone is off");
		}
		
		
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the mobile phone");
			isRinging = false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber && isOn) {
			isRinging = true;
			System.out.println("RINGRING marimba");
		} else {
			isRinging = false;
			System.out.println("phone not on");
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}

