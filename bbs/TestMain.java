package com.kimkyuwan.bbs;

public class TestMain {

	public static void main(String[] args) {
/*
		FileUtil rf = new FileUtil();
		rf.readFile();
		
		FileUtil wr = new FileUtil();
		wr.writeFile();
*/
		FileUtil rs = new FileUtil();
		rs.readNio();
		
		FileUtil ws = new FileUtil();
		ws.writeNio();

		
	}

}
