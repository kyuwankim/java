package com.kimkyuwan.bbs;

public class Bbs {

	// 1. Ŭ���� �Ӽ����� ����, �Խ��ǿ� ������ ����
	private int bbs_no;
	private String title;
	private String author;
	private String datetime;
	private String content;
	
	
	
	/*
	// 2. ������ �����ϱ�
	// ó�������ϸ� �⺻���� �� ������ �����ص� 
	public Bbs() {
		title = "�������";
	}
	// �����ڵ� �����ε尡 ���� (�̹� ���ǵǾ��ִ� ����� �־ ���� ���� �� ����)
	public Bbs(String title) {
		this.title = title;
		
	}
	
	// toString�� �⺻ ������� ������ �� �׷��� ��ü ���� �� toString�� ������ ������ �޸� �ּҰ� �����µ� 
	// �������̵带 ���ؼ� ���� ��ȯ�ϱ� ���ϴ� ������ �ٲ� �� ���� 
	public String toString(){
		String result = "";
		result = "��ȣ : "+bbs_no+" ���� : "+title;
		return result;
	}
	*/
	
	
	
	public int getBbs_no() {
		return bbs_no;
	}

	public void setBbs_no(int bbs_no) {
		this.bbs_no = bbs_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
