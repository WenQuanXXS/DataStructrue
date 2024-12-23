package DataStructure.examples;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 9, 10, 15, 18, 20};
        int target = 9;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println("index:" + result);
    }

    private static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, right);
        } else if (target < arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        }
        return -1;
    }
}
