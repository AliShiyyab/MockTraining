package mockExam;

public class LinkedList<T> {
    private Node head = null;

    //Add Value || Insert
    public void addData(T data){
        Node node = new Node(data);
        if(head==null){
            head=node;
        }
        else{
            node.setNext(head);
            head = node;
        }
    }

//    //Append
    public void appendValue(T data){
        Node current = this.head;
        if (current == null) {
            Node node = new Node(data);
            head = node;
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            Node node = new Node(data);
            node.setNext(null);
            current.setNext(node);
        }
    }

    //InsertAfter
    public void insertAfter(T beforeValue ,T data){
        Node current = this.head;
        while (current.getNext() != null){
            if (current.getData() == beforeValue){
                addData(data);
            }
            current = current.getNext();
        }
    }

    //Get Max Value
    public void maxValue(){
        Integer max = 0;
        Node current = this.head;
        while (current != null){
            if (max < (Integer) current.getData()){
                max = (Integer) current.getData();
            }
            current = current.getNext();
        }
        System.out.println("The Max : " + max);
    }

    //Get Min value
    public void minValue(){
        Node current = this.head;
        int min = 0;
        while (current != null){
            if (min > (Integer) current.getData()){
                min = (Integer) current.getData();
            }
            current = current.getNext();
        }
        System.out.println("The Min : "+min);
    }

    //Get Second Max Value
    public void secondMaxValue(){
        Node current = this.head;
        int first = 0;
        int second = 0;
        while (current != null){
            if (first < (Integer) current.getData()){
                second = first;
                first = (Integer) current.getData();
            }
            else if((Integer) current.getData() != first && second < (Integer) current.getData()){
                second = (Integer) current.getData();
            }
            current = current.getNext();
        }
        System.out.println("Second Max value : " + second);
    }

    //Get Middle value
    public void midValue(){
        Node<T> current = this.head;
        int counter = 0;
        while (current!=null){
            counter++;
            current = current.getNext();
        }
        Node<T> mid = this.head;
        if(counter % 2 == 1){
            counter = counter / 2;
        }
        else{
            counter = counter - 1;
            counter = counter / 2;
        }
        for(int i = 0 ; i < counter ; i++){
            mid = mid.getNext();
        }
        System.out.println("The Middle value : " + mid.getData());
    }

    //merge tow lists!
    public void mergeLinkedList(LinkedList linkedList1 , LinkedList linkedList2){
        LinkedList linkedList3 = new LinkedList();
        Node n1 = linkedList1.head;
        Node n2 = linkedList2.head;
        while (n1 != null || n2 != null){
            if (n1 != null && n2 != null){
                linkedList3.appendValue(n1.getData());
                linkedList3.appendValue(n2.getData());
                n1 = n1.getNext();
                n2 = n2.getNext();
            }
            else if (n1 == null ){
                linkedList3.appendValue(n2.getData());
                n2 = n2.getNext();
            }
            else if (n2 == null ){
                linkedList3.appendValue(n1.getData());
                n1 = n1.getNext();
            }
        }
        Node n22 = linkedList3.head;
        System.out.print("[ ");
        while (n22.getNext() != null){
            System.out.print(n22.getData() + " , ");
            n22 = n22.getNext();
        }
        System.out.print(n22.getData());
        System.out.print("]");
        System.out.println();
    }

    //palendrom
    public boolean palindrome(LinkedList a){
        Node n1 = a.head;
        Node n2 = n1;
        Node n3 = null;
        while(n1!=null){
            n3=n1;
            n1=n1.getNext();
        }
        if(n2.getData()==n3.getData()){
            return true;
        }
        else
            return false;
    }

    //reversed
    public void revers(LinkedList list){
        LinkedList list1 = new LinkedList();
        Node n1 = list.head;
        while (n1 != null){
            list1.appendValue(n1.getData());
            n1 = n1.getNext();
        }
        Node n2 = list1.head;
        System.out.print("[ ");
        while (n2.getNext() != null){
            System.out.print(n2.getData() + " , ");
            n2 = n2.getNext();
        }
        System.out.print(n2.getData());
        System.out.print("]");
        System.out.println();
    }
}