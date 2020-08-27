package exercise;

import java.io.*;

public class PipedReaderWriter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputThread1417 inThread = new InputThread1417("InputThread");
		OutputThread1417 outThread = new OutputThread1417("OutputThread");
		
		// PipedReader와 PipedWriter를 연결한다.
		inThread.connect(outThread.getOutput());
		
		inThread.start();
		outThread.start();

	}
}

class InputThread1417 extends Thread{
	PipedReader input = new PipedReader();
	StringWriter sw = new StringWriter();
	
	InputThread1417(String name){
		super(name);			// Thread(String name);
	}
	
	public void run(){
		try{
			int data = 0;
			
			while((data=input.read()) != -1){
				sw.write(data);
			}
			System.out.println(getName() + " received : " + sw.toString());
		}catch(IOException e){}
	} // run
	
	public PipedReader getInput(){
		return input;
	}
	
	public void connect(PipedWriter output){
		try{
			input.connect(output);
		}catch(IOException e){}
	}
}

class OutputThread1417 extends Thread{
	PipedWriter output = new PipedWriter();
	
	OutputThread1417(String name){
		super(name);			// Thread(String name);
	}
	
	public void run(){
		try{
			String msg = "Hello";
			System.out.println(getName() + " sent : " + msg);
			output.write(msg);
			output.close();
		}catch(IOException e){}
	} // run
	
	public PipedWriter getOutput(){
		return output;
	}
	
	public void connect(PipedReader input){
		try{
			output.connect(input);
		}catch(IOException e){}
	} // connect
}