package LinkedList;

//leetcode questions

public class removeDublicate {

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
            Node(){

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


        ////returns the node of the cycle starts
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


        /// Returns the length of the cycle
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

        /// detects the ll has a  cycle or not
        public static boolean cycleFound(Node head){
            Node node = head;
            if(node == null || node.next == null){
                return false;
            }
            Node slow = node;
            Node fast = node.next;
            while(slow != fast){
                if(fast.next == null || fast.next.next == null) return false;
                slow = slow.next;
                fast = fast.next;
            }
            return true;
        }

        /// detect happy number
        public boolean isHappy(int n) {
            while(n != 1){
                int q = n / 10;
                int r = n % 10;
                n = q + r;
                if(n == 1){
                    break;
                }
                Node node = new Node(n);
                insertLast(node.value);
                if(cycleFound(node)){
                    return false;
                }
            }
            return true;
        }

        /// mergetwolist using node
        public Node mergeTwoLists(Node list1, Node list2) {
            Node ans = new Node();
            //since the node will keep on updating so the current will be the tail
            Node tail = ans;
            while(list1 != null && list2 != null){
                if(list1.value < list2.value){
                    tail.next = list1;
                    list1 = list1.next;
                    tail = tail.next;
                }
                else{
                    tail.next = list2;
                    list2 = list2.next;
                    tail = tail.next;
                }
            }
            while(list1 != null){
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            }
            while(list2 != null){
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
            return ans.next;
        }

        /// find the middle node
        public Node middleNode(Node head) {
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}
