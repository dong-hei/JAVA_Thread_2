package thread2;

public class CustomThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int index = 0; index < 10; index++) {
            sum += index;
            System.out.println(sum);
        }
        System.out.println( Thread.currentThread() + "최종 합 : " + sum);

    }
    //스레드가 실행할 작업을 Runable 구현클래스 대신 Thread를 상속한 새로운 클래스를 정의하여 run 메소드를 Overriding 하는 방법이다
    // 혹은 코드를 단순히 하기 위해 Thead 익명 객체로 작업 스레드 객체를 생성할 수 있습니다.


}
