import adminintroduction.*;
import exit.*;
import selectyourpreferreduniversity.*;
import logininterface.*;
import insertnewresult.*;
import java.util.Scanner;


public class UniversityResultCalculator
{
    public static void main(String[] args)
    {
		
		Student s1 = new Student ("Moinul Islam", 20, "islammoinul42390@gmail.com", false, "20-42390-1") ;
		s1.hasStudentId() ;
		s1.display() ;
		System.out.println("                                                ");
		System.out.println("*********************************") ;
		Student s2 = new Student ("Mir Faris", 20, "mirfaris79@gmail.com", false, "20-42241-1") ;
		s2.hasStudentId() ;
		s2.display() ;
		
		AdminIntroduction ai = new AdminIntroduction();
        ai.AdminIntroduction();
        Scanner input1  = new Scanner(System.in);
        int a;
        a = input1.nextInt();
        if(a==1)
        {
            SelectYourPreferredUniversity supu = new SelectYourPreferredUniversity();
			supu.SelectYourPreferredUniversity();
			Scanner input2  = new Scanner(System.in);
			int b;
			b = input2.nextInt();
			if(b==1)
			{
				LoginInterface lif = new LoginInterface();
				lif.LoginInterface();
				Scanner input3 = new Scanner(System.in);
                int c;
				int d;
				
				c = input3.nextInt();
				d = input3.nextInt();
                
				if (c==1)
				{
					InsertNewResult inr = new InsertNewResult();
					inr.InsertNewResult();
				}
				else if (d == 2)
				{
					 Exit e = new Exit();
                     e.Exit();
				}
				
				
			}
			else if(b==2)
			{
				LoginInterface lif = new LoginInterface();
				lif.LoginInterface();
				Scanner input3 = new Scanner(System.in);
                int c;
				int d;
				

                c = input3.nextInt();
                d = input3.nextInt();
                
				if (c==1)
				{
					InsertNewResult inr = new InsertNewResult();
					inr.InsertNewResult();
				}
				else if (d == 2)
				{
					 Exit e = new Exit();
                     e.Exit();
				}
			}
			else if(b==3)
			{
				LoginInterface lif = new LoginInterface();
				lif.LoginInterface();
				Scanner input3 = new Scanner(System.in);
                int c;
				int d;
				

                c = input3.nextInt();
                d = input3.nextInt();
                
				if (c==1)
				{
					InsertNewResult inr = new InsertNewResult();
					inr.InsertNewResult();
				}
				else if (d == 2)
				{
					 Exit e = new Exit();
                     e.Exit();
				}
			}
			else if(b==4)
			{
				LoginInterface lif = new LoginInterface();
				lif.LoginInterface();
				Scanner input3 = new Scanner(System.in);
                int c;
				int d;



                c = input3.nextInt();
                d = input3.nextInt();
                
				if (c==1)
				{
					InsertNewResult inr = new InsertNewResult();
					inr.InsertNewResult();
				}
				else if (d == 2)
				{
					 Exit e = new Exit();
                     e.Exit();
				}
			}
			else if(b==5)
			{
				LoginInterface lif = new LoginInterface();
				lif.LoginInterface();
				Scanner input3 = new Scanner(System.in);
                int c;
				int d;



                c = input3.nextInt();
                d = input3.nextInt();
                
				if (c==1)
				{
					InsertNewResult inr = new InsertNewResult();
					inr.InsertNewResult();
				}
				else if (d == 2)
				{
					 Exit e = new Exit();
                     e.Exit();
				}
			}
			
        }
        else if(a==2)
        {
            Exit e = new Exit();
            e.Exit();
        }
    }
	 
}
