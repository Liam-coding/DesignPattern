package org.itstack.behavioralPattern.templatePattern.group;

import com.alibaba.fastjson2.JSON;
import org.itstack.behavioralPattern.templatePattern.HttpClient;
import org.itstack.behavioralPattern.templatePattern.NetMall;

import java.util.Base64;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JDNetMall extends NetMall {
    public JDNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    protected Boolean login(String uId, String uPwd) {
        System.out.println("jindong login...uid"+uId+" upwd"+uPwd);
        return true;
    }

    @Override
    protected Map<String, String> reptile(String skuUrl) {
        String str = HttpClient.doGet(skuUrl);
        Pattern p9 = Pattern.compile("(?<=title\\>).*(?=</title)");
        Matcher m9 = p9.matcher(str);
        Map<String, String> map = new ConcurrentHashMap<String, String>();
        if (m9.find()) {
            map.put("name", m9.group());
        }
        map.put("price", "5999.00");
        System.out.println("jindong reptile analyzing, price"+map.get("name")+",price:"+map.get("price"));
        return map;
    }

    @Override
    protected String createBase64(Map<String, String> goodsInfo) {
        byte[] encodedBytes = Base64.getEncoder().encode(JSON.toJSONString(goodsInfo).getBytes());
        System.out.println("mock jindong generate base64 poster");
        return encodedBytes.toString();
    }
}
