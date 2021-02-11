import java.util.Scanner;
public class Method0 {
	
	  //This method returns your university ID
	public static int un (int i ) { 
		int un = i;
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter your university ID : ");
	    int id = input.nextInt();
	    
			return un;
			}
	//This method prints your name only and does not return anything (void)
	  public static void yourname(){
			Scanner input = new Scanner(System.in);
		    System.out.println("Enter your name : ");
			 String yourname = input.nextLine();
	  }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter your university ID : ");
	    int un = input.nextInt();
        yourname();
      in();
        All();
	}
	

	//This method returns your major
	public static String in () { 
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter your Major : ");
		 String in = input.nextLine();
		return in;
	}
	// This method prints your name, university ID, and major
	public static void All(){
		Scanner input = new Scanner(System.in);
	    System.out.println("Please write the following:");
	    System.out.println("Enter your university ID : ");
	    System.out.println("Enter your name : ");
	    System.out.println("Enter your Major : ");

	    int un = input.nextInt();
		    
		    int id = input.nextInt();

		    String yourname = input.nextLine();
		        yourname();

		        String in = input.nextLine();
                     in();
}
}
