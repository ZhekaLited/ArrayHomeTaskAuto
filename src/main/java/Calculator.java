
public class Calculator {
    public static void main(String[] args) {
        int result = MyMethod();
        System.out.println("Average value of the array elements is : " + result);
    }

    public static int MyMethod() {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        //calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        //calculate average value
        int average = sum / numbers.length;
        return average;
    }

    public static int add(int[] numbers1) {
        return MyMethod();
    }
}

