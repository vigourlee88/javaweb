import java.util.ArrayList;

class PrimeDirective {
	public boolean isPrime(int number) {
		for(int i = 2;i < number; i++) {
			if(number % i == 0) {
				return false;
			}
			if(number == 2) {
				return true;
			}else if (number < 2) {
				return false;
			}
		}
		return false;
	}
	
	public ArrayList<Integer> onlyPrimes(int[] numbers) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for(int number: numbers) {
			if(isPrime(number)) {
			 primes.add(number);	
		    }	
	    }
		return primes;
	}
	public static void main(String[] args) {
		PrimeDirective pd = new PrimeDirective();
		
		/*System.out.println(pd.isPrime(7));
		System.out.println(pd.isPrime(8));
		System.out.println(pd.isPrime(2));
		System.out.println(pd.isPrime(0));
		*/
		

		
		System.out.println(pd.isPrime(6));
		
		int[] numbers = null;
		System.out.println(pd.onlyPrimes(numbers));
		
	}
}