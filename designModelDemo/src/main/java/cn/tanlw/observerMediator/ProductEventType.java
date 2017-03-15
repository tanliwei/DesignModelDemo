package cn.tanlw.observerMediator;

/**
 * @author tanlw
 * @version $ID: ProductEventType.java, v 0.1 2016-12-28 0:07
 */
public enum ProductEventType {
    //新建
    NEW_PRODUCT(1),
    //删除
    DEL_PRODUCT(2),
    //修改
    EDIT_PRODUCT(3),
    //克隆
    CLONE_PRODUCT(4);
    private int value = 0;

    private ProductEventType(int _value) {
        this.value = _value;
    }

    public int getValue() {
        return this.value;
    }
}
