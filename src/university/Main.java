package university;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	ArrayList<Employee>list=new ArrayList<Employee>();
	
	while (true) {
	System.out.println("\n---University Management System---");
	System.out.println("1-Add Academician");
	System.out.println("2-Add Assistant");
	System.out.println("3-Add Officer");
	System.out.println("4-Add Computing");
	System.out.println("5-Add Security Guard");
	System.out.println("6-Add Teacher");
	System.out.println("7-List All Employess");
	System.out.println("8-Exit");
	System.out.println();
	System.out.print("Select an opinion: ");
	int select= s.nextInt();
	s.nextLine();	//new line
	
	if(select==1) {
		System.out.println("Full Name: ");
		String fullName= s.nextLine();
		
		System.out.println("Email: ");
		String email= s.nextLine();
		
		System.out.println("Phone Number: ");
		String phoneNumber=s.nextLine();
		
		System.out.println("Department: ");
		String section= s.nextLine();
		
		System.out.println("Duty: ");
		String duty=s.nextLine();
		
		Academician a1= new Academician();
		a1.fullName=fullName;
		a1.mail=email;
		a1.phoneNumber=phoneNumber;
		a1.section=section;
		a1.duty=duty;
		
		list.add(a1);
		System.out.println("Academician added successfully.");
		
	} else if (select==2){
		System.out.println("Full Name: ");
		String fullName= s.nextLine();
		
		System.out.println("Email: ");
		String email= s.nextLine();
		
		System.out.println("Phone Number: ");
		String phoneNumber=s.nextLine();
		
		System.out.println("Department: ");
		String section= s.nextLine();
		
		System.out.println("Duty: ");
		String duty=s.nextLine();
		
		System.out.println("Degree: ");
		int degree =s.nextInt();
		
		Assistant as1= new Assistant();
		as1.fullName=fullName;
		as1.mail=email;
		as1.phoneNumber=phoneNumber;
		as1.section=section;
		as1.duty=duty;
		as1.degree=degree;
		
		list.add(as1);
		System.out.println("Assistant added successfully.");
		
		
	}else if (select==3) {
		System.out.println("Full Name: ");
		String fullName= s.nextLine();
		
		System.out.println("Email: ");
		String email= s.nextLine();
		
		System.out.println("Phone Number: ");
		String phoneNumber=s.nextLine();
		
		System.out.println("Department: ");
		String section= s.nextLine();
		
		System.out.println("Shift: ");
		String shift=s.nextLine();
		
		Officer o1= new Officer();
		o1.fullName=fullName;
		o1.mail=email;
		o1.phoneNumber=phoneNumber;
		o1.department=section;
		o1.shift=shift;
		
		list.add(o1);
		System.out.println("Officer added successfully.");
		
	}else if (select==4) {
		System.out.println("Full Name: ");
		String fullName= s.nextLine();
		
		System.out.println("Email: ");
		String email= s.nextLine();
		
		System.out.println("Phone Number: ");
		String phoneNumber=s.nextLine();
		
		System.out.println("Department: ");
		String section= s.nextLine();
		
		System.out.println("Duty: ");
		String duty=s.nextLine();
		
		Computing c1= new Computing();
		c1.fullName=fullName;
		c1.mail=email;
		c1.phoneNumber=phoneNumber;
		c1.department=section;
		c1.duty=duty;
		
		list.add(c1);
		System.out.println("Computing added successfully.");
		
	} else if(select==5) {
		System.out.println("Full Name: ");
		String fullName= s.nextLine();
		
		System.out.println("Email: ");
		String email= s.nextLine();
		
		System.out.println("Phone Number: ");
		String phoneNumber=s.nextLine();
		
		System.out.println("Department: ");
		String section= s.nextLine();
		
		System.out.println("Shift: ");
		String shift=s.nextLine();
		
		SecurityGuard sg1= new SecurityGuard();
		sg1.fullName=fullName;
		sg1.mail=email;
		sg1.phoneNumber=phoneNumber;
		sg1.department=section;
		sg1.shift=shift;
		
		list.add(sg1);
		System.out.println("Security Guard added successfully.");
	
	}else if(select==6) {
		System.out.println("Full Name: ");
		String fullName= s.nextLine();
		
		System.out.println("Email: ");
		String email= s.nextLine();
		
		System.out.println("Phone Number: ");
		String phoneNumber=s.nextLine();
		
		System.out.println("Department: ");
		String section= s.nextLine();
		
		System.out.println("Duty: ");
		String duty=s.nextLine();
		
		System.out.println("Title: ");
		String title=s.nextLine();
		
		Teacher t1= new Teacher();
		t1.fullName=fullName;
		t1.mail=email;
		t1.phoneNumber=phoneNumber;
		t1.section=section; 
		t1.duty=duty;
		t1.title=title;
		
		list.add(t1);
		System.out.println("Teacher added successfully.");
		
	}else if (select==7) {
		System.out.println("\n------Employee List------");
		for (Employee e : list) {
			System.out.println("Name:"+e.fullName + ", Email:"+e.mail+ ", Phone:"+ e.phoneNumber);
			if(e instanceof Academician) { //**** eğer akademisyense bölüm ve görev göster
				Academician a2= (Academician) e;
				System.out.println("Type: Academician | Department: "+ a2.section+ ", Duty:" +a2.duty);
				System.out.println("----------------------------------------------------------------");
			}if(e instanceof Assistant) {
				Assistant as2= (Assistant) e;
				System.out.println("Type: Assistant | Degree: "+ as2.degree);
				System.out.println("----------------------------------------------------------------");
			}if(e instanceof Officer) { 
				Officer o2= (Officer) e;
				System.out.println("Type: Officer | Department: "+ o2.department+ ", Shift:" +o2.shift);
				System.out.println("----------------------------------------------------------------");
			}if(e instanceof Computing) {
				Computing c2= (Computing) e ;
				System.out.println("Type: Computing | Department: "+c2.department + ", Duty:" + c2.duty);
				System.out.println("----------------------------------------------------------------");
			} if(e instanceof SecurityGuard) {
				SecurityGuard sg2= (SecurityGuard) e; 
				System.out.println("Type: Security Guard | Department: "+sg2.department + ", Shift:" + sg2.shift);
				System.out.println("----------------------------------------------------------------");
			} if(e instanceof Teacher) {
				Teacher t2= (Teacher) e;
				System.out.println("Type: Teacher | Department: "+t2.section+ ", Duty:" + t2.duty + ", Title: "+ t2.title);
				System.out.println("----------------------------------------------------------------"); 
			}
		}
	}else if (select==8) {
		System.out.println("Exiting the system...");
		break;
	}else {
		System.out.println("Invalid Option.");
	  }
	}
	s.close();
	}

}
