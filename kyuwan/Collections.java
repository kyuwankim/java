package com.kyuwan;

import java.util.ArrayList;

public class Collections {

	/*
	 * 1. �Է°����� ���� n, m���� �޾��� �� n���ϱ����� m�� ������ ����� ���Ͻÿ� n = 10000, m = 8
	 * 2. �Է°��� ���ڿ� n���� ���� ��, �ش� ���ڿ��� �Ųٷ� ������ �� ����ϴ� ���α׷��� �ۼ��ϼ���
	 * 3. ���ڿ��� ������ ���� ���ڿ��� �Ƴ��׷��̶�� �Ѵ� ex) abcd = acbd = cabd
	 * 	   �Է°��� ���ڿ� n, m ���� ���� �� n ���ڿ��� m ���ڿ��� �Ƴ��׷����� Ȯ���ϴ� ���α׷��� �ۼ��ϼ���
	 *     �Ƴ��׷��� ��� ��������� true�� �����Ѵ� 
	 */
	public static void main(String[] args) {

		Collections CL = new Collections();
		CL.countNumber(10000, 8);

		String myName = "kimkyuwan";
		String yuRi = "nayuri";
		String manDeuk = "mandeuk";

		// ���� ������� ũ�⸦ �˸� �迭�� ���°� �ξ� ȿ������ �� �ִ�

		ArrayList<String> nameList = new ArrayList<>();
		// ��ü���� �ʱ�ȭ�� new ArrayList�� �ʱ�ȭ �Ѵ�

		// ��ü : ���������� �ڵ���� ������� ���� ����ܰ��� ����ȭ�� �ڵ��� ����, �̰� �ν��Ͻ��� ���� ���� ���� ��
		// Ŭ���� : ����ȭ �� ��ü�� �ڵ��� ����
		// �ν��Ͻ� : Ŭ������ ���� ������ �Ͽ� ��ü�� �޸𸮿� �ö� ��

		// add�� ���Ͽ� �� String�� ������
		nameList.add(myName);
		nameList.add(yuRi);
		nameList.add(manDeuk);

		// ��Ʈ�� ���԰� ��Ƽ�� Ÿ�� �� ��̸���Ʈ�� �� �� �ִ�
		// �÷��� ��ü�� Ÿ���� �޶� �� ����� �ǵ��� �Ǿ��ִ�
		// �� ��� �� �� �ֵ��� �÷��ǿ��� Object ��� Ÿ������ ������

		int num = 57;
		// nameList.add(new Integer(num));

		// ���� �迭 (ũ�Ⱑ ���ϴ�)�� ������� ���� �������� ���� �ʴ´� (�ǰ����)
		int i = 0;
		int nameListSize = nameList.size(); // nameListSize�� ���� ���� �񱳹����� ��������
											// ���ϰ� ���� �ʴ´�
		for (i = 0; i < nameListSize; i++) {
			System.out.println(i + 1 + " �� ��� : " + nameList.get(i));
		}

		// for each ��
		for (String item : nameList) {
			System.out.println(item);
		}

	}

	public void countNumber(int n, int m) {
		int count = 0;
		int number = 0;

		int i = 0;
		for (i = 0; i <= n; i++) {
			number = i;
			while (number > 0) {
				if (number % 10 == m) {
					count++;
				}number = number / 10;

			}
		}
		System.out.println(count);
	}

}
