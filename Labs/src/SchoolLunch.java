import java.util.Scanner;

public class SchoolLunch {
	public static void main (String [] args){
		
		String breakfast;
		String hungry;
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" You are hungry ");
		System.out.println(" Get in lane ");
		System.out.println(" Buy lunch ");
		
		System.out.println(" Are you thirsty ? (yes or no) ");
	
		hungry = scan.nextLine();
		
		System.out.println("But did you have breakfast? ");
		breakfast = scan.nextLine();
		
		if( hungry.equals("yes") && breakfast.equals("yes") )  {
			System.out.println("Buy a diet coke fatty");
		} else if ( hungry.equals("yes") && breakfast.equals("no") ){
			System.out.println("Alright get yourself a regular coke");
		} else if( hungry.equals("no") && breakfast.equals("yes")){
			System.out.println("Grab a water");
		} else if( hungry.equals("no") && breakfast.equals("no")){
			System.out.println("Grab a water");
		} 
		
		System.out.println("Eat lunch");
		System.out.println("Return tray");
	}	
}
