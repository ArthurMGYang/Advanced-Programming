/**
 * @author MaoYang
 * @create 2021-06-28  17:36
 */
public class PrimeFinderInRange_Q3 {

    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("usage: java PrimeFinderInRange_Q3 <min-range><max-range>");
            return;
        }
        int minRange = Integer.parseInt(args[0]);
        int maxRange = Integer.parseInt(args[1]);
        for (int i = minRange;i <= maxRange;i++){
            if (PrimeFinder.isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
