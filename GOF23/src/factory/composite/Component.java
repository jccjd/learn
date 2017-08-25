package factory.composite;
/**FF
 *
 * */

public interface Component {
    void operation();
}
/*叶子组件*/
interface Leaf extends Component {

}
/*容器组件*/
interface Composite extends Component {
    void add(Component component);
    void remove(Component component);
    Component getChild(int index);
}
