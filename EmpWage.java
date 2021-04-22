package assignment;

import java.util.Scanner;

public class EmpWage {
	
	public void employeeclass() {
		
			
			Scanner dp = new Scanner(System.in);
			System.out.println("Enter the things you want to check or calculate  : ");
			System.out.println("Enter 1 to check employee status");
			System.out.println("Enter 2 for calculating daily wage");
			System.out.println("Enter 3 for calculating daily monthly wage");
			
			System.out.println("Enter 4 Calculating Wages till a condition of total working hours or days is reached for a month - like 100 hours and 20 days");
			System.out.println("Enter 5 calculate wage for amazon");
			System.out.println("Enter 6 calculate wage for magic software");
			System.out.println("Enter 7 calculate wage for flipkart");
			
			
			int option =  dp.nextInt();
			switch(option)
			{
			case 1:

				int attendence = (int) Math.round(Math.random());
				if (attendence==0) {
					System.out.println("Employee is absent");
				}else {
					System.out.println("employee is absent");
				}
				break;
			
			case 2:
				Scanner sc= new Scanner(System.in); 
				System.out.println("Wage per hr = ");
				int Wage_per_hr= sc.nextInt();
				
				 
				System.out.println("Full_day_hr = ");
				int Full_day_hr= sc.nextInt();
			
				int Total_daily_wage = Wage_per_hr * Full_day_hr;
				System.out.println("Total Daily Wage are = " + Total_daily_wage);
				break;
				
			case 3:
				Scanner  p= new Scanner(System.in); 
				System.out.println("Wage per hr = ");
				int Wage_per_hr_= p.nextInt();
				
				 
				System.out.println("Full_day_hr = ");
				int Full_day_hr_= p.nextInt();
				
				System.out.println("Part_time_hr = ");
				int Part_time_hr_= p.nextInt();
				
				System.out.println("Total_w_days = ");
				int Total_w_days_= p.nextInt();
				int Total_monthly_wages = ( Total_w_days_ * Full_day_hr_ + Part_time_hr_ ) * Wage_per_hr_;
				System.out.println("Total montly wages is = " + Total_monthly_wages);
				break;
				
			case 4:
				Scanner q  = new Scanner(System.in);
				System.out.println("enter fixed hrs and days");
				System.out.println("enter hrs");
				int fixed_hrs = q.nextInt();
				System.out.println("enter fixed days");
				int fixed_day = q.nextInt();
			
				int total_hrs  = fixed_hrs + (8*fixed_day);
				int Wage  = total_hrs * 8;
				System.out.println("Total wage for a fixed hours and days is =" + Wage );
				break;
				
			case 5:
				amazon();
				break;
			case 6:
				magicSoftware();
				break;
			case 7:
				flipkart();
				break;
				
			default:
				System.out.println("Invalid input enter again ");
				employeeclass();
			
			
			}
			
			
			
	
		}
	void amazon() {
		Scanner  p= new Scanner(System.in); 
		System.out.println("Wage per hr = ");
		int Wage_per_hr_= p.nextInt();
		
		 
		System.out.println("Full_day_hr = ");
		int Full_day_hr_= p.nextInt();
		
		System.out.println("Part_time_hr = ");
		int Part_time_hr_= p.nextInt();
		
		System.out.println("Total_w_days = ");
		int Total_w_days_= p.nextInt();
		int Total_monthly_wages = ( Total_w_days_ * Full_day_hr_ + Part_time_hr_ ) * Wage_per_hr_;
		System.out.println("Amazon monthly wage is = " + Total_monthly_wages);
		
		
		
	}
	
	void magicSoftware() {
		Scanner  p= new Scanner(System.in); 
		System.out.println("Wage per hr = ");
		int Wage_per_hr_= p.nextInt();
		
		 
		System.out.println("Full_day_hr = ");
		int Full_day_hr_= p.nextInt();
		
		System.out.println("Part_time_hr = ");
		int Part_time_hr_= p.nextInt();
		
		System.out.println("Total_w_days = ");
		int Total_w_days_= p.nextInt();
		int Total_monthly_wages = ( Total_w_days_ * Full_day_hr_ + Part_time_hr_ ) * Wage_per_hr_;
		System.out.println("Monthly wage for Magic Software is  = " + Total_monthly_wages);
	}
	
	void flipkart() {
		
		Scanner  p= new Scanner(System.in); 
		System.out.println("Wage per hr = ");
		int Wage_per_hr_= p.nextInt();
		
		 
		System.out.println("Full_day_hr = ");
		int Full_day_hr_= p.nextInt();
		
		System.out.println("Part_time_hr = ");
		int Part_time_hr_= p.nextInt();
		
		System.out.println("Total_w_days = ");
		int Total_w_days_= p.nextInt();
		int Total_monthly_wages = ( Total_w_days_ * Full_day_hr_ + Part_time_hr_ ) * Wage_per_hr_;
		System.out.println("Monthly Flipkart Wage is  = " + Total_monthly_wages);
	}
	
		

}
