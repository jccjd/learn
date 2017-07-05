package Collection;

/**
 * Created by lenovo on 2017/7/4.
 */
public class Linkedlist {
    private Node first;
    private Node last;

    private int size;

    public void add (Object obj) {
        Node node = new Node();
        if (first == null) {
            node.setPrevious(null);
            node.setObj(obj);
            node.setNext(null);
            first = node;
            last = node;
        } else {
            node.setPrevious(last);
            node.setObj(obj);
            node.setNext(null);
            last.setNext(node);

            last = node;

        }
        size++;
    }

    public void remove(int index) {
        rangeChack(index);
        Node temp = node(index);
        if (temp != null) {
            Node up = temp.Previous;
            Node down = temp.next;
            up.next = down;
            down.Previous = up;
            size--;
        }

    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        rangeChack(index);
        Node temp = node(index);
        if (temp != null) {
            return temp.obj;
        }
        return null;
    }

    public Node node(int index) {
        //優化節點
        Node temp = null;
        if (first != null) {
            if (index <(size>>1)) {
                temp = first;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
            } else {
                temp = last;
                for (int i = size - 1; i > index; i--) {
                    temp = temp.Previous;
                }
            }
        }
        return temp;
    }

    private void rangeChack(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void add(int index, Object obj) {
        Node temp = node(index);
        Node newnode = new Node();
        newnode.obj = obj;
        if (temp != null) {
            Node up = temp.Previous;
            up.next = newnode;
            newnode.Previous = up;
            newnode.next = temp;
            temp.Previous = newnode;
            size++;
        }
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.add("qq");
        list.add("qq");
        list.add("ww");
        list.remove(1);
        list.add(1,123);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+""+list.size);
        }
    }
}
