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
	 * ㄱ 패턴으로는 숫자가 증가하고 ㄴ 패턴으로는 숫자가 감소한다 
	 * 부호가 바뀌고 줄이 2개씩 줄어드는 패턴 
	 * 
	 */
	
	public int[][] makeSnail(int size) {
		
		// 1. 달팽이 결과값을 담을 공간 
		int result[][] = new int[size][size];
		
		// 2. 배열의 좌표 
		int x = 0,y = 0;
		
		// 3. 실제 배열에 입력되는 값 
		int num = 0 ;
		
		// 4. 달팽이를 ㄱㄴ 으로 회전시킬때 최초 한줄의 크기
		int distance = size*2 -1 ;
		
		// 5. 이동간의 부호 
		int sign = 1;
		
		// 6. ㄱㄴ이 반복하는 횟수
		int cnt;
		
		//7. 반복문은 ㄱㄴ단위로 동작할 때마다 ㄱ의 길이가 2씩 감소하고 0이되면 종료된다.
/*
		for( ; cnt >= 0 ; cnt = cnt - 2){// 반복문은 ㄱㄴ 단위로 동작을 할때마다 길이가 2씩 감소하고 0이되면 종료된다 
			
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
													// %명령어의 시작
				 									// 0 빈공간에 채울 문자
													// 3 문자열의 자릿수
													// d = (십진수) 채워질문자열의 진수 
													// 001
			}
			System.out.println("");
		}
		
	}
}
