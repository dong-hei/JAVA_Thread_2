package thread2.thread2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import thread2.CustomThread;

@SpringBootApplication
public class Thread2Application {

	public static void main(String args[]){
		Thread subTread1 = new CustomThread();

		// 익명 객체 생성
		Thread subTread2 = new Thread() {
			public void run() {
				int sum = 0;
				for (int index = 0; index < 10; index++) {
					sum += index;
					System.out.println(sum);
				}
				System.out.println( Thread.currentThread() + "최종 합 : " + sum);
			}
		};

		subTread1.start();
		subTread2.start();
	}

//	public static void main(String args[]){
//		Thread deamon = new Thread(()->{
//			while ( true ) {
//				System.out.println(" 데몬 스레드가 실행 중입니다.");
//				try {
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		});
//
//		deamon.setDaemon(true);
//		deamon.start();
//
//		try {
//			Thread.sleep(10);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	//데몬 스레드
	//데몬 스레드는 메인 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드로 주 스레드가 종료되면 데몬 스레드 더는 존재 의미가 없기에 강제로 종료된다
	// 워드의 자동 저장 기능을 예로 들을 수 있다. 데몬 스레드를 만드는 방법은 스레드를 만들고 해당 스레드에 setDaemon(true); 메소드를 세팅하는 것이다.
	//데몬 스레드는 메인 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드로 주 스레드가 종료되면 데몬 스레드 더는 존재 의미가 없기에 강제로 종료됩니다. 워드의 자동 저장 기능을 예로 들을 수 있습니다.
	// 데몬 스레드를 만드는 방법은 스레드를 만들고 해당 스레드에 setDaemon(true); 메소드를 세팅하는 것입니다.
}
