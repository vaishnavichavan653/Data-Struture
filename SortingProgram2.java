import java.util.Scanner;

public class SortingProgram2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i]; 
        }
        for (int i = 1; i < n; i++) {
            int key = arr1[i];
            int j = i - 1;

            while (j >= 0 && arr1[j] > key) {
                arr1[j + 1] = arr1[j];
                j--;
            }
            arr1[j + 1] = key;
        }

        System.out.println("\nAfter Insertion Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }    
        mergeSort(arr2, 0, n - 1);

        System.out.println("\n\nAfter Merge Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }

        sc.close();
    }

    static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int arr[], int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}