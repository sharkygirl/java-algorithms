package sort.bubble;

public class BubbleSort {

public static int[] sort(int[] input) {
		
	int temp = 0;
	int[] sortedInput = input;
		
	for (int i = input.length-1; i > 1; i--) {
		for (int j = 0; j < i; j++) {
			if (sortedInput[j] > sortedInput[j+1]) {
				temp = sortedInput[j];
				sortedInput[j] = sortedInput[j+1];
				sortedInput[j+1] = temp;
			}
		}
	}		
	return sortedInput;
}

public static void main(String args[]) {
	int[] input = {3, 45, 23, 77, 43, 7, 10, 16, 39};
	
	int[] sortedInput = BubbleSort.sort(input);
	for (int i = 0; i < sortedInput.length; i++) {
		System.out.println(sortedInput[i]);
	}
}

}

