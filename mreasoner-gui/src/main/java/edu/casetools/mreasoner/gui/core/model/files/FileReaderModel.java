package edu.casetools.mreasoner.gui.core.model.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReaderModel {

	 FileReader fileReader = null;
     BufferedReader br = null;

   
	public void open(String fileName){
       try {
       		fileReader = new FileReader(fileName);
    	    br = new BufferedReader(fileReader);
		
       } catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String read(String fileName) throws IOException{	
		this.open(fileName);
		String result= "",sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				result = result + sCurrentLine+"\n";
			}
	
		this.close();
		return result;
	}

	public void close(){
		try {
			if (br != null)br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
}
