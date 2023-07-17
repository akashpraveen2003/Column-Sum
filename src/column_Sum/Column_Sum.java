package column_Sum;

import java.util.Arrays;
import java.util.Scanner;
/*
 * You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
 */
public class Column_Sum {

	private static void calculate_column_sum(int[][] array,int row,int column) {
		// TODO Auto-generated method stub
		int column_sum[]=new int[column];
		int sum=0;
		for(int j=0;j<column;j++)
		{
			sum=0;
			for(int i=0;i<row;i++)
			{
				sum+=array[i][j];
			}
			column_sum[j]=sum;
		//	System.out.println(sum);
			
		}
		System.out.println(Arrays.toString(column_sum));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		int array[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
		calculate_column_sum(array,row,column);
	}

	
		
}
/*
	Input
	[
	 [1,2,3,4]
  	 [5,6,7,8]
  	 [9,2,3,4] 
  	]

	Output
	[15, 10, 13, 16]
*/
