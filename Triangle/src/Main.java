import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 System.out.println("Bir Sayý Giriniz :");
	        int n = scn.nextInt();
	       //döngü ile ters üçgen oluþturuldu.
	        for (int i = 1; i<n; i++){
	        	  for (int k = 1; k<=(n-(n-i)); k++){
		                System.out.print(" "); 
		            }
	            for (int j=(((2*n)-3)-((2 * i) - 1)) ; j>=0; j--){
	                System.out.print("*"); 
	            }

	            System.out.println("");
	        }
	}}
	        

