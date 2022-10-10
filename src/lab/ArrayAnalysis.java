package lab;

/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {
	
	

	
	//#1
	public static int[][] createRandom(int row, int column, int min, int max){
		int[][] randomArray = new int[row][column];
		int random;
		
		System.out.println("randomArray ");
		
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
			
				random = ((int) Math.random());
				
				System.out.println("i "+i);
				System.out.println("j "+j);
				System.out.println("ran "+random);
			
					randomArray[i][j]=random;
				
		
			
			}
		
		}
		return randomArray;
	}

	
	
	//#2
	public static void printArray(int[][] arr)  {
		int [] row;
		
		for (int i = 0; i < arr.length; i++) {  //cycles thru all the rows
			row=arr[i];
			for (int j = 0; j < row.length; j++) {
		
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		}
		
				           
	
	
	
	
	//#3
	public static int sumTotal(int[][] arr) {
		int sumTotal = 0;
	
		for (int i = 0; i < arr[i].length; i++) { 
			
			for (int j = 0; j < arr[j].length; j++) {
				
				 sumTotal =  sumTotal+arr[i][j];
				
			
		}
		

		}	return sumTotal;
	}
	
	
	//#4
	public static double average(int[][] arr) {
		
		
	int sum = 0;
	
	int average = 0;
		
		int sumTotal = 0;
		
		for (int i = 0; i < arr[i].length; i++) { 
			
			for (int j = 0; j < arr[j].length; j++) {
				
				 sumTotal =  sumTotal+arr[i][j];
				
			
		}
			for(int a = 0; i < sumTotal; a++) {
				
			}
		average = sum/sumTotal;

	
		
		}
		
		return average;
	}
	
	
	//#5
	public static int findMin(int[][] arr) {
		
		int min = 0;
		
        for (int i = 0; i < arr[i].length; i++) { 
			
			for (int j = 0; j < arr[j].length; j++) {
				
				min = (Math.min(min,arr[i][j]));
			
			}}
		return min;
	}
	
	
	//#6
	public static int findMax(int[][] arr) {
         int max = 0;
         
         for (int i = 0; i < arr[i].length; i++) { 
 			
 			for (int j = 0; j < arr[j].length; j++) {
 				
 				max = (Math.max(max,arr[i][j]));	
 		
       
 			
 			}}
		
		return max;
		
	}
	
	
	//#7
	public static int[][] diffArrays(int[][] arr1, int[][] arr2){
		
		int[][] num = arr1;
		int[][] num1 =arr2;
		
for (int i = 0; i < num[i].length; i++) { 
 			
 			for (int j = 0; j < num1 [j].length; j++) {
 				
 			
		
		
		if (arr1[i].length >=arr2[j].length ) {
		
		
		return null;
	}
 			}
}
return num;}
	
	
	//#8
	public static int[][] transposeRow(int[][] arr1, int dist){
		int num [][] = arr1;
	    dist = 0;
	    for (int i = 0; i < num[i].length; i++) { 
	    	
	    	boolean transposeRow = true;
			if (transposeRow) {
	    		
	    	}
	    }
	    
		return null;
		
	}
	
	
	//#9
	public static int sum3D(int[][][] arr) {
		int random;
		int random2;
		int random3;
		random = ((int) Math.random());
		random2 = ((int) Math.random());
		random3 = ((int) Math.random());
		int row = random;
		int column = random2;
		int height = random3 ;
		int sum;
		int[][][] sum3D = new int[row][column][height];

		
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				for(int a=0; a<height; a++) {
					
					sum = i+j+a;
		
					sum = i+j+a;	}
				}
		}
		
		sum = row+column+height;
		
		return sum;	
		
	}
	
	
	//#10
	public static double average3D(int[][][] arr) {
		
		int sum = 0;
		
		int average = 0;
			
			int sumTotal = 0;
			
			for (int i = 0; i < arr[i].length; i++) { 
				
				for (int j = 0; j < arr[j].length; j++) {
					
					for (int b = 0; b < arr[b].length; b++) 
					
					 sumTotal =  sumTotal+arr[i][j][b];
					
				
			}
				for(int a = 0; i < sumTotal; a++) {
					
				}
			average = sum/sumTotal;

		
			
			}
		return average;
	}
	
	
	
	
	
	
}