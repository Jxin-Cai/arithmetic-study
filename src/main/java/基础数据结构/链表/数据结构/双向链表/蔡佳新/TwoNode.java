package 基础数据结构.链表.数据结构.双向链表.蔡佳新;

/**
 * 双向链表
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/25 19:06
 */
public class TwoNode<T> {
    /**参数*/
    private T value;
    /**下一个链表*/
    private TwoNode next;
    /**上一个链表*/
    private TwoNode pre;
    /**链表头*/
    private static TwoNode HEADER = new TwoNode();
    /**链表尾*/
    private static TwoNode END;

    public TwoNode(T value) {
        if(HEADER.next() == null){
            HEADER.setNext(this);
            this.setPre(HEADER);
            END = this;
        }
        this.value = value;
    }

    public TwoNode() {
    }

    public TwoNode next(){
        return next;
    }
    public void add(T value){
        final TwoNode twoNode = new TwoNode(value);
        END.setNext(twoNode);
        twoNode.setPre(END);
        END = twoNode;
    }

    public T remove(){
        final TwoNode pre = this.pre();
        final TwoNode next = this.next();
        if(this.equals(END)){
            END = pre;
        }
        pre.setNext(next);
        if(next != null){
            next.setPre(pre);
        }
        return this.value;
    }

    public T reomveEnd(){
        final TwoNode pre = END.pre();
        pre.setNext(null);
        if(!HEADER.equals(pre)){
            END = pre;
        }
        return (T) END.value;
    }

    private void setNext(TwoNode next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public TwoNode pre() {
        return pre;
    }

    public TwoNode getPre() {
        return pre;
    }

    public void setPre(TwoNode pre) {
        this.pre = pre;
    }
}
