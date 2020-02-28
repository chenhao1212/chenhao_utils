package com.chenhao.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 流处理
 * @author: charles
 * @date: 2020年2月28日 上午11:38:32
 */
public class StreamUtil {
	
	
    public static List<String> read(InputStream InputStream){
		return null;
		
	}
	
	public static List<String> read(String filePath){
		return null;
		
	}
	
	//读取文件内容放入集合
	
	public static List<String> read(File file) throws IOException{
		//声明集合
		List<String> list = new ArrayList<String>();
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line="";
		while((line=reader.readLine())!=null) {
			
			list.add(line);
		}
		return list;
		
	}

}
