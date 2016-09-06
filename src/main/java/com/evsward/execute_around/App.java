package com.evsward.execute_around;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

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
		// new SimpleFileWriter("NedTestFile.txt", new FileWriterAction() {
		//
		// @Override
		// public void writeFile(FileWriter fileWriter) throws IOException {
		// fileWriter.write("Hello");
		// fileWriter.append(" ");
		// fileWriter.append("World!");
		// }
		//
		// });

		new SimpleFileReader("NedTestFile.txt", new FileReaderAction() {

			@Override
			public void readFile(FileReader reader) throws IOException {
				BufferedReader br = new BufferedReader(reader);
				String resp = br.readLine();
				String a = resp.replace("cnbjlx", "").replace("cnbjlnx", "");
				String respA[] = a.split(" ");
				int result[] = new int[respA.length];
				for (int i = 0; i < respA.length; i++) {
					result[i] = Integer.parseInt(respA[i]);
				}
				Arrays.sort(result);
				for (int i = 0; i < respA.length; i++) {
					System.out.println(result[i]);
				}
				System.out.println("总共条数：" + result.length);
			}

		});
	}
}
