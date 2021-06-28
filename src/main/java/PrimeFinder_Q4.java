/**
 * @author MaoYang
 * @create 2021-06-28  17:52
 */
public class PrimeFinder_Q4 {
    public static boolean isPrime(int n){
        for(int x = 2; x<= (int)Math.sqrt(n);x++){
            if(n%x == 0){
                return false;//early termination
            }
        }
        return true;
    }

    /**
     * @param n the smaller one of a pair
     * @return true if  the pair(n,n+2)is a twin prime
     */
    static boolean isTwinPrime(int n){
        if (!isPrime(n)||!isPrime(n+2)) return false;
        return true;
    }

    static boolean isCousinPrime(int n){
        if (!isPrime(n)||!isPrime(n+4)) return false;
        return true;
    }

    static boolean isSexyPrime(int n){
        if (!isPrime(n)||!isPrime(n+6)) return false;
        return true;
    }

    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("usage: java PrimeFinder_Q4 <max-range>");
        }
        int maxRange = Integer.parseInt(args[0]);
        System.out.println("Twin prime pairs between 2 and " + maxRange);
        for(int i = 2;i+2 <= maxRange;i++){
            if(isTwinPrime(i)){
                System.out.println("(" + i + "," + (i+2) + ")");
            }
        }
        System.out.println("Cousin prime pairs between 2 and " + maxRange);
        for(int i = 2;i+4 <= maxRange;i++){
            if(isTwinPrime(i)){
                System.out.println("(" + i + "," + (i+4) + ")");
            }
        }
        System.out.println("Sexy prime pairs between 2 and " + maxRange);
        for(int i = 2;i+6 <= maxRange;i++){
            if(isTwinPrime(i)){
                System.out.println("(" + i + "," + (i+6) + ")");
            }
        }
    }
}
