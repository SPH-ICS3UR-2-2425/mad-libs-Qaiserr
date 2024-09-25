import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a person's name");
		String person = in.nextLine();
		System.out.println("Enter second person's name");
		String person2 = in.nextLine();
		System.out.println("Enter third person's name");
		String person3 = in.nextLine();
		System.out.println("Enter a number");
		String number = in.nextLine();
		System.out.println("Enter a game name");
		String name = in.nextLine();
		System.out.println("Enter a name of an event");
		String name2 = in.nextLine();
		System.out.println("Enter a verb ending in ing");
		String verb = in.nextLine();
		System.out.println("Enter second verb ending in ing");
        String verb2 = in.nextLine();
        System.out.println("Enter third verb ending in ing");
        String verb3 = in.nextLine();
		System.out.println("Enter a noun");
		String noun = in.nextLine();
	   System.out.println("Enter second noun");
	    String noun2 = in.nextLine();
	    System.out.println("Enter third noun");
        String noun3 = in.nextLine();
        System.out.println("Enter a adjective");
		String adjective = in.nextLine();
		System.out.println("Enter a second adjective");
        String adjective2 = in.nextLine();
        System.out.println("Enter a third adjective");
        String adjective3 = in.nextLine();
        
        System.out.println("Today,"+person+" was "+verb+" around "+noun);
        System.out.println( "After hours on end, "+person+" went to "+noun2+" and started "+verb2+"	with everyone.");
        System.out.println("while this was happening, "+adjective+" "+person2+" saw this and challenged him to a game of "+name+" and lost.");
        System.out.println("After "+person2+" met an embarassing loss, They decided to go to a "+adjective2+" "+noun3+" to settle things");
        System.out.println("So they made a "+adjective3+" competition involving "+verb3+" and ended up starting "+name2);
        System.out.println("Shortly after they were caught by "+person3+" and were sentenced to "+number+" years of prison");
        
	}

}
