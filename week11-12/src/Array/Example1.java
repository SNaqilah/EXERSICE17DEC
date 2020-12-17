package Array;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Welcome to our zombie killer program!!!");
		
		String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};
		String zombies[]= {"Close-range zombie", "Mid-range zombie", "Long range zombie"};
		int numberZombiesHATE[]= {1, 12, 13, 14};
		int numberZombiesNOTHATE[];
		numberZombiesNOTHATE= new int[4];
		numberZombiesNOTHATE[0]=1;
		numberZombiesNOTHATE[1]=10;
		numberZombiesNOTHATE[2]=100;
		numberZombiesNOTHATE[3]=1000;
				
		System.out.println("Backpack items!");
		System.out.println("Backpack [0]");
		System.out.println("Backpack [1]");
		System.out.println("Backpack [2]");
		
		System.out.println("These are the zombies!");
		System.out.println("Backpack [0]");
		System.out.println("Backpack [1]");
		System.out.println("Backpack [2]");
		
		System.out.println(numberZombiesHATE[2]);
		System.out.println(numberZombiesNOTHATE[3]);
	}

}
