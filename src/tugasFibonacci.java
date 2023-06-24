public class tugasFibonacci {
    public static void penjumlahanFibonacci(int awal, int akhir) {
        int sum = 0;
        int count = 0;

        int[] arrayFibo = new int[3];
        arrayFibo[0] = 0;
        arrayFibo[1] = 1;

        while (arrayFibo[2] <= akhir) {
            if (arrayFibo[2] >= awal && arrayFibo[2] % 2 == 0) {
                System.out.println(arrayFibo[2]);
                sum += arrayFibo[2];
                count++;
            }

            arrayFibo[0] = arrayFibo[1];
            arrayFibo[1] = arrayFibo[2];
            arrayFibo[2] = arrayFibo[0] + arrayFibo[1];
        }

        System.out.println("Total bilangan Fibonacci genap: " + count);
        System.out.println("Jumlah bilangan Fibonacci genap: " + sum);
    }
    public static void main(String[] args) {
        System.out.println("Deret Fibonacci yang genap:");
        penjumlahanFibonacci(10, 4500);
    }

}
