import java.util.*;
import java.time.LocalDate;
import java.util.function.*;

public class Main {

	public static void main(String[] args) {
//		1. Lambda expression to sort a string array in alphabetical order
		ArrayList<String> names = new ArrayList<>();

		names.add("Sujal");
		names.add("Rahul");
		names.add("Amit");
		names.add("Pankaj");
		names.add("Neha");
		System.out.println("Original name list: "+ names);
		Comparator<String> comapre = (s1,s2) -> s1.compareTo(s2);
		
		names.sort(comapre);
		
		System.out.println("Names after sorting list: "+ names);
		
//		2. Lambda expression to find the largest number in an integer array.
		
		Integer [] nums = {2,10,14,8,5};
		
		Function<Integer[], Integer> findMax = arr ->{
			Integer max = nums[0];
			
			for(int i = 1; i < nums.length; i++) {
				if(nums[i] > max)
					max = nums[i];
			}
			return max;
		};
		
		Integer result = findMax.apply(nums);
		System.out.println("Max value in an arr is: " + result);
	
//		3. Lambda expression to find the smallest number in an integer array.
		
		Integer [] arr = {2,77,99,26,19};
		
		Function <Integer[], Integer> findMin = array -> {
			Integer min = arr[0];
			
			for(int i = 1; i < arr.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			
			return min;
		};
		
		Integer minValue = findMin.apply(arr);
		System.out.println("Min value in an arr is: " + minValue);
		System.out.println();
		
//		4. Lambda expression to generate a 3 digit random number
		
		Supplier<Integer> otp = () -> (int)(Math.random() * 900) + 100;
		
		System.out.println("3 digit OTP is Generated: "+ otp.get());
		System.out.println();
		
//		5. Lambda expression that takes an integer array and returns the reverse integer array
		
		Integer[] numArr = {2,9,77,5};
		
		Function<Integer[],Integer[]> revArr = num -> {
			Integer[] rev = new Integer[num.length];
			
			for(int i = 0; i < num.length; i++) {
				rev[i] = num[num.length -1 - i];
			//	rev[0] = num[4-1-0] -> num[3]; //5
			//	rev[1] = num[4-1-1] -> num[2]; //77
			//  rev[2] = num[4-1-2] -> num[1]; //9
			//  rev[3] = num[4-1-3] -> num[0]; //2	
			}
			
			return rev;
		};
		
		Integer[] resultArr = revArr.apply(numArr);
		System.out.println("Normal Order of arr: "+Arrays.toString(numArr));
		System.out.println("Reverse Order of arr: "+Arrays.toString(resultArr));
		
//		6. Lambda expression to print the current date
		
		Runnable date = () -> {
			System.out.println("Current Date: "+ LocalDate.now());
		};
		
		date.run();
		System.out.println();
		
//		7. Lambda expression to evaluate if a number entered is a Prime number
		Predicate<Integer> primeNum = n -> {
			
			if (n < 2) {
			    return false;
			}else {
				for(int i = 2; i < n; i++) {
					if(n % i == 0)
						return false;
					else
						return true;
				}
			}
			
			return true;
		};
		
		Boolean isPrime = primeNum.test(4);
		System.out.println("is Prime Number -> " + isPrime);
		System.out.println();
		
//		8. Lambda expression to accept 2 strings and return the concatenated value of the same
		BiFunction<String, String, String> concat = (s1, s2) -> s1.concat(s2);
		
		String concatStr= concat.apply("Sujal ", "Taware");
		System.out.println("String after Concat: "+ concatStr);
		System.out.println();
	}

}
