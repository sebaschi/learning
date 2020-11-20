package oopPart1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car porsche = new Car();
		Car holden = new Car();
		porsche.setModel("Carrera");
		
		BankAccount bobsAccount = new BankAccount();
		
		bobsAccount.withdraw(100.0);
		bobsAccount.deposit(100.0);
		
		bobsAccount.setAccountNumber("12345");
		bobsAccount.setBalance(345.60);
		bobsAccount.setCustomerName("Bob Willow");
		bobsAccount.setEmail("bobsmail@mailhub.com");
		bobsAccount.setPhoneNumber("0765463728");
		
		System.out.println();
		
		Animal animal = new Animal("Animal",1,1,5,5 );
		
		Dog dog = new Dog("Yorkie", 8,20,2,4,1,20, "long Haired");
		dog.eat();
		dog.move(30);
		System.out.println();
		dog.walk();
		dog.run();
		
		Fisch fisch = new Fisch("fischy",1,2,3,4,5);
		fisch.rest();
		fisch.move(23);
		fisch.swim(123);

	}

}
