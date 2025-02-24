import java.util.ArrayList;
import java.util.List;

class PrimeSumThread extends Thread {
    private int start, end;
    private long sum = 0;

    public PrimeSumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public long getSum() {
        return sum;
    }
}

public class PrimeSum {
    public static void main(String[] args) {
        int limit = 10;
        int numThreads = 4;  
        List<PrimeSumThread> threads = new ArrayList<>();
        int range = limit / numThreads;
        long totalSum = 0;

       
        for (int i = 0; i < numThreads; i++) {
            int start = i * range + 1;
            int end = (i == numThreads - 1) ? limit : (i + 1) * range;
            PrimeSumThread thread = new PrimeSumThread(start, end);
            threads.add(thread);
            thread.start();
        }

        
        for (PrimeSumThread thread : threads) {
            try {
                thread.join();
                totalSum += thread.getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of all prime numbers up to " + limit + " is: " + totalSum);
    }
}
