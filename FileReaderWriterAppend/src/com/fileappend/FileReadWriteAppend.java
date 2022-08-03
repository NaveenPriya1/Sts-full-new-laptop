package com.fileappend;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReadWriteAppend {

	public static void main(String args[]) throws IOException {

	
		// to Write into File
		try {
			FileWriter fw = new FileWriter("D:\\naveen.txt");
			fw.write("Welcome Naveen.");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(" writing into file Success...  \n ");

		
		// to read File
		FileReader fr = new FileReader("D:\\naveen.txt");

		int i;
		System.out.println("File Reading The content of File is  ");
		try {
			while ((i = fr.read()) != -1)
				System.out.print((char) i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fr.close();

		
		
		// To append into file
		PrintWriter p = new PrintWriter("D:\\naveen.txt");
		CharSequence csq = "This is SimpliLearn";
		p.append(csq);
		System.out.println(" \n  \n the text append into file ");
		p.flush();
	}

}
