package com.excel;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir");
		
		
		FileInputStream input = new FileInputStream(filePath+"\\data\\or.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
		
		
		int count=0;
		String str=reader.readLine();
				
				while(str!=null)
				{
					count++;
					System.out.println(str);
					str=reader.readLine();
				
				}
		System.out.println("Number of Line:"+count);
        
	
		
	}

}
