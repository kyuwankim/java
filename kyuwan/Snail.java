package com.kyuwan;

public class Snail {

	public static void main(String[] args) {

	}
	/*	00 01 02 03 04  14 24 34 44 
	 * x 0  1  1  1  1   0  0  0  0 
	 * y 0  0  0  0  0   1  1  1  1
	 * 
	 *     10 11 12 13 14 15 16
	 * x4  -1 -1 -1 -1  0  0  0
	 * y4   0  0  0  0 -1 -1 -1
	 *
	 *     17 18 19 21 21
	 * x0   1  1  1  0  0
	 * y1   0  0  0  1  1
	 * 
	 *     22 23 24
	 * x3  -1 -1  0
	 * y2   0  0 -1
	 * 
	 *     25
	 * x1   1
	 * y2   0
	 * 
	 *  01 02 03 04   05  04 
	 *  
	 *  
	 *  16 17 18 19   06  14
	 *  15 24 25 20   07  24 
	 *  14 23 22 21   08  34
	 *  13 12 11 10   09  44
	 * 
	 * 
	 * �� �������δ� ���ڰ� �����ϰ� �� �������δ� ���ڰ� �����Ѵ� 
	 * ��ȣ�� �ٲ�� ���� 2���� �پ��� ���� 
	 * 
	 */
	
	public int[][] makeSnail(int size) {
		
		// 1. ������ ������� ���� ���� 
		int result[][] = new int[size][size];
		
		// 2. �迭�� ��ǥ 
		int x = 0,y = 0;
		
		// 3. ���� �迭�� �ԷµǴ� �� 
		int num = 0 ;
		
		// 4. �����̸� ���� ���� ȸ����ų�� ���� ������ ũ��
		int distance = size*2 -1 ;
		
		// 5. �̵����� ��ȣ 
		int sign = 1;
		
		// 6. ������ �ݺ��ϴ� Ƚ��
		int cnt;
		
		//7. �ݺ����� ���������� ������ ������ ���� ���̰� 2�� �����ϰ� 0�̵Ǹ� ����ȴ�.
/*
		for( ; cnt >= 0 ; cnt = cnt - 2){// �ݺ����� ���� ������ ������ �Ҷ����� ���̰� 2�� �����ϰ� 0�̵Ǹ� ����ȴ� 
			
			for(int row = 0 ; row < cnt ; cnt=cnt+sign) {
				if(row <= cnt/2) {
					x = x + 1; 
				}else{
					y = y + 1;
				}
				num = num +1 ;
				System.out.println(num+": x="+x+", y="+y);
				result[y][x] = num;
			}
			sign = sign * -1;
		}
		*/
		
		
		return result;
		
	}
	public void printSnail(int snail[][]) {
		
		int y, x;
		int y_length = snail.length;
		int x_length = snail[0].length;
				
				
		for(y = 0 ; y <y_length ; y++ ) {
			for(x = 0 ; x < x_length ; x++) {
				int temp = snail[y][x];
				
				System.out.println("["+String.format("%03d", snail[y][x]));
													// %��ɾ��� ����
				 									// 0 ������� ä�� ����
													// 3 ���ڿ��� �ڸ���
													// d = (������) ä�������ڿ��� ���� 
													// 001
			}
			System.out.println("");
		}
		
	}
}
