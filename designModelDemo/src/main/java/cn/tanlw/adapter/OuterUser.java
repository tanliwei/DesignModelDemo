package cn.tanlw.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tanlw on 2017-3-6.
 */
public class OuterUser implements IOuterUser {
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("username","这个员工叫张小凡...");

        return baseInfoMap;
    }

    public Map getUserOfflineInfo() {
        HashMap userOfflineInfo = new HashMap();
        userOfflineInfo.put("officeTelNumber","员工的办公电话是....");
        return userOfflineInfo;
    }

    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeAddress","员工家庭住址是火星...");
        return homeInfo;
    }
}
