package edu.kh.thread.test.run;

import edu.kh.thread.test.ThreadWithClass;
import edu.kh.thread.test.ThreadWithRunnable;

public class ThreadRun {
	
	// Thread(스레드) : 컴퓨터 프로그램 실행의 기본단위 중 하나.
	//					프로세스 내에서 실행되는 흐름의 단위 
	
	// Thread(스레드) 이점
	// 1. 스레드를 사용하면 여러 작업을 동시에 실행 
	// -> 시스템의 응답성을 향상시키고, 자원을 효율적으로 활용 
	
	// 2. 비동기적인 작업 수행이 가능함. 
	// ex. 네트워크 요청이나 파일 입출력과 같은 I/O작업은 대기 시간이 발생할 수 있으므로 
	// 스레드를 사용하여 메인 작업과 병렬로 처리할 수 있음. 
	
	// 병렬 처리는 하나의 작업을 여러 부분으로 나누어서 동시 처리하는 것 
	
	//스레드 만드는 방법 
	
	public static void main(String[] args) {
		ThreadWithClass thread1 = new ThreadWithClass();
		//Thread 클래스를 상속받아 구현하는 방법 
		
		
		
		//ThreadWithRunnable thread2 = new ThreadWithRunnable(); // X이렇게 실행하면 안됨 
		// Runnable 인터페이스를 구현하는 방법 
		Thread thread2 = new Thread(new ThreadWithRunnable());
		// Runnable 인터페이스에서 run 메서드 하나만을 정의하고 있기 때문에 
		// start, stop와 같은 Thread 메서드를 사용할 수 없다. 
		// -> Thread 클래스에 Runnable인터페이스를 상속받아 구현한 
		// ThreadWithRunable 객체를 전달하여 사용해야 한다! 
		
		thread1.start();//스레드의 실행 
		thread2.start();//스레드의 실행 
		//스레드가 1초 간격으로 동시 실행되고 있는것을 확인할 수 있음! 
		
		// 실무.. 
		// -웹서버,데이터베이스처리, 대규모 데이터처리 등.. 

		
	}
}