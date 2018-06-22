import java.util.ArrayList;

/**
 * Created by Facundo Laxalde.
 */
public class PrimeNumbers {

    private static final PrimeNumbers instance = new PrimeNumbers();

    private java.util.ArrayList<Integer> primeNumbersAlreadyCalculated;


    private PrimeNumbers(){
        primeNumbersAlreadyCalculated = new java.util.ArrayList<Integer>();
        primeNumbersAlreadyCalculated.add(2);
    }

    public static PrimeNumbers getInstance(){
        return instance;
    }

    public java.util.ArrayList<Integer> getTenPrimes(){
        return new ArrayList<Integer>( primeNumbersAlreadyCalculated.subList(0, 10));
    }

    public java.util.ArrayList<Integer> getAllPrimesAvailable(){
        return primeNumbersAlreadyCalculated;
    }
    public java.util.ArrayList<Integer> getNFirstPrimes(int n){
        if (primeNumbersAlreadyCalculated.size() < n){
            calculateFirstNPrimes(n);
        }
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i<n; i++){
            ret.add(primeNumbersAlreadyCalculated.get(i));
        }
        return ret;
    }

    public void calculateFirstNPrimes(int n){
        int lastPos;
        int valueToTry = 0;
        boolean newPrimeNumber = false;
        while (primeNumbersAlreadyCalculated.size() < n) {
            if (!newPrimeNumber) {
                lastPos = primeNumbersAlreadyCalculated.size() - 1;
                valueToTry = primeNumbersAlreadyCalculated.get(lastPos) + 1;
            }
            if (isPrime(valueToTry)){
                primeNumbersAlreadyCalculated.add(valueToTry);
                newPrimeNumber = false;
            } else {
                valueToTry++;
                newPrimeNumber = true;
            }
        }

    }

    private boolean isPrime(int n) {
        if (n%2==0) return false;
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }


}
