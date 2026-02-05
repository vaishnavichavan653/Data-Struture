import java.util.Scanner;

class Arrayoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, choice;
        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        do {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1. Display");
            System.out.println("2. Search");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: 
                    System.out.print("Array elements: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;

                case 2: 
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at position " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found");
                    }
                    break;

                case 3: 
                    System.out.print("Enter position to update: ");
                    int pos = sc.nextInt();

                    if (pos > 0 && pos <= n) {
                        System.out.print("Enter new value: ");
                        arr[pos - 1] = sc.nextInt();
                        System.out.println("Element updated successfully");
                    } else {
                        System.out.println("Invalid position");
                    }
                    break;

                case 4: 
                    System.out.print("Enter position to delete: ");
                    int del = sc.nextInt();

                    if (del > 0 && del <= n) {
                        for (int i = del - 1; i < n - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        n--;
                        System.out.println("Element deleted successfully");
                    } else {
                        System.out.println("Invalid position");
                    }
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}
