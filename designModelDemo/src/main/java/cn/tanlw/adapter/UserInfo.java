package cn.tanlw.adapter;

/**
 * Created by tanlw on 2017-3-6.
 */
public class UserInfo implements IUserInfo {
    public String getUserName() {
        System.out.println("员工姓名...");
        return null;
    }

    public String getHomeAddress() {
        System.out.println("员工家庭住址...");
        return null;
    }

    public String getOfficeTelNumber() {
        System.out.println("员工的办公电话号码...");
        return null;
    }
}
