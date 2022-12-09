import java.util.Scanner;
public class Pattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		int c = 1 ;
		for(int i = 1 ; i <= size ; i++){
			for(int j = size ; j > i ; j--){
  				System.out.print(" ");
			}
			for(int k = 0 ; k < 2*i-1 ; k++){
				System.out.print(c);
			}
			c++;
			System.out.println(" ");
		}
	}
}