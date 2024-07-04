package arraystwoD;
import java.util.*;
public class creation_of_two_d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
			}
	}

