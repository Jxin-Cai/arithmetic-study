package 基础数据结构.链表.数据结构.单链表.蔡佳新;

/**
 * 单链表
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/25 17:33
 */
public class OneNode<T> {
    /**参数*/
    private T value;
    /**单链表*/
    private OneNode next;
    /**链表头*/
    private static OneNode HEADER = new OneNode();
    /**链表尾*/
    private static OneNode END;

    public OneNode(T value) {
        if(HEADER.next() == null){
            HEADER.setNext(this);
            END = this;
        }
        this.value = value;
    }

    public OneNode() {
    }

    public OneNode next(){
        return next;
    }
    public void add(T value){
        final OneNode oneNode = new OneNode(value);
        END.setNext(oneNode);
        END = oneNode;
    }

    public T remove(){
        OneNode next = HEADER.next();
        if(next == null){
            return null;
        }
        if(this.equals(END)){
            END = null;
        }
        while (true){
            final OneNode next1 = next.next();
            if (!this.equals(next1)){
                next = next1;
                continue;
            }
            next.setNext(next1.next());
            return (T) next1.value;
        }
    }

    public T reomveEnd(){
        OneNode next = HEADER.next();
        if(next == null){
            return null;
        }

        while (true){
            final OneNode next1 = next.next();
            if (!END.equals(next1)){
                next = next1;
                continue;
            }
            END = next;
            next.setNext(null);
            return (T) next1.value;
        }
    }

    private void setNext(OneNode next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }
}
