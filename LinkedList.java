class LinkedList{
    Node head;

    class Node{
        
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //add - first
    public static void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    //add - last 
    public static void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while(currNode.nest != null){
            currNode = currNode.next;
        }
    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
    }
}
