package cn.tanlw.adapter;

import java.util.Map;

/**
 * Created by tanlw on 2017-3-6.
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseinfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfflineInfo();

    public String getUserName() {
        String userName = (String) baseinfo.get("username");
        System.out.println(userName);
        return userName;
    }

    public String getHomeAddress() {
        String homeAddress = (String) homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    public String getOfficeTelNumber() {
        String officeTelNumber = (String) officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }
}
