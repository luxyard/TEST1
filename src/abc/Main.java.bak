package abc;

import java.lang.*;
import java.io.*;

class MyException extends Exception {
	public MyException(){super();}
	public String toString(){return "MyException";}
}

class MyExceptionTest{
	public void testFunc(int x) throws MyException {
	if (x>10) throw new MyException();
	}
}

	
public class Main {
	
	public static void main(String[] args) throws IOException, MyException{
		
		MyExceptionTest met = new MyExceptionTest();
		
		int a = 0;
		
		try{
			a = System.in.read();
		} catch (IOException ex){
			System.out.println(ex);
		} finally {
			System.out.println("¿Ï·á");
		}
		
			met.testFunc(a);
	}

}
