package com.evsward.execute_around;

import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWriter {
	public SimpleFileWriter(String filename, FileWriterAction action) throws IOException {
		FileWriter writer = new FileWriter(filename);
		try {
			// 最终是在SimpleFileWriter构造器中去执行。
			action.writeFile(writer);
		} finally {
			writer.close();
		}
	}
}
