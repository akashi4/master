import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char rp='o';
			do {
		Scanner sc=new Scanner(System.in);
		System.out.println("veuillez entrer un mot");
		String mot=sc.nextLine();
			int n=mot.length();
			int i=0, j=0; 	
				 for(i=0; i<n; i++) {
					 if(mot.charAt(i)==mot.charAt((n-1)-i)) {
						 j=j+1;
					 }
					 
				 }
				 if(j==n) {
					 System.out.println(mot +" est un palindrome");
				 }
				 else {
					 System.out.println(mot+ " n'est pas un palindrome");
				}
			rp=sc.nextLine().charAt(0);
			}
			while(rp=='o' || rp=='O');
	}/*Anemeta Don Divin 
	16B007FS*/
}				