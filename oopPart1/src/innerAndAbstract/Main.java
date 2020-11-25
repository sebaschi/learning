package innerAndAbstract;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");

	public static void main(String[] args) {
		
		class ClickListener implements Button.OnClickListener {
			
			public ClickListener() {
				System.out.println("Ive been attached");
			}

			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked.");
			}
			
		}
		
		btnPrint.setOnClickListener(new ClickListener());
		listen();

	}
	
	public static void listen() {
		boolean quit = false;
		
		while(!quit) {
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 0:
				quit = true;
				break;
			case 1:
				btnPrint.onClick();
			}
		}
	}
}
//		// TODO Auto-generated method stub
//		Gearbox mcLaren = new Gearbox(6);
//		
//		mcLaren.operateClutch(true);
//		mcLaren.changeGear(1);
//		mcLaren.operateClutch(false);
//		System.out.println(mcLaren.wheelSpeed(1000));
//		mcLaren.changeGear(2);
//		System.out.println(mcLaren.wheelSpeed(3000));
//		mcLaren.operateClutch(true);
//		mcLaren.changeGear(3);
//		mcLaren.operateClutch(false);
//		System.out.println(mcLaren.wheelSpeed(6000));
////		Gearbox mcLaren = new Gearbox(6);
////		Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//////		Gearbox.Gear second = new Gearbox.Gear(2, 13.2); doesn't work
//////		Gearbox.Gear third = new mcLaren.Gear(2,23.4);
////		System.out.println(first.driveSpeed(1000));
		
		


