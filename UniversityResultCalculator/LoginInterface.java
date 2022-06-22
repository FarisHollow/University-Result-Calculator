package logininterface;

import java.util.Scanner;

public class LoginInterface
{
    public void LoginInterface() 
    {
        Scanner input = new Scanner(System.in);
        
        String username;
        String password;
		System.out.println(" Hey, If you are Moinul or Faris");
		System.out.println(" Then your username is username");
		System.out.println(" and your password is password");
		System.out.println("Enter Username: ");
        username = input.nextLine();
        System.out.println("Enter Password: ");
        password = input.nextLine();
        
        if(username.equals("username") && (password.equals("password"))) 
		{
	        System.out.println("                                 ");
            System.out.println("**********Welcome Admin**********");
            System.out.println("                                 ");
            System.out.println("                                 ");
 
            System.out.println("Press 1: To Calculate Result");
            System.out.println("Press 2: Exit");
		}
		else
		{
			System.out.println("#Error Access");
		}
			
    }
}
