package sets;
import java.util.*;
public class ZeroSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 1, 3, -4, -2 };
		int k = -3;
		boolean found = false;

		// for(int i = 0; i<a.length; i++) {
		// int sum = 0;
		// for(int j = i; j<a.length; j++) {
		// sum += a[j];
		// if(sum == 0) {
		// found = true;
		// break;
		// }
		// }
		// if(found) break;
		// }

		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for (int element : a) {
			set.add(sum);
			sum += element;
      //Zero sum will only exist if the cumulative sum of the elements excluding the current element
      //and after including the current element are equal
			if (set.contains(sum - k)) {
				found = true;
				break;
			}
		}

		System.out.println("found " + found);
	}

}
