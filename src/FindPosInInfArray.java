public class FindPosInInfArray {
    public static void main(String[] args) {
        //assume you have given infinite array - meaning we don't know the length.
        int[] arr = {3,5,7,9,13,14,15};
        //given a target
        int target = 14;
        int[] range = {-1,-1};

        //need to find the index of this target in this array
        //since the lenght is not given, we need to find it using chunks
        //we will start with start index as 0 and end index as 1
        // we will see if the target falls in btw these 2 index
        //if yes - we will apply binary search here and will find the exact index
        //if not - we will move to the next range - will increase start position by adding 1 to the end  and will increase end position by multiplying 2 with end
        // will apply binary search here now in this range
        // we will check again for the target in the range and follow the above method to find out
        //if the target is there we will find it by binary search, if not we will return -1 at the end.


        // pattern
        //increasing the start and end
        //checking the target falls in this range
        //applying binary search

        int[] r = findtheRange(arr, target, range);
        if (r[0] != -1) {
            //apply binary search here
        } else {
            System.out.println("target not found");
        }
    }

    private static int[]  findtheRange(int[] arr, int target, int[] range) {
        int start = 0;
        int end =  1;
        while (!(target > arr[end] && target < arr[start])) {
            start = end + 1;
            end = end + ((end-start)+1)*2;
        }
        System.out.println("found the range");
        range[0] = start;
        range[1] = end;
        return range;
        }

}
