package ss10.DanhSach.BaiTap.Bai2;

public class MyLinkedList<E> {
    public class Node{
        Node next;
        Object data;
        public Node(Object data){
            this.data = data;
        }
        public Object  getData(){
            return this.data;
        }
    }
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }
}
