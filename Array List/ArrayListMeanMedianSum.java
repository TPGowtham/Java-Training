package Collections;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListMeanMedianSum {

	public static void mean(ArrayList<Integer> nums)
	{
		int sum = 0;
		for(int i=0; i < nums.size(); i++)
		{
			int n = nums.get(i);
			sum = sum + n;
		}
		System.out.println("Sum : " + sum);
		double mean = sum / nums.size();
		System.out.println("Mean : " + mean);
	}
	public static double median(ArrayList<Integer> nums) 
	{
		Collections.sort(nums);
		if( nums.size() % 2 == 1)
			return nums.get((nums.size() + 1 ) / 2 - 1);
		else {
			double l = nums.get(nums.size() / 2 - 1);
			double h = nums.get(nums.size() / 2);
			return (l + h) / 2;
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers = new ArrayList<>();	
		numbers.add(5);
		numbers.add(2);
		numbers.add(4);
		numbers.add(1);
		numbers.add(6);
		numbers.add(3);
		
		System.out.println("ArrayList : " + numbers);
		mean(numbers);
		System.out.println("Median : " + median(numbers));		
	}
}
