package Level1;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;

public class TwoNumSum{
	public static void main(String[] args) {
		int[] numbers = new int[]{2,1,3,4,1};
		int[] answer = {};
		
		int i, j, sum, k;
		ArrayList<Integer> list = new ArrayList<> ();
					
		for(i=0; i<numbers.length; i++) {
			sum=0;
			for(j=i+1; j<numbers.length; j++) {
				sum=numbers[i]+numbers[j];
				if(!list.contains(sum)) {
					list.add(sum);
				}
				Collections.sort(list);
			}
		}
		answer= new int[list.size()];
		for(k=0; k<list.size(); k++) {
			answer[k]=list.get(k);
		}
	}
}