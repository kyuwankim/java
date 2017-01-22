package com.kyuwan;

public class Array {

	public static void main(String[] args) {

		// 배열선언 
		int array[] = new int[6];
		int x,y,z;
		//배열입력
		array[0] = 434;
		array[1] = 43244;
		array[5] = 345437;
		array[3] = 6546546;
		
		// 범위를 넘어섰기 때문에 오류
		// array[6] = 947;
		// int 같은 경우 값이 들어가지않으면 자동으로 0으로 초기화 
		
		int array2[][] = new int[3][2];
		//        y  x 
		
		// 데이터셋의 크기, [번호, 제목, 내용, 날짜]
		// x축을 먼저 생각하고
		// x축 괄호 앞에 y축 공간을 정의해준다 
		int array2_1[][] = new int[100][4];
		
		/*
		for(y = 0 ; y <100 ; y++) {
			for (x=0; x<4; x++) {
				System.out.print("["+array2_1[y][x]+"]");
			}
			System.out.println("");
		}
		*/
		
		// 3차원 배열
		   x = 5;
		   y = 10; 
		   z = 7;
		   
		   int array3[][][] = new int[z][y][x];
		   
		   array3[3][5][2] = 352;
		   array3[2][0][3] = 203;
		   array3[6][9][1] = 691;
		   
		   int zIndex = 0;
		   int yIndex = 0;
		   int xIndex = 0;
		   
		   for(zIndex = 0 ; zIndex < z ; zIndex++) {
			   for(yIndex = 0 ; yIndex < y ; yIndex++) {
				   for(xIndex = 0 ; xIndex < x ; xIndex++) {
					   
					   System.out.print("["+array3[zIndex][yIndex][xIndex]+"]");
				   }
				   System.out.println("");
			   }
			   //3차원 배열은 각 배열을 층별로 나타낸다고 생각하면 편함 
			  System.out.println("--------------------");
		   }
		   
		
		
		
		for(int i = 0 ; i < array.length ; i++){
			System.out.println("array["+i+"] : "+ array[i]);
		}
		
	}

}
