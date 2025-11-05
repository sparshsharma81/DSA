class HeapSort {
    public void heapify(int arr[], int n, int i) {
        int largest = i; // root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // if left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // if right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // if largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public void heapSort(int arr[]) {
        int n = arr.length;

        // build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // one by one extract elements from heap
        for (int i = n - 1; i >= 0; i--) {
            // move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        HeapSort hs = new HeapSort();
        hs.heapSort(arr);

        System.out.println("Sorted array is:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
