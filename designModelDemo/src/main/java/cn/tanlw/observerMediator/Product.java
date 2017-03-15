package cn.tanlw.observerMediator;

/**
 * @author tanlw
 * @version $ID: Product.java, v 0.1 2016-12-27 18:31
 */
public class Product implements Cloneable {
    private String name;
    //是否可以属性变更
    private boolean canChanged = false;

    //生成一个新产品
    public Product(ProductManager manager, String name) {
        //允许建立产品
        if(manager.isCreateProduct()){
            canChanged = true;
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //复写clone方法
    public Product clone(){
        Product p = null;
            try {
                p = (Product) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        return p;
    }
}
