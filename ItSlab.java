import java.util.Scanner;
class ItSlab{
    public static void main(String[] args) {
        // int x = Integer.parseInt(args[0]);
        Scanner s=new Scanner(System.in);
        int sal=s.nextInt();
        double tax=0.0;
        if(sal<=80000){
			System.out.println("NO tax");
		}
		else{
			sal-=80000;
			if(sal<=80000){
				tax+=(sal*0.1);
			}
			else{
				sal-=80000;
				if(sal<150000){
					tax+=8000;
					tax+=(sal/5);
					System.out.println(tax);
				}
				else{
					sal-=150000;
					tax+=8000;
					tax+=(150000/5);
					tax+=(sal*3/10);
					System.out.println(tax);	
				}
			}
    	}
    }
}