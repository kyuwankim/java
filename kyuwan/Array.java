package com.kyuwan;

public class Array {

	public static void main(String[] args) {

		// �迭���� 
		int array[] = new int[6];
		int x,y,z;
		//�迭�Է�
		array[0] = 434;
		array[1] = 43244;
		array[5] = 345437;
		array[3] = 6546546;
		
		// ������ �Ѿ�� ������ ����
		// array[6] = 947;
		// int ���� ��� ���� ���������� �ڵ����� 0���� �ʱ�ȭ 
		
		int array2[][] = new int[3][2];
		//        y  x 
		
		// �����ͼ��� ũ��, [��ȣ, ����, ����, ��¥]
		// x���� ���� �����ϰ�
		// x�� ��ȣ �տ� y�� ������ �������ش� 
		int array2_1[][] = new int[100][4];
		
		/*
		for(y = 0 ; y <100 ; y++) {
			for (x=0; x<4; x++) {
				System.out.print("["+array2_1[y][x]+"]");
			}
			System.out.println("");
		}
		*/
		
		// 3���� �迭
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
			   //3���� �迭�� �� �迭�� ������ ��Ÿ���ٰ� �����ϸ� ���� 
			  System.out.println("--------------------");
		   }
		   
		
		
		
		for(int i = 0 ; i < array.length ; i++){
			System.out.println("array["+i+"] : "+ array[i]);
		}
		
	}

}
