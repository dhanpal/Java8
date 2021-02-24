package com.learning.java8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException{
		FileOperations fileOperations = new FileOperations();
		TempData data = new TempData();
		data.setId("1");
		data.setName("Test");

		fileOperations.poorMethod(data);
		fileOperations.newMethod(data);
		fileOperations.search();
	}
	
	public void search(){
		String[] files = new String[10];
		File search = new File("/Users/dhanpalchauhan/DhanpalChauhan/WorkSpace/Java8");
		files = search.list();
		for(String fn : files)
			System.out.println("found " + fn);
	}
	
	public void poorMethod(TempData data) throws IOException{
		File file = new File("poorMethod.txt");
		file.createNewFile();
		System.out.println(file.exists());
		
		FileWriter writer = new FileWriter(file);
		writer.write(data.getId());
		writer.write("\n");
		writer.write(data.getName());
		writer.write("\n");
		writer.flush();
		writer.close();
		
		char[] in = new char[50];
		
		FileReader reader = new FileReader(file);
		reader.read(in);
		for(char c : in){
			System.out.println(c);
		}
		reader.close();
	}
	
	public void newMethod(TempData data) throws IOException{
		File file = new File("newMethod.txt");
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(data.getId());
		bufferedWriter.write(data.getName());
		bufferedWriter.flush();
		bufferedWriter.close();
		
		FileReader in = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(in);
		System.out.println(bufferedReader.readLine());
		bufferedReader.close();
	}

}
class TempData{
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}