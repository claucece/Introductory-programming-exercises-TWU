package PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    List primeList;

    public PrimeFactors(){
        primeList = new ArrayList<Integer>();
    }

    public List<Integer> generatePrimes(int number) {
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                primeList.add(i);
                number /= i;
            }
        }
        System.out.println(primeList);
        return primeList;
    }
}
