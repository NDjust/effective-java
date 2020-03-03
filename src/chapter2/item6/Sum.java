package chapter2.item6;

// 심각하게 느린 경우, 객체가 만들어진 위치를 찾았는가?
public class Sum {

    private static long sum() {
        Long sum = 0L;

        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int numSets = Integer.parseInt(args[0]);
        long x = 0;

        for (int i = 0; i < numSets; i++) {
            long start = System.nanoTime();
            x += sum();
            long end = System.nanoTime();
            System.out.println((end - start) / 1_000_000. + " ms.");
        }

        // VM 이 최적화 하지 못하게 막는 코드
        if (x == 42) {
            System.out.println();
        }
    }
}
