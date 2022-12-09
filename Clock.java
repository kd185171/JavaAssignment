import java.util.Scanner;
public class Clock{
	int h,m,s;
	Clock(int h,int m,int s){
		this.h = h;
		this.m = m;
		this.s = s;
	}
	void displayTime(){
		String mer="";
		if(h>=0&&h<=11){
			mer="AM";
		}
		else{
			mer="PM";
			if(h>12){
				h-=12;
			}
		}
		String t = h+":"+m+":"+s+" "+mer;
		System.out.println(t);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Hours : ");
		int h = sc.nextInt();
		System.out.print("Enter Minutes : ");
		int m = sc.nextInt();
		System.out.print("Enter Seconds : ");
		int s = sc.nextInt();
		if(h>=0&&h<24&&m>=0&&m<60&&s>=0&&s<60){
			System.out.println("Valid time :");
			Clock c = new Clock(h,m,s);
			c.displayTime();
		}
		else{
			System.out.println("Enter valid time");
		}
	}
}


		
	
	
	
