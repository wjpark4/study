package exercise;

import java.io.*;

public class RP_PipedReaderWriter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP1417_InputThread inThread = new RP1417_InputThread("InputThread");
		RP1417_OutputThread outThread = new RP1417_OutputThread("OutputThread");
		
		// PipedReader와 PipedWriter를 연결한다.
		inThread.connect(outThread.getOutput());
		
		inThread.start();
		outThread.start();

	}
}

class RP1417_InputThread extends Thread{
	PipedReader input = new PipedReader();
	StringWriter sw = new StringWriter();
	
	RP1417_InputThread(String name){
		super(name);					// Thread(String name);
	}
	
	public void run(){
		try{
			int data = 0;
			
			while((data=input.read()) != -1){
				sw.write(data);
			}
			System.out.println(getName() + " received : " + sw.toString());
		}catch(IOException e){}
	}
	
	public PipedReader getInput(){
		return input;
	}
	
	public void connect(PipedWriter output){
		try{
			input.connect(output);
		}catch(IOException e){}
	}
}

class RP1417_OutputThread extends Thread{
	PipedWriter output = new PipedWriter();
	
	RP1417_OutputThread(String name){
		super(name);
	}
	
	public void run(){
		try{
			String msg = "Hello";
			System.out.println(getName() + " sent : " + msg);
			output.write(msg);
			output.close();
		}catch(IOException e){}
	}
	
	public PipedWriter getOutput(){
		return output;
	}
	
	public void connect(PipedReader input){
		try{
			output.connect(input);
		}catch(IOException e){}
	}
}