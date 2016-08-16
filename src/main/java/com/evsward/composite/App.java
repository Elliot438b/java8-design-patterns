package com.evsward.composite;

public class App {
	public static void main(String[] args) {
		LetterComposite orc = new Message().messageFromOrcs();
		orc.execute();
		LetterComposite nightElf = new Message().messageFromNightElf();
		nightElf.execute();
	}
}
