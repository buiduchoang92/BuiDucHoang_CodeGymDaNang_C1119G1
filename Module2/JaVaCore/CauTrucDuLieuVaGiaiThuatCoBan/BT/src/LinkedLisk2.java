public class LinkedLisk2<E> {
    private Node head;
    private int numNodes = 0;

    public LinkedLisk2(Object data) {
        head = new Node(data);
    }

    public LinkedLisk2() {

    }

    public class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data =data;
        }
        public Object getdata(){
            return this.data;
        }
    }

    public void addFirst(E e){
       Node temp = head;
       head = new Node(e);
       head.next =temp;
       numNodes++;
    }

    public void addLast(E e){
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }


    public int size(){
        return this.numNodes;
    }

    public void add(int index,E e){
        Node temp = head;
        Node hoder;
        for (int i = 0; i < index - 1 && temp.next != null;i++){
            temp = temp.next;
        }
        hoder = temp.next;
        temp.next = new Node(e);
        temp.next.next = hoder;
        numNodes++;
    }

    public Object get(int index){
        Node temp = head;
        for (int i = 0; i< index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
}
