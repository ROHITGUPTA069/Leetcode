package LinkedList;

//leetcode questions

public class removeDublicate {
    public static void main(String[] args) {
        ll list1 = new ll();
        ll list2 = new ll();
        list1.insertfirst(1);
        list1.insertLast(2);
        list1.insertLast(2);
        list2.insertLast(3);
        list2.insertLast(4);
        list2.insertLast(4);
        ll list3 = ll.combinelist(list1, list2);
        list3.display();
//        list.display();
//        ll.dublicate();
//        list.display();
    }

    public static class ll {

        private  Node head;
        private  Node tail;
        private  int size;

        public ll() {
            this.size = 0;
        }

        static class Node{
            int value;
            Node next;

            Node(int value){
                this.value = value;
            }
            Node(int value, Node next){
                this.value = value;
                this.next = next;
            }
        }

        public  void dublicate(){
            Node node = head;
            while(node.next != null){
                if(node.value == node.next.value ){
                    node.next = node.next.next;
                    size--;
                }
                else{
                    node = node.next;
                }
            }
            tail = node;
            tail.next = null;
        }

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value + " --> ");
                temp = temp.next;

            }
            System.out.println("end");
        }

        public void insertLast(int val){
            if(head == null){
                insertfirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }

        public void insertfirst(int val) {
            Node node = new Node(val);
            node.next = head;
            head = node;

            if(tail == null){
                tail = head;
            }
            size ++;
        }

        public static ll combinelist(ll list1, ll list2){
            ll list3 = new ll();
            Node first = list1.head;
            Node second = list2.head;
            while(first != null && second != null){
                if(first.value < second.value){
                    list3.insertLast(first.value);
                    first = first.next;
                }
                else{
                    list3.insertLast(second.value);
                    second = second.next;
                }
            }
            while(first != null){
                list3.insertLast(first.value);
                first = first.next;
            }
            while(second != null){
                list3.insertLast(second.value);
                second = second.next;
            }
            return list3;
        }



        public static Node detectCycle(Node head) {
            Node slow = head;
            Node fast = head.next;
            int length = 0;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                     length = lengthCycle(slow);
                    break;
                }
            }
            Node f = head;
            Node s = head;
            while(length !=  0){
                f = f.next;
                length--;
            }
            while( f != s){
                f = f.next;
                s = s.next;
            }
            return s;
        }

        public static int lengthCycle(Node head){
            Node node = head;
            if(node.next == null){
                return 0;
            }
            node = node.next;
            int length = 1;
            while(node != head){
                node = node.next;
                length++;
            }
            return length;
        }
    }
}
