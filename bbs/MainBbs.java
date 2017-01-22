package com.kimkyuwan.bbs;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *	2017.01.19 
 *	�Խ��� ����� �� Ŭ����
 *
 */

public class MainBbs {

	public static void main(String[] args) {

		MainBbs main = new MainBbs();
		main.run();
	}

	public void run() {
		// ��Ʈ�ѷ� �ʱ�ȭ
		BbsController control = new BbsController();

		Scanner sc = new Scanner(System.in);

		String command = "";
		boolean flag = true;
		while (flag) {

			System.out.println("��ɾ �Է��ϼ��� : ");
			command = sc.nextLine();

			if (command.equals("create")) {
				create(sc, control);
			} else if (command.equals("exit")) {
				System.out.println("���α׷��� ����Ǿ����ϴ�");
				flag = false;
			} else if (command.equals("read")) {
				read(sc, control);
			} else if (command.equals("list")) {
				list(sc, control);
			} else if (command.equals("delete")) {
				delete(sc, control);

			} else if (command.equals("update")) {
				update(sc, control);
			}
		}

	}
	
	public void update(Scanner sc, BbsController control) {
		System.out.println("������ ��ȣ�� �Է��ϼ��� :");
		String number = sc.nextLine();
		
		int bbs_no = Util.getNumber(number);
		Bbs bbs = control.read(bbs_no); // ArrayList ���� Bbs��ü�� �ϳ������ͼ� 
		write(sc, bbs);					// write �Լ����� ���Է��Ѵ� 
										// ���� control�� ���� update�� �ʿ����� �ʴ�

		control.update(bbs);			// update �Լ��� �ð��� ����ð����� ���Է��Ѵ�.
	}
	public void delete(Scanner sc, BbsController control) {
		
	}

	public void write(Scanner sc, Bbs bbs){
		System.out.println("������ �Է��ϼ��� : ");
		bbs.setTitle(sc.nextLine());
		System.out.println("�ۼ��ڸ� �Է��ϼ��� : ");
		bbs.setAuthor(sc.nextLine());

		// �����Է½� ���͸� �־ ������� �ʰ� wq! �Է��� �ؾ� ����
		String content = "";
		System.out.println("������ �Է��ϼ��� : ");
		while (true) {
			String line = sc.nextLine();
			if (line.equals("wq!")) {
				content = content.substring(0, content.length() - 1); // escape���ڸ�
																		// �߶󳻱�
																		// ���ؼ�
				break;
			}
			content = content + line + "\n";
		}
		bbs.setContent(content);

	}
	
	public void create(Scanner sc, BbsController control) {
		Bbs bbs = new Bbs();	//Bbs��ü�� �űԷ� ������
		write(sc,bbs);			//Write �Լ����� �Է��� ��
		control.create(bbs);	//control�� ���� arraylist�� add�Ѵ�
	}
	public void list(Scanner sc, BbsController control) {
		ArrayList<Bbs> list = control.readAll();
		for (Bbs item : list) {
			System.out.println("�۹�ȣ :" + item.getBbs_no() + " \n���� :" + item.getTitle() + "\n���� :" + item.getDatetime()
					+ "\n���� :" + item.getContent());
		}
	}
	public void read(Scanner sc, BbsController control) {
		System.out.println("�۹�ȣ�� �Է��ϼ��� : ");
		int bbsno = Integer.parseInt(sc.nextLine());
		Bbs alreadyRead = control.read(bbsno);
		if (alreadyRead != null) {
			System.out.println("�۹�ȣ : " + alreadyRead.getBbs_no());
			System.out.println("�۾��� : " + alreadyRead.getAuthor());
			System.out.println("���� : " + alreadyRead.getContent());
			System.out.println("���� : " + alreadyRead.getDatetime());
		}
	}

}
