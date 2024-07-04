package arraystwoD;

public class staircasesearch_matrics {
	public static void search(int a[][]) {
		int key=14;
		int b=0;
		int c=a.length-1;
		while(b<a.length && c>=0) {

				if(a[b][c]==key) {
					System.out.println("found");
					break;
				}
				else if(a[b][c]<key) {
					b++;
				}
				else {
					c--;
				}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		search(a);
	}

}
