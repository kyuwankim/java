package com.kimkyuwan.bbs;

public class Bbs {

	// 1. 클래스 속성부터 정의, 게시판에 무엇이 들어갈까
	private int bbs_no;
	private String title;
	private String author;
	private String datetime;
	private String content;
	
	
	
	/*
	// 2. 생성자 정의하기
	// 처음정의하면 기본으로 들어갈 내용을 정의해둠 
	public Bbs() {
		title = "제목없음";
	}
	// 생성자도 오버로드가 가능 (이미 정의되어있는 기능이 있어도 덮어 씌울 수 있음)
	public Bbs(String title) {
		this.title = title;
		
	}
	
	// toString은 기본 기능으로 제공을 함 그래서 객체 생성 후 toString을 찍으면 생성된 메모리 주소가 나오는데 
	// 오버라이드를 통해서 내가 반환하기 원하는 것으로 바꿀 수 있음 
	public String toString(){
		String result = "";
		result = "번호 : "+bbs_no+" 제목 : "+title;
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
