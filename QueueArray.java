import java.util.Scanner;

public class QueueArray {
    int arr[];
    int front, rear, size;

    // Constructor
    QueueArray(int n) {
        size = n;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue operation
    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            arr[rear] = x;
            System.out.println("Inserted: " + x);
        }
    }

    // Dequeue operation
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted: " + arr[front]);
            front++;
        }
    }

    // Display queue
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();

        sc.close();
    }
}