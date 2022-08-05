public class prime_min {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for(int i = 0; i < 100; i++){
            if (isPrimeNumber(i)){
                System.out.println(i + " ");
            }
        }
    }
    public static boolean isPrimeNumber(int n){
        if(n < 2){
            return false;
        }
        int checkPrime = (int) Math.sqrt(n);
        for(int i = 2; i <= checkPrime; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
