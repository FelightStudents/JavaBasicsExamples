
public class Calcultor {

	public static int[] cloneArray(int[] originalArray) {

		int[] cloneArray = new int[originalArray.length];

		for (int i = 0; i < originalArray.length; i++)
			cloneArray[i] = originalArray[i];

		return cloneArray;
	}

	// logic to sort the elements
	public static int[] bubbleSort(int[] array) {
		int n = array.length;
		int k;
		for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (array[i] > array[k]) {
					swapNumbers(i, k, array);
				}
			}
		}
		return array;
	}

	private static void swapNumbers(int i, int j, int[] array) {

		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static int[] generateEvenNumbers(int from, int to) {
		int[] array = new int[((to - from) / 2) + 1];
		int count = 0;

		for (int i = from; i <= to; i++) {
			if (i % 2 == 0) {
				array[count] = i;
				count++;
			}
		}
		return array;
	}

	public static int[] generateRandomNumbers(int size) {
		int[] array = new int[size];

		for (int i = 0; i < array.length; i++)
			array[i] = (int) (Math.random() * 100);

		return array;
	}

	public static int sumOfArray(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

	public static int[] generateNaturalNumbers(int howMany) {
		int[] array = new int[howMany];

		for (int i = 0; i < array.length; i++)
			array[i] = i + 1;

		return array;

	}

	public static boolean isPrime(int num) {
		int i;
		for (i = 2; i < num; i++) {
			if (num % i == 0)
				break;
		}
		if (i != num)
			return false;
		else
			return true;
	}

	public static int add(int num1, int num2) {
		int sum = num1 * num2;
		// System.out.println(sum);
		return sum;
	}

	public static int add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}

	public static double getSpeed(double distance, double time) {
		double speed = distance / time;
		return speed;
	}

}
