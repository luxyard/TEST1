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
			System.out.println("완료");
		}
		
			met.testFunc(a);
			//TEST 1. 추가사항
			//로컬사항 변경됨

			// 원격 저장소 데이터 변경함
	}

}
