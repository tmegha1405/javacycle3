import java.util.Scanner;

class Person
{
	Scanner in=new Scanner(System.in);
	String name,gender,address;
	int age;
	Person()
	{
		System.out.println("\nEnter name");
		name=in.nextLine();
		System.out.println("Enter gender if male M if female F others O");
		gender=in.nextLine();
		System.out.println("Enter address");
		address=in.nextLine();
		System.out.println("Enter age");
		age=in.nextInt();
		
	}
	void display()
	{
		 System.out.println("\n********Information of all Persons************");
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Address:"+address);
		System.out.println("Age:"+age);
	}
}
class Employee extends Person
{
	int empid;
	float salary;
	String cname,quali;
	
	Employee()
	{
		System.out.println("\nEnter Employee id");
		empid=in.nextInt();
		System.out.println("Enter Company Name");
		cname=in.next();
		System.out.println("Enter Education Qualification");
		in.skip("[\r\n]+");
		quali=in.next();
		System.out.println("Enter Salary");
		salary=in.nextFloat();
		
	}
	void display()
	{
		super.display();
		System.out.println("Employee id:"+empid);
		System.out.println("Company name:"+cname);
		System.out.println("Qualification:"+quali);
		System.out.println("Salary:"+salary);
	}
}
class Teacher extends Employee
{
	int tid;
	String sub,dept;
	
	Teacher()
	{
		System.out.println("\nEnter Teacher id");
		tid=in.nextInt();
		System.out.println("Enter Subject");
		sub=in.next();
		System.out.println("Enter Department");
		in.skip("[\r\n]+");
		dept=in.next();
		
	}
	void display()
	{
		super.display();
		System.out.println("Teacher id:"+tid);
		System.out.println("Subject:"+sub);
		System.out.println("Department:"+dept);
	}
}

public class Details
{
	public static void main(String args[])
	{
		int i=-1;
		Teacher[] t=new Teacher[10];
		Scanner in=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n1.Insert Teacher");
			System.out.println("2.Display Teachers");
			System.out.println("3.Exit");
			System.out.println("Enter your choice!!!");
			int choice = in.nextInt();
			switch(choice)
			{
				case 1:t[++i]=new Teacher();
						break;
				case 2:for(int j=0;j<=i;j++)
						t[j].display();
						break;
				case 3:System.exit(1);
						break;
				default:System.out.println("Invalid Choice");
			}
		}
	}
}
		
