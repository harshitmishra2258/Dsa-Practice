
public class Thirdlargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 25, 15};

        if (arr.length < 3) {
            System.out.println("Array must have at least 3 elements");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num < second) {
                third = num;
            }
        }

        System.out.println("Third largest element: " + third);
    }
}
