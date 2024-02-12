public class DLList extends Generics {
    private DLNode head;

    public DLList() {
        head = null;
    }

    public void listAdd(Book p) {
        DLNode newNode = new DLNode(p);
        if (head == null) {
            head = newNode;
        } else {
            DLNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setPrev(current);
        }
    }

    public void listRemove(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 0) {
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            }
            return;
        }

        DLNode current = head;
        int index = 0;
        while (current != null && index < pos) {
            current = current.getNext();
            index++;
        }

        if (current == null) {
            return;
        }

        DLNode prevNode = current.getPrev();
        DLNode nextNode = current.getNext();

        if (prevNode != null) {
            prevNode.setNext(nextNode);
        }
        if (nextNode != null) {
            nextNode.setPrev(prevNode);
        }
    }

    public String toString() {
        StringBuilder element = new StringBuilder();
        DLNode current = head;
        while (current != null) {
            element.append(current.getBook().toString()).append("\n");
            current = current.getNext();
        }
        return element.toString();
    }

    public class DLNode {
        private Book book;
        private DLNode next;
        private DLNode prev;

        public DLNode(Book book) {
            this.book = book;
            this.next = null;
            this.prev = null;
        }

        public Book getBook() {
            return book;
        }

        public DLNode getNext() {
            return next;
        }

        public void setNext(DLNode next) {
            this.next = next;
        }

        public DLNode getPrev() {
            return prev;
        }

        public void setPrev(DLNode prev) {
            this.prev = prev;
        }
    }
}
