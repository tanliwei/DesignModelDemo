package cn.tanlw.observerMediator;

/**
 * 观察者
 *
 * @author tanlw
 * @version $ID: Observer.java, v 0.1 2016-12-28 0:29
 */
public interface Observer {
    //一发现别人有动静，自己也要行动起来
    public void update(String context);
}
