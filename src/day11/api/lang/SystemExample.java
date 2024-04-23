package day11.api.lang;

public class SystemExample {

    private static long start;

    public static void main(String[] args) {

        // 프로그램의 실행시간 체크할때 사용
        long l = System.currentTimeMillis();
        System.out.println("l = " + l);

        String s ="";
        for (int i = 0; i < 50000; i++) {
            s += "abc";
        }
        
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("time = " + time/1000.0 + "s");
    }
    
}
