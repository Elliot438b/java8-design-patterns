package com.evsward.execute_around;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 定义了一个写文件动作的接口
 * 
 * @author xp020154
 *
 */
public interface FileWriterAction {
	void writeFile(FileWriter fileWriter) throws IOException;
}
