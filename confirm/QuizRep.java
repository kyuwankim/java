package com.confirm;

public class QuizRep {

	/**
	 * 2017/01/18 ����
	 * 
	 * 1. �Է°����� ���� n, m���� �޾��� �� n���ϱ����� m�� ������ ����� ���Ͻÿ� n = 10000, m = 8 2. �Է°���
	 * ���ڿ� n���� ���� ��, �ش� ���ڿ��� �Ųٷ� ������ �� ����ϴ� ���α׷��� �ۼ��ϼ��� 3. ���ڿ��� ������ ���� ���ڿ���
	 * �Ƴ��׷��̶�� �Ѵ� ex) abcd = acbd = cabd �Է°��� ���ڿ� n, m ���� ���� �� n ���ڿ��� m ���ڿ���
	 * �Ƴ��׷����� Ȯ���ϴ� ���α׷��� �ۼ��ϼ��� �Ƴ��׷��� ��� ��������� true�� �����Ѵ�
	 *
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		QuizRep qr = new QuizRep();
		qr.countNum(10000, 8);

	}

	public void countNum(int n, int m) {

		/*
		 * int result = 0 ;
		 * 
		 * // �Է¹��� n�� �� ��ŭ ���ư��� �迭�� �ʱⰪ ���� int input = 0 ; int count = n ;
		 * 
		 * for(input = 0 ; input < n ; input = input + 1 ) {
		 * 
		 * while(count > 0 ){ if(input % m == 0){ result++; }count = count/10; }
		 * 
		 * 
		 * System.out.println("result : "+result);
		 * System.out.println("count : "+count); System.out.println("m : "+m);
		 * System.out.println("n : "+n); System.out.println("-----------");
		 */

	}

}
