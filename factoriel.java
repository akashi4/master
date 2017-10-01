import java.util.Scanner;
public class factoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char rp='o';
		do {
		System.out.println("veuillez entrer un nombre");
		Scanner sc=new Scanner(System.in);
		int n=1;
		int i=sc.nextInt();
			while(i<0) {
				System.out.println("veuillez entrer un nombre positif");
				i=sc.nextInt();
			}
		if(i==0){
			System.out.println("son factoriel est 1");
		}
		else {
		while(i>0) {
			n=n*i;
			i--;
		}
		System.out.println("son factoriel est "+ n);
		System.out.println("voulez vous recomencer?(oui/non)");
		sc.nextLine();
		rp=sc.nextLine().charAt(0);
			}
		}
			while(rp=='o'|| rp=='O');
		/*Anemeta Don Divin 
			16B007FS */
	}
	

}
