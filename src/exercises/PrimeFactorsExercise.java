package exercises;

public class PrimeFactorsExercise {
    public static void main(String[] args) {
        new PrimeFactorsExercise().generate(30);
    }

    public void generate(int number){
        int n = number;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }

    }
}
