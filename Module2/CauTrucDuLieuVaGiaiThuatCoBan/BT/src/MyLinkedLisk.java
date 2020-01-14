
public class MyLinkedLisk {
    private Node head;
    private  int numNodes = 0;
    public void MyLinkedList(Object data) {
        head = new Node( data);
    }
   public class Node {
        private Node next;
        private Object data;

       public Node(Object data) {
           this.data = data;
       }
       public Object getData(){
           return this.data;
       }
   }
   public void addFist(Object data){
        Node newhead = new Node( data);
        newhead.next =head;
        head = newhead;
        numNodes++;
   }
    public void add(int index,Object data){
        if (index==0){
            addFist(data);
        }
       Node hientai = head;
        for (int i = 0;i < index - 1;i++){
            hientai = hientai.next;
        }
//       while (index > 0 ){
//
//           hientai = hientai.next;
//           index--;
//       }
       Node hoder = new Node( data);

        hoder.next = hientai.next;
        hientai.next = hoder;
        numNodes++;
    }
    public void printLisk(){
        Node hientai = head;
        while (hientai!=null){
            System.out.println(hientai.data);
            hientai = hientai.next;
        }
    }
    public Node get(int index){
        Node hientai = head;
        for (int i = 0 ;index > 0 && index <= numNodes;i++){
            hientai = hientai.next;
        }
        return hientai;
    }
}
