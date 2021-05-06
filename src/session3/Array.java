package session3;

public class Array {

	public static void main(String[] args) {

		//single dimensional array
		float a[]={33,3,4,5};//declaration, instantiation and initialization 

		int ia[] = new int[5];

		ia[0]=34;


		for(int i=0;i<a.length;i++)  
			System.out.println(a[i]);  

		for(float i:a)  // for-each loop
			System.out.println(i);  


		// two dimensional array
		int[][] arr=new int[2][2];

		arr[0][1] =90;
		arr[1][1] =90;

		for(int i=0;i<3;i++){  
			for(int j=0;j<3;j++){  
				System.out.print(arr[i][j]+" ");  
			}  
			System.out.println();  
		}  
	}
}

