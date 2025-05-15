package BasicsAndBinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        /*Order Agnostic binary search :
        * used when we don't know the order of array - asc or dsc */
        /*
        * first we figure out the order and based on that apply binary search.
        * if the first is > last = dsc
        * if the first is < last = asc
        * if the first = last = the entire array has only one value at diff indices
        * */
        /*int arr[] = {23, 43, 53, 63, 73};*/
        int arr[] = {73, 63, 53, 43, 23};
        /*int arr[] = {23, 23, 23, 23, 23};*/
        int target = 23;
        int ansIndex = 0;
        boolean isAsc = isAsc(arr);
        boolean isSame = isSame(arr);
        if (isSame && arr[0]!=target) {
            System.out.println("Whole array contains only one element: "+arr[0]);
            System.out.println("Not found the target");
            return;
        }
        if (isSame && arr[0]==target)
        {
            System.out.println("Whole array contains only one element: "+arr[0]);
            System.out.println("found the target");
            return;
        }
        ansIndex = bs(arr, target, isAsc);
        /*if (isAsc) {
            System.out.println("It's an Asc array.");
            ansIndex = ascArrayBS(arr, target);
        } else {
            System.out.println("It's an Dsc array.");
            ansIndex = dscArrayBS(arr, target);
        }*/
        if (ansIndex != -1)
            System.out.println(target+" is found at index: "+ansIndex);
        else
            System.out.println(target+" target not found.");
    }

    private static int bs(int[] arr, int target, boolean isAsc) {
        int startIndex = 0;
        int endIndex = arr.length-1;
        int mid = 0;
        if (isAsc) {
            System.out.println("It's an Asc array.");
            while (startIndex <= endIndex) {
                mid = (startIndex + endIndex)/2; //better way s + (e-s)/2 => this way it will not exceed the max int limit.
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    endIndex = mid - 1;
                } else {
                    startIndex = mid + 1;
                }
            }
        } else {
            System.out.println("It's an Dsc array.");
            while (startIndex <= endIndex) {
                mid = (startIndex + endIndex)/2; //better way s + (e-s)/2 => this way it will not exceed the max int limit.
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    endIndex = mid - 1;
                } else {
                    startIndex = mid + 1;
                }
            }
        }
        return -1;
    }

    /*private static int dscArrayBS(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length-1;
        int mid = 0;

        while (startIndex <= endIndex) {
            mid = (startIndex + endIndex)/2; //better way s + (e-s)/2 => this way it will not exceed the max int limit.
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return -1;
    }

    private static int ascArrayBS(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length-1;
        int mid = 0;

        while (startIndex <= endIndex) {
            mid = (startIndex + endIndex)/2; //better way s + (e-s)/2 => this way it will not exceed the max int limit.
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return -1;
    }
*/
    private static boolean isSame(int[] arr) {
        if (arr[0] == arr[arr.length-1]) {
            return true;
        }
        return false;
    }

    private static boolean isAsc(int[] arr) {
        if (arr[0] < arr[arr.length-1]) {
            return true;
        }
        return false;
    }
}
