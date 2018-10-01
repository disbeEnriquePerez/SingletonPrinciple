import java.util.*;
public class DriverClass {

	public static void main(String[] args) {	
	
	
	
	
	Users user1 = new Users("Enrique");
	Users user2 = new Users("Dani");
	Users user3 = new Users("Kiki");
	Users user4 = new Users("Kevin");
	
	write(user1, user2, user3, user4);
	
	System.out.println("Thank you for using the chat room");

	}

	public static void write(Users user1, Users user2, Users user3, Users user4)
	{
		Scanner keyboard = new Scanner(System.in);
		boolean status = true;
		while(status){
			System.out.println("Enter the number to speak for the following:\n"
					+ "1: Enrique\n2: Dani\n3: Kiki\n4: Kevin\n5: quit");
			int value = Integer.parseInt(keyboard.nextLine());
			switch(value) 
			{	
			case 1:
					user1.Write(prompt(user1,keyboard));
				break;
			case 2:
					user2.Write(prompt(user2,keyboard));
				break;
			case 3:
					user3.Write(prompt(user3,keyboard));
				break;
			case 4:
					user4.Write(prompt(user4,keyboard));
				break;
			case 5:
				status = false;
				break;
				
			}
		
		}
		
		
		
		}

	

	public static String prompt(Users user, Scanner keyboard) {
		System.out.print(user.getName() + ":");	
		return keyboard.nextLine();
	}
}