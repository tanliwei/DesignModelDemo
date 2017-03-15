package cn.tanlw.adapter;

/**
 * Created by tanlw on 2017-3-6.
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
        youngGirl.getHomeAddress();

        IUserInfo youngGirl2 = new OuterUserInfo();
        youngGirl2.getHomeAddress();
    }
}
