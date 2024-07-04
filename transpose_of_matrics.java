package arraystwoD;

public class transpose_of_matrics {
	public static void transpose(int a[][]) {
		int rc=a.length;
		int cc=a[0].length;
		int trans[][]=new int[cc][rc];
		for(int i=0;i<rc;i++) {
			for(int j=0;j<cc;j++) {
				trans[j][i]=a[i][j];
		}
		}
			for(int i=0;i<cc;i++) {
				for(int j=0;j<rc;j++) {
					System.out.print(trans[i][j]);
			}
				System.out.println();
			}
			
			
}
	public static void main(String[] args) {
		int a[][]= {{1,2,3},
				{4,5,6}};
				//{7,8,9}};
		transpose(a);
		
		}

	}

