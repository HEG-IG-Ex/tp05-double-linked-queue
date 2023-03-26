public class DList<T>{
    private Node first;
    private Node last;

    private int size;


    private class Node{
        private Node prev;
        private Node next;

        private T data;

        public Node(T data){
            this.data = data;
        }
    }

    public DList(){
        size = 0;
        first = last = null;
    }

    public void addFirst(T i){
        Node newNode = null;
        if(first == null){
            newNode = new Node(i);
            last = first = newNode;
        }else{
            newNode =  new Node(i);
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
        size++;
    }

    public void addLast(T i){
        Node newNode = null;
        if(last == null){
            newNode = new Node(i);
            last = first = newNode;
        }else{
            newNode = new Node(i);
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public T removeFirst(){
        if(isEmpty()){
            System.out.println("Empty !");
            return null;
        } else {
            Node formerFirst = first;
            first = first.next;
            size--;
            return formerFirst.data;
        }
    }

    public T removeLast(){
        if(isEmpty()){
            System.out.println("Empty !");
            return null;
        } else {
            Node formerLast = last;
            last = last.prev;
            size--;
            return formerLast.data;
        }
    }


    public boolean isEmpty(){
        return size == 0;
    }

}
