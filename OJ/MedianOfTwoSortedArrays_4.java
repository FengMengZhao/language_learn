import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;


public class MedianOfTwoSortedArrays_4 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merge = new LinkedList<Integer>();
        Collections.addAll(merge, IntStream.of(nums1).boxed().toArray(Integer[]::new));
        Collections.addAll(merge, IntStream.of(nums2).boxed().toArray(Integer[]::new));
        Integer[] merged_target = merge.toArray(new Integer[merge.size()]);
        Arrays.sort(merged_target);
        int length = merged_target.length;
		return length % 2 == 0 ? 
				(double)(merged_target[length / 2] + merged_target[length / 2 - 1]) / 2 : merged_target[length / 2];
    }
	
	public static void main(String args[]){
		MedianOfTwoSortedArrays_4 motsa = new MedianOfTwoSortedArrays_4();
		int[] nums1 = {1, 2};
		int[] nums2 = {3, 4};
		List<Integer> merge = new ArrayList<Integer>();
        Collections.addAll(merge, IntStream.of(nums1).boxed().toArray(Integer[]::new));
        Collections.addAll(merge, IntStream.of(nums2).boxed().toArray(Integer[]::new));
        Integer[] array = merge.toArray(new Integer[merge.size()]);
        Arrays.sort(array);
        System.out.println(merge);
        System.out.println(Arrays.asList(array));
        System.out.println(motsa.findMedianSortedArrays(nums1, nums2));
        System.out.println(1 >> 1);
	}
}
