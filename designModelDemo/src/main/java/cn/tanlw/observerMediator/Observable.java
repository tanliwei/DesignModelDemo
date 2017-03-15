package cn.tanlw.observerMediator;

/**
 * 被观察者接口
 * @author tanlw
 * @version $ID: Observable.java, v 0.1 2016-12-28 0:12
 */
public interface Observable {
    //增加一个观察者
    public void addObservable(Observable observable);
    //删除一个观察者
    public void deleteObservable(Observable observable);
    //通知观察者
    public void notifyObservable(String context);
}
