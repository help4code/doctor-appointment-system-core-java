import java.util.*;
import java.io.*;
class AppointmentBooking
{
	ArrayList<String> doctorName=new ArrayList<String>();
	ArrayList<String> doctorQualification=new ArrayList<String>();
	ArrayList<String> doctorGender=new ArrayList<String>();
	ArrayList<String> doctorPassword=new ArrayList<String>();
	ArrayList<Integer> doctorAge=new ArrayList<Integer>();
	ArrayList<Long> doctorMobileNumber=new ArrayList<Long>();
	ArrayList<String> doctorCity=new ArrayList<String>();

	ArrayList<Integer> patientAge=new ArrayList<Integer>();
	ArrayList<String> patientName=new ArrayList<String>();
	ArrayList<String> patientGender=new ArrayList<String>();
	ArrayList<String> patientPassword=new ArrayList<String>();
	ArrayList<String> patientConfirmPassword=new ArrayList<String>();
	ArrayList<Long> patientMobileNumber=new ArrayList<Long>();

	ArrayList<Integer> patientAgeBooking=new ArrayList<Integer>();
	ArrayList<String> patientNameBooking=new ArrayList<String>();
	ArrayList<String> patientGenderBooking=new ArrayList<String>();
	ArrayList<Byte> doctorID=new ArrayList<Byte>();

	void dataAdd()		//method for creating Default docotr list present in the database.
	{
		doctorName.add("Nagarjun Raut");
		doctorName.add("Ankush Nag");
		doctorName.add("Prashant Jha");
		doctorName.add("Ashish Gadpayle");
		doctorName.add("Sandip Paul");
		doctorName.add("Himanshu Pokhle");
		doctorName.add("Amit Mule");

		doctorQualification.add("MBBS");
		doctorQualification.add("Er, MBBS");
		doctorQualification.add("MBBS, MD");
		doctorQualification.add("MBBS,MD");
		doctorQualification.add("BAMS");
		doctorQualification.add("MBBS, MD, Surgeon");
		doctorQualification.add("BAMS");

		doctorGender.add("M");
		doctorGender.add("M");
		doctorGender.add("M");
		doctorGender.add("M");
		doctorGender.add("M");
		doctorGender.add("M");
		doctorGender.add("M");

		doctorPassword.add("Nagarjun123");
		doctorPassword.add("Ankush123");
		doctorPassword.add("Prashant123");
		doctorPassword.add("Ashish123");
		doctorPassword.add("Sandip123");
		doctorPassword.add("Himanshu123");
		doctorPassword.add("Amit123");

		doctorAge.add(25);
		doctorAge.add(24);
		doctorAge.add(29);
		doctorAge.add(29);
		doctorAge.add(28);
		doctorAge.add(23);
		doctorAge.add(30);

		doctorMobileNumber.add(9422887565l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);

		doctorCity.add("Gondiya");
		doctorCity.add("Ranchi");
		doctorCity.add("Nagpur");
		doctorCity.add("Nagpur");
		doctorCity.add("Mumbai");
		doctorCity.add("Delhi");
		doctorCity.add("Chennai");

	}

	void admin() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		byte choice;
		boolean flag=true;

		while(flag)
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t |       Welcome Admin     |");
			System.out.println("\t\t |_________________________|");
			System.out.print("\n\n1. Doctor list \t2. Registered Patients \t3.Pateints with Appointment  \n\nEnter Your Choice.");
			choice=sc.nextByte();
			switch(choice)
			{
			case 1:
				for(int i=0; i<=doctorName.size()-1; i++)
				{
					System.out.println("Name: \t "+doctorName.get(i));
				
				}
				byte menuCHoice;
				System.out.println("\n\n1. Main menu\t 2. Previous menu");
				menuCHoice=sc.nextByte();
				if(menuCHoice==1)
				{
					flag=false;
					
				}
				else
				{
					break;
				}

				break;

			case 2:
					if(patientName.isEmpty())
					{
						System.out.println("No Registered Patients yet.");
						Thread.sleep(3000);
						break;
					}
					else 
					{
						for(int i=0; i<=patientName.size()-1; i++)
						{
							System.out.println(i+". "+patientName.get(i));
						}

						System.out.println("\n\n1. Main menu\t 2. Previous menu");
						menuCHoice=sc.nextByte();
						if(menuCHoice==1)
						{
							flag=false;
							
						}
						else
						{
							break;
						}
					}
					
					break;
				
			case 3:
				if(patientNameBooking.isEmpty())
				{
					System.out.println("\nNo Appointments yet.");
					Thread.sleep(3000);
					break;
				}
				
				else
				{
					for(int i=0; i<=patientNameBooking.size()-1; i++)
					{
						System.out.println(i+". "+patientNameBooking.get(i));
					}

					Thread.sleep(5000);
					flag=false;

				}
				break;
			default:
					System.out.println("Wrong choice");
					Thread.sleep(1000);
					flag=true;
			}


		}
		
	}

	void patient() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | Welcome to Patient Page!|");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
			System.out.println("1.Login \t 2.Registration\n");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					if(patientMobileNumber.isEmpty())
					{
						System.out.println("First register yourself then login..!");
						Thread.sleep(500);
						break;
					}
					else
					{
						patientLogin();
						flag=false;
						
					}
					
					break;
				case 2:
					patientRegistration();
					flag=false;
					break;
				

				default:
					System.out.println("\nYou entered wrong choice. enter your choice again....!!!");
					flag= true;
					Thread.sleep(1000);
					break;
			}
		}
	}


	void doctor() throws Exception
	{
		
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		boolean flag=true;
		while(flag)
		{
			//Thread.sleep(1000);
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | Welcome to Doctor Page! |");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
			

			System.out.println("1. Login \t 2.Registration");
			choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				if(doctorMobileNumber.isEmpty())
				{
					System.out.println("Register first...!");
					flag=false;
					Thread.sleep(500);
					break;

				}
				else
				{
					doctorLogin();
					flag=false;
				}

				break;
			case 2:
				doctorRegistration();
				flag= false;
				break;

			default:
				System.out.println("Entered Wrong choice..");
				flag=true;
			}
		}	

	}
	

	void patientLogin()throws Exception
	{

		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		long mobileNumber;
		byte choice;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\t\t  _________________________");
		System.out.println("\t\t |                         |");
		System.out.println("\t\t |         Login 		   |");
		System.out.println("\t\t |_________________________|");

		System.out.println("Enter your Username(mobilenumber)");
		mobileNumber=sc.nextLong();
		System.out.println("Enter your Password");
		String password=sc.next();
	
 		
 		boolean flag1=false;
 		int j;
		for(j=0; j<=patientMobileNumber.size()-1;j++)
		{
			
			if((patientMobileNumber.get(j)).equals(mobileNumber)&&(patientPassword.get(j)).equals(password))
			{
				flag1=true;

				break;
			}
			
		}
		if(flag1==true)
		{		
			Thread.sleep(1000);
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |     Book Appointment    |");
				System.out.println("\t\t |_________________________|");
			System.out.println("\n Welcome "+patientName.get(j)+", to book appointment, choose your doctor..");
			
			for(int i=0; i<=doctorName.size()-1; i++)
			{
				System.out.println((i+1)+". "+doctorName.get(i));
			}
			choice=sc.nextByte();
			doctorID.add(choice);
			

			
			while(flag)
			{
				Thread.sleep(1000);

				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |     Book Appointment    |");
				System.out.println("\t\t |_________________________|");
				
				
				//for(int i=0; i<=doctorName.size()-1;i++)
				//{
					if(choice<=doctorName.size() && choice>0)
					{
						System.out.println("\n\nName: \t "+doctorName.get(choice-1)+"\nAge: \t "+doctorAge.get(choice-1)+"\nMobile:  "+doctorMobileNumber.get(choice-1)+"\nCity: \t "+doctorCity.get(choice-1));
						System.out.println("\n Enter your name: \t");
						sc.nextLine();
						patientNameBooking.add(sc.nextLine());
						System.out.println(" Enter your age: \t");
						patientAgeBooking.add(sc.nextInt());
						System.out.println(" Enter your gender: \t");
						patientGenderBooking.add(sc.next());

						System.out.println("\n Booking Successfull..");

						Thread.sleep(1000);
						flag=false;
						break;
					}
					else 
					{
						System.out.println("\n enter correct input..");
						flag=true;
						Thread.sleep(1000);
					}
				
					
				//}
			}	

		}
		else 
		{
			System.out.println("Login unsuccessfull..");
			Thread.sleep(900);
			flag=false;
		}
	}

	void patientRegistration() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		long mobileNumber;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\n");
		System.out.println("\t\t | Welcome to Patient Registration Page!|");
		System.out.println("\n");
		System.out.println("Please enter your name");
		patientName.add(sc.nextLine());
		System.out.println("enter your age: ");
		patientAge.add(sc.nextInt());
		System.out.println("Please enter your Mobile number");
		mobileNumber=sc.nextLong();
		long mno;
		
		boolean flag=true, flag1=true;
		
		if(patientMobileNumber.isEmpty())
		{
			patientMobileNumber.add((mobileNumber));
			System.out.println("Enter password");
			patientPassword.add(sc.next());
			System.out.println("Registration is Successfull.");
			
			Thread.sleep(900);
			flag1=false;
						
		}
		else 
		{
			for(i=0;i<=patientMobileNumber.size()-1;i++)
			{
				mno=patientMobileNumber.get(i);
				
				if(mno==mobileNumber)
				{
					
					flag1=false;
					break;
				}
					
			}
			if(flag1==true)
			{
			patientMobileNumber.add(mobileNumber);
			System.out.println("Enter password");
			patientPassword.add(sc.next());
			System.out.println("Registration is Successfull.");
			Thread.sleep(900);
			}
			else 
			{
				System.out.println("same mobile numebr is not allowed\n");
				Thread.sleep(500);
			}
		}
	}
	

	void doctorRegistration() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		long mobileNumber;
		boolean flag=true, flag1=true;
					
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

			System.out.println("\t\t ----------------------------------");
			System.out.println("\t\t| This is doctor registration Page |");
			System.out.println("\t\t ----------------------------------");
			System.out.println("\n");
			
			System.out.println("Please enter your name");
			doctorName.add(sc.nextLine());

			System.out.println("Please enter your Mobile number");
			mobileNumber=(sc.nextLong());
			
			long mno;

				if(doctorMobileNumber.isEmpty())
					{
						doctorMobileNumber.add((mobileNumber));
						System.out.println("Enter password");
							doctorPassword.add(sc.next());
							System.out.println("Registration is Successfull.");
							Thread.sleep(900);
							flag1=false;
				
						
					}
				else 
				{
					for(i=0;i<=doctorMobileNumber.size()-1;i++)
					{
						mno=doctorMobileNumber.get(i);
						
						if(mno==mobileNumber)
						{
							
							flag1=false;
							break;
						}
							
					}
					if(flag1==true)
					{

								doctorMobileNumber.add(mobileNumber);
								System.out.println("Enter age:");
								doctorAge.add(sc.nextInt());
								System.out.println("Enter City: ");
								doctorCity.add(sc.next());
								System.out.println("Enter password");
								doctorPassword.add(sc.next());
								System.out.println("Registration is Successfull.");
								System.out.println("Details: Name: "+doctorName+" number:"+doctorMobileNumber);
								Thread.sleep(900);

					}
					else {
						System.out.println("same mobile numebr is not allowed\n");
						int index=doctorName.size()-1;
						doctorName.remove(index);
						Thread.sleep(500);

					}

				}
	}

	void doctorLogin() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		Long mobileNumber;
		//Thread.sleep(500);
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\t\t---------------------------------");
		System.out.println("\t\t| This is doctor login page     |");
		System.out.println("\t\t---------------------------------");
		System.out.println("Enter your Username(mobilenumber)");
		mobileNumber=sc.nextLong();
		System.out.println("Enter your Password");
		String password=sc.next();
		int i=0;
		byte choice;
 		
 		boolean flag=false;
 		boolean flag11=true;

		for(i=0; i<=doctorMobileNumber.size()-1;i++)
		{
			
			if((doctorMobileNumber.get(i)).equals(mobileNumber)&&(doctorPassword.get(i)).equals(password))
			{
				flag=true;
				break;
			}
		}
		
			if(flag==true)
			{
				while(flag11)
				{
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("\t\t----------------------------------------");
					System.out.println("\t\t| Welcome Doctor "+doctorName.get(i)+" |");
					System.out.println("\t\t----------------------------------------");
					System.out.println("\n\nPress 1 to see your Appointments. \n");
					choice=sc.nextByte();
					byte j=0;
					switch(choice)
					{
					case 1:
						if((doctorID.isEmpty()!=true))
						{
							while(j<=doctorID.size()-1)
							{


								if( (i+1)== doctorID.get(j) )
								{
									System.out.println("patient name: "+patientNameBooking.get(j) );
									j++;
									
								}
							}
							Thread.sleep(4000);
							
						}
						else 
							{
								System.out.println("No Appointments...!");
								Thread.sleep(3000);
								flag11=true;
							}

						break;
					}
				}
			}
			else 
				{
					System.out.println("Login unsuccessfull..");
					Thread.sleep(900);	
				}	
	}

	public static void main(String[] args) throws Exception   
	{
		AppointmentBooking ap=new AppointmentBooking();
		Scanner sc=new Scanner(System.in);
		ap.dataAdd();
		boolean flag=true;
		while(flag=true)
		{
			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
			System.out.println("---------------------------------------------------------------------");
			System.out.println("\t\t | Welcome to Doctor AppointmentBooking |");
			System.out.println("----------------------------------------------------------------------\n\n");
				System.out.println("\n1. Doctor \t 2. Patient \t 3. Admin \t 4. Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					ap.doctor();
					flag=true;
					break;
					case 2:
					ap.patient();										
					flag=true;
					break;
					case 3:
					
					ap.admin();
					flag= true;
					//Thread.sleep(1000);
					break;
					default:
					System.exit(0);

		}	}
	}
}
