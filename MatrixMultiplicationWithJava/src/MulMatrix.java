import java.util.*;
public class MulMatrix {
	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Number of Rows of First Matrix: ");
		int rowOFirst= scan.nextInt();
		System.out.println("Enter the Number of Column of First Matrix: ");
		int columnOFirst= scan.nextInt();
		System.out.println("Enter the Number of Rows of Second Matrix: ");
		int rowOSecond= scan.nextInt();
		System.out.println("Enter the Number of Column of Second Matrix: ");
		int columnOSecond= scan.nextInt();
		int[][] firstMatrix=new int [rowOFirst][columnOFirst];
		int[][] secondMatrix=new int [rowOSecond][columnOSecond];
		int[][] mulMatrix=new int [rowOFirst][columnOSecond];
		if (columnOFirst!=rowOSecond) {
			System.out.println("Can't multiply! Number of first column should be equal to second row.");	
		}
		else {
			
			System.out.println("Enter the elements of first matrix:");
			for (int i=0;i<rowOFirst;i++) {
				for (int j=0;j<columnOFirst;j++) {
					firstMatrix[i][j]=scan.nextInt();
				}
			}
			System.out.println("Enter the elements of second matrix:");
			for (int i=0;i<rowOSecond;i++) {
				for (int j=0;j<columnOSecond;j++) {
					secondMatrix[i][j]=scan.nextInt();
				}
			}
			int sum=0;
			for(int i=0;i < rowOFirst; i++) {
				for (int j=0; j < columnOSecond; j++) {
					for (int k=0;k<rowOSecond;k++) {
						sum=sum+(firstMatrix[i][k]*secondMatrix[k][j]);	
					}
					mulMatrix[i][j]=sum;
					sum=0;
				}
			}
			
			System.out.println("Result :");
			for(int i=0;i<rowOFirst;i++) {
				for(int j=0;j<columnOSecond;j++) {
					System.out.print(mulMatrix[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}
	}
	
	
}
