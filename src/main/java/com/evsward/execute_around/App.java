package com.evsward.execute_around;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 该模式解放了具体的实现，让用户在调用的时候可以自由的指定如何实现。
 * 
 * @author xp020154
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		/**
		 * 在调用的时候，才指定文件名以及写文件的具体实现。
		 */
		new SimpleFileWriter("NedTestFile.txt", new FileWriterAction() {

			@Override
			public void writeFile(FileWriter fileWriter) throws IOException {
				fileWriter.write("Hello");
				fileWriter.append(" ");
				fileWriter.append("World!");
			}

		});
	}
}
