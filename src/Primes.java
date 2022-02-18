public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        int k = 0; //счётчик количества чисел, на которые делится переменная n
            for (int j = 2; j <= n; j++) {
                if (n % j == 0) { //проверка на делимость нацело
                    k++;
                }
            }
            if (k < 2) { //если число делится только на одно, то есть на себя, мы его выводим
                return true;
            }
            else {
                return false;
            }
    }
}