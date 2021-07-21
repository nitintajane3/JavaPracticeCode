package basicprogram;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWritterAndBufferWriter 
{
	
	public void printwriterMethod() throws FileNotFoundException
	{
		PrintWriter writer1 =null;      
        writer1 = new PrintWriter(new File("D:\\testout.txt"));  
        writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");
        writer1.println();
        writer1.write("Nitin Tajane Like Java, Spring, Hibernate, Android, PHP etc.");
        writer1.println();
        writer1.write("pooja patil Like Java, Spring, Hibernate, Android, PHP etc.");
        writer1.flush();  
        writer1.close();  
	}
	
	public void bufferwriterMethod() throws IOException
	{
		//FileWriter writer = new FileWriter("D:\\testout.txt");  
	    BufferedWriter buffer = new BufferedWriter(new FileWriter("D:\\\\testout.txt"));  
	    buffer.write("Welcome to javaTpoint.");  
	    buffer.close();  
	}


	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		PrintWritterAndBufferWriter printWritterAndBufferWriter = new PrintWritterAndBufferWriter();
		printWritterAndBufferWriter.bufferwriterMethod();
		//printWritterAndBufferWriter.printwriterMethod();
	}

}
