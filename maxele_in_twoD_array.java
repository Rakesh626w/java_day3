package arraystwoD;
import java.util.*;
public class maxele_in_twoD_array {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]);
		}
			System.out.println(" ");
		}
		int mx=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if (a[i][j]>mx){
					mx=a[i][j];
			}
			}
			}
		System.out.println("max element"+mx);
		
	}

}