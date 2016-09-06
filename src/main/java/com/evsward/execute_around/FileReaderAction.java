package com.evsward.execute_around;

import java.io.FileReader;
import java.io.IOException;

/**
 * 定义了一个读文件动作的接口
 * 
 * @author xp020154
 *
 */
public interface FileReaderAction {
	void readFile(FileReader reader) throws IOException;
}
