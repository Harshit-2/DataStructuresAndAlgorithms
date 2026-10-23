class Lesson34PascalTriangleType1 {

    public static int pascalTriangle(int r, int n) {
       int res = 1;
       for (int i = 1; i <= n; i++) {
        res = res * (n-i);
        res = res/(i+1);
       }
       return res;
    }

    public static void main(String[] args) {
        int answer = pascalTriangle(5,2);
        System.out.println(answer);
    }
}
