package cn.tanlw.observerMediator;

/**
 * @author tanlw
 * @version $ID: ProductManager.java, v 0.1 2016-12-27 18:32
 */
public class ProductManager {
    //是否可以创建一个产品
    private boolean isPermittedCreate = false;

    //创建一个产品
    public Product createProduct(String name) {
        //修改权限,允许创建
        isPermittedCreate = true;
        Product p = new Product(this, name);
        return p;
    }

    //废弃一个产品
    public void abandonProduct(Product p) {
        //销毁一个产品
        p = null;
    }

    //修改一个产品
    public void editProduct(Product p, String name) {
        //修改产品
        p.setName(name);
    }

    //是否可以创建产品
    public boolean isCreateProduct() {
        return isPermittedCreate;
    }

    //克隆一个产品
    public Product clone(Product p) {
        //产生克隆事件
        return p.clone();
    }
}
