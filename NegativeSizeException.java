import java.util.Scanner;
class NegativeSizeException extends Exception{
    public NegativeSizeException(String s){
        super(s);
    }
}
public class MyException
{
    static void validate(int no) throws NegativeSizeException{
        if(no<0){
            throw new NegativeSizeException("Negative Number Found");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for( int i = 0 ; i < n ; i++ ){
    		try{
            	int temp = sc.nextInt();
    		    validate(temp);
    		    arr[i] = temp; 
    		}
    		catch(NegativeSizeException e){
    		    System.out.println("Exception occured "+e);
    		}
		}
	}
}
