public class DoubleLinkedList<A> {

    private Node<A> header ;
    private Node<A> trailer ;
    private int size = 0 ;

    public DoubleLinkedList() {
        header = new Node<A>(null,null,null);
        trailer= new Node<A>(null,header,null);
        header.setNext(trailer);
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public A Last()
    {
        if(isEmpty()) return null ;
        return trailer.getPrevious().getElement() ;
    }

    private void Add_Between(A element , Node<A> p , Node<A> n )
    {
        Node<A> new_Node = new Node<A>(element,p,n) ;
        p.setNext(new_Node);
        n.setPrevious(new_Node);
        size++ ;
    }
    public A first()
    {
        if(isEmpty()) return null ;
        return header.getNext().getElement();
    }

    public A last()
    {
        if(isEmpty()) return null ;
        return trailer.getPrevious().getElement();
    }

    public void Add_First(A element){
        Add_Between(element,header,header.getNext());
    }

    public void Add_Last(A element)
    {
        Add_Between(element,trailer.getPrevious(),trailer);
    }

    public int getSize() {
        return size;
    }

    private A Remove(Node<A> x)
    {
        Node<A> p = x.previous ;
        Node<A> n =x.next ;
        p.setNext(n);
        n.setPrevious(p);
        size--;
        return x.getElement();
    }

    public A Remove_First()
    {
        if(isEmpty()) return null ;
        return Remove(header.getNext());
    }

    public A Remove_Last()
    {
        if (isEmpty())
            return null ;
        return Remove(trailer.getPrevious());
    }

    public static class Node<A>
    {
        private A Element ;
        private Node<A>next ;
        private Node<A> previous ;

        public Node(A element, Node<A> previous, Node<A> next) {
            Element = element;
            this.next = next;
            this.previous = previous;
        }

        public A getElement() {
            return Element;
        }

        public void setElement(A element) {
            Element = element;
        }

        public Node<A> getNext() {
            return next;
        }

        public void setNext(Node<A> next) {
            this.next = next;
        }

        public Node<A> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<A> previous) {
            this.previous = previous;
        }
    }
}