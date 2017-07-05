package Collection;

/**
 * Created by lenovo on 2017/7/4.
 */
public class Node {
     Node Previous;
     Object obj;
     Node next;

    public Node (Node Previous, Object obj, Node next) {
        super();
        this.next = next;
        this.Previous = Previous;
        this.obj = obj;
    }
    public Node () {

    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getObj() {

        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getPrevious() {

        return Previous;
    }

    public void setPrevious(Node previous) {
        Previous = previous;
    }
}
