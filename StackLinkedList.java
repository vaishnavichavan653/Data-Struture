class StackLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    // Push operation
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " inserted");
    }

    // Pop operation
    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(top.data + " deleted");
            top = top.next;
        }
    }

    // Display stack
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();
        s.display();
    }
}