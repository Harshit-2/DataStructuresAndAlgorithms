package BinarySearch;

public class Lesson54SqrtOfNumberBrute {
    
    public static int sqrtN(long N) {

    for (int i = 1; i < N; i++) {
        if (i * i == N) return i;
        else if (i * i > N) return i-1;
    }
    return -1;
    }

    public static void main(String[] args) {
    System.out.println(sqrtN(10));
    }
}
