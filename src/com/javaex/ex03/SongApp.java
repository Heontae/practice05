package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);

		System.out.println(song.toString());
		// 결과예상
		// Song(피라미터5개)
		// Song(피라미터6개)
	}

}
