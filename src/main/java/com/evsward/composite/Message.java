package com.evsward.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Message {
	LetterComposite messageFromOrcs() {
		List<Word> words = new ArrayList<>();
		words.add(new Word(Arrays.asList(new Letter('F'), new Letter('i'), new Letter('n'), new Letter('d'))));
		words.add(new Word(Arrays.asList(new Letter('t'), new Letter('h'), new Letter('e'))));
		words.add(new Word(Arrays.asList(new Letter('h'), new Letter('a'), new Letter('l'), new Letter('f'),
				new Letter('l'), new Letter('i'), new Letter('n'), new Letter('g'), new Letter('s'))));
		return new Sentence(words);
	}

	// By the light of the moon!
	LetterComposite messageFromNightElf() {
		List<Word> words = new ArrayList<>();
		words.add(new Word(Arrays.asList(new Letter('B'), new Letter('y'))));
		words.add(new Word(Arrays.asList(new Letter('t'), new Letter('h'), new Letter('e'))));
		words.add(new Word(
				Arrays.asList(new Letter('l'), new Letter('i'), new Letter('g'), new Letter('h'), new Letter('t'))));
		words.add(new Word(Arrays.asList(new Letter('o'), new Letter('f'))));
		words.add(new Word(Arrays.asList(new Letter('t'), new Letter('h'), new Letter('e'))));
		words.add(new Word(Arrays.asList(new Letter('m'), new Letter('o'), new Letter('o'), new Letter('n'))));
		return new Sentence(words);
	}
}
