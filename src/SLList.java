public class SLList extends Generics{
    private SLNode head;

    public SLList(){
        head = null;
    }

    public void listAdd(Book p){
        SLNode newNode = new SLNode(p);
        if(head == null){
            head = newNode;
        }
        else{
            SLNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void listRemove(int pos){
        if (head == null) {
            return;
        }

        if (pos == 0) {
            head = head.getNext();
            return;
        }

        SLNode current = head;
        int index = 0;
        while (current != null && index < pos - 1) {
            current = current.getNext();
            index++;
        }

        if (current == null || current.getNext() == null) {
            return;
        }

        current.setNext(current.getNext().getNext());
    }

    public String toString(){
        StringBuilder elements =  new StringBuilder();
        SLNode current = head;
        while (current != null) {
            elements.append(current.getBook().toString()).append("\n");
            current = current.getNext();
        }
        return elements.toString();
    }

    public class SLNode{
        private Book book;
        private SLNode next;

        public SLNode(Book book){
            this.book = book;
            this.next = null;
        }

        public Book getBook(){
            return book;
        }
        public SLNode getNext(){
            return next;
        }

        public void setNext(SLNode next){
            this.next = next;
        }
    }
}