package usecase;

import java.sql.Date;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;



public class TicketApplication {

	public static void main(String[] args) throws ClassNotFoundException {
  Scanner sc=new Scanner(System.in);
  TrainDAO td=new TrainDAO();
  Train t=new Train(1002,"shatabdi express","banglore","chennai",2500);
  TicketApplication ap=new TicketApplication();
  
  
  System.out.println("enter the trainno");
  int trainno=sc.nextInt();
  System.out.println("enter the source");
  String source=sc.next();
  System.out.println("enter the destination");
  String destination=sc.next();
  

		  System.out.println("enter the traveldate");
		  String Tdate=sc.next();
		  System.out.println("enter the number of passengers");
		  int no_passengers=sc.nextInt();
		 for(int i=1;i<=no_passengers;i++){
			 System.out.println("enter the name");
			 String name=sc.next();
			 System.out.println("enter the age");
			 int age=sc.nextInt();
			 System.out.println("enter the gender(M/F)");
			 String gender = sc.next();
			 
			 }
		 
	
		Ticket t1=new Ticket(TravelDate, t);
		     t1.generatePNR();
		     
		    
		 }
		}
		


