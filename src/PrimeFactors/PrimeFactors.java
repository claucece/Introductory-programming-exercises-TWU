package PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    List primeList;
    private final int firstDivisor = 2;

    public PrimeFactors(){
        primeList = new ArrayList<Integer>();
    }

    public List<Integer> generatePrimes(int number) {
        for (int i = firstDivisor; i <= number; i++) {
            while (number % i == 0) { // if i is a factor of N, repeatedly divide it out
                primeList.add(i);
                number /= i;
            }
        }
        System.out.println(primeList);
        return primeList;
    }
}
