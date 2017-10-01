import java.util.Scanner;
public class paire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char rp='o';
			do {
		System.out.println("veillez entrer un entier");
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int a =n%2; 
				if(a==0) {
					System.out.println("le nombre entré est un nombre paire");
					}
					else {
						System.out.println("le nombre entré est impaire");
					
					}
				System.out.println("voulez-vous recommencer?(oui/non)");
				sc.nextLine();
			rp=sc.nextLine().charAt(0);
			}
			while( rp=='o'|| rp=='O');
			
			System.out.println("Au revoir");/*Anemeta Don Divin 
			 								16B007FS*/
	}
}
