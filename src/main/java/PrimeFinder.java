/**
 * @author MaoYang
 * @create 2021-06-28  17:37
 */
public class PrimeFinder {
    static boolean isPrime(int n){
        for(int x = 2; x<= (int)Math.sqrt(n);x++){
            if(n%x == 0){
                return false;//early termination
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("usage: java PrimeFinder <max-range>");
        }
        int maxRange = Integer.parseInt(args[0]);
        for(int i = 2;i <= maxRange;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
