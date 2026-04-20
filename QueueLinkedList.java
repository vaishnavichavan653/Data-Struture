class QueueLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null, rear = null;

    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(data + " inserted");
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(front.data + " deleted");
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();
    }
}