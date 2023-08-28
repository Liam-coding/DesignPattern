package org.itstack.behavioralPattern.templatePattern;

public class HttpClient {
    public static String doGet(String skuUrl){
        if (skuUrl.contains("jingdong")){
            return "jindong";
        }
        if (skuUrl.contains("taobao")){
            return "taobao";
        }
        if (skuUrl.contains("dangdang")){
            return "dangdang";
        }
        return null;
    }
}
