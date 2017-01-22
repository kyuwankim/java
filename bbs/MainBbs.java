package com.kimkyuwan.bbs;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *	2017.01.19 
 *	게시판 만들기 및 클래스
 *
 */

public class MainBbs {

	public static void main(String[] args) {

		MainBbs main = new MainBbs();
		main.run();
	}

	public void run() {
		// 컨트롤러 초기화
		BbsController control = new BbsController();

		Scanner sc = new Scanner(System.in);

		String command = "";
		boolean flag = true;
		while (flag) {

			System.out.println("명령어를 입력하세요 : ");
			command = sc.nextLine();

			if (command.equals("create")) {
				create(sc, control);
			} else if (command.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다");
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
		System.out.println("수정할 번호를 입력하세요 :");
		String number = sc.nextLine();
		
		int bbs_no = Util.getNumber(number);
		Bbs bbs = control.read(bbs_no); // ArrayList 에서 Bbs객체를 하나가져와서 
		write(sc, bbs);					// write 함수에서 재입력한다 
										// 따로 control을 통한 update는 필요하지 않다

		control.update(bbs);			// update 함수로 시간을 현재시간으로 재입력한다.
	}
	public void delete(Scanner sc, BbsController control) {
		
	}

	public void write(Scanner sc, Bbs bbs){
		System.out.println("제목을 입력하세요 : ");
		bbs.setTitle(sc.nextLine());
		System.out.println("작성자를 입력하세요 : ");
		bbs.setAuthor(sc.nextLine());

		// 내용입력시 엔터를 넣어도 종료되지 않고 wq! 입력을 해야 종료
		String content = "";
		System.out.println("내용을 입력하세요 : ");
		while (true) {
			String line = sc.nextLine();
			if (line.equals("wq!")) {
				content = content.substring(0, content.length() - 1); // escape문자를
																		// 잘라내기
																		// 위해서
				break;
			}
			content = content + line + "\n";
		}
		bbs.setContent(content);

	}
	
	public void create(Scanner sc, BbsController control) {
		Bbs bbs = new Bbs();	//Bbs객체를 신규로 생성하
		write(sc,bbs);			//Write 함수에서 입력한 후
		control.create(bbs);	//control을 통해 arraylist에 add한다
	}
	public void list(Scanner sc, BbsController control) {
		ArrayList<Bbs> list = control.readAll();
		for (Bbs item : list) {
			System.out.println("글번호 :" + item.getBbs_no() + " \n제목 :" + item.getTitle() + "\n날자 :" + item.getDatetime()
					+ "\n내용 :" + item.getContent());
		}
	}
	public void read(Scanner sc, BbsController control) {
		System.out.println("글번호를 입력하세요 : ");
		int bbsno = Integer.parseInt(sc.nextLine());
		Bbs alreadyRead = control.read(bbsno);
		if (alreadyRead != null) {
			System.out.println("글번호 : " + alreadyRead.getBbs_no());
			System.out.println("글쓴이 : " + alreadyRead.getAuthor());
			System.out.println("내용 : " + alreadyRead.getContent());
			System.out.println("날자 : " + alreadyRead.getDatetime());
		}
	}

}
