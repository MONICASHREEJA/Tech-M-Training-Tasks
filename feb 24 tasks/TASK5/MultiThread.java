import java.util.Arrays;

class MergeSortThread extends Thread {
    private int[] arr;
    private int left, right;

    public MergeSortThread(int[] arr, int left, int right) {
        this.arr = arr;
        this.left = left;
        this.right = right;
    }

    public void run() {
        mergeSort(arr, left, right);
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            
            MergeSortThread leftSorter = new MergeSortThread(arr, left, mid);
            MergeSortThread rightSorter = new MergeSortThread(arr, mid + 1, right);

            leftSorter.start();
            rightSorter.start();

            try {
                leftSorter.join();
                rightSorter.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

           
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] leftArray = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            arr[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            arr[k++] = rightArray[j++];
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        MergeSortThread sorter = new MergeSortThread(array, 0, array.length - 1);
        sorter.start();

        try {
            sorter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
