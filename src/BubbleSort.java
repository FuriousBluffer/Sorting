public class BubbleSort {

	static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++)  {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		int arr[] = {5,6,8,2,3,9,15,99,51,82,36,24,13};
		bubbleSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
=======
		public class BubbleSort {

			static void bubbleSort(int arr[]) {
		        int n = arr.length;
		        for (int i = 0; i < n-1; i++) {
		            for (int j = 0; j < n-i-1; j++)  {
		                if (arr[j] > arr[j+1]) {
		                    int temp = arr[j];
		                    arr[j] = arr[j+1];
		                    arr[j+1] = temp;
		                }
		            }
		        }
		    }

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int arr[] = {5,6,8,2,3,9,15,99,51,82,36,24,13};
				bubbleSort(arr);
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
			}

>>>>>>> refs/heads/NewSort
		}
	}

}