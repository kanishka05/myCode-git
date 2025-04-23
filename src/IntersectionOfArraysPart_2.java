import java.util.*;
public class IntersectionOfArraysPart_2 {
    public static void main(String[] args) {
        int[] nums1 = {4,7,9,7,6,7};
        int[] nums2 = {5,0,0,6,1,6,2,2,4};
        intersect(nums1, nums2);
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        //convert any one array into map - key=element, value=count
        HashMap<Integer, Integer> nums1Map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int n1 : nums1) {
            int value = 0;
            if (nums1Map.containsKey(n1)) {
                value = nums1Map.get(n1);
            }
            nums1Map.put(n1, value+1);
        }
        System.out.println(nums1Map);
        // check if the elements in nums2, exists in nums1 keyset - if yes - check its value/count -
        // if value is > 0 - add that value in the arraylist and
        // minus the count of that element in nums1 keyset by 1.
        for (int n2 : nums2) {
            if (nums1Map.containsKey(n2)) {
                if (nums1Map.get(n2) > 0) {
                    result.add(n2);
                    nums1Map.put(n2, nums1Map.get(n2)-1);
                }
            }
        }
        System.out.println(result);
        return result.stream().mapToInt(Integer :: intValue).toArray();
    }
}
