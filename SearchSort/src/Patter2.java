import java.util.Scanner;

public class Patter2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		for(int i=a;i>=1;--i) {
			for(int j=1;j<=a-i;++j)
				System.out.print("  ");
			
			for(int k=i;k<=2*i-1;k++)
				System.out.print((k*2)-1+"  ");
			System.out.println();
		}
	}
}
