package com.evsward.execute_around;

import java.io.FileReader;
import java.io.IOException;

public class SimpleFileReader {
	public SimpleFileReader(String filename, FileReaderAction action) throws IOException {
		FileReader Reader = new FileReader(filename);
		try {
			// 最终是在SimpleFileReader构造器中去执行。
			action.readFile(Reader);
		} finally {
			Reader.close();
		}
	}
}
