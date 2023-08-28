package org.itstack.behavioralPattern.templatePattern;

import java.util.Map;

public abstract class NetMall {
    String uId; // user ID
    String uPwd; // user password
    public NetMall(String uId, String uPwd) {
        this.uId = uId;
        this.uPwd = uPwd;
    }
    /**
     * generate poster
     *
     * @param skuUrl address(jiongdong, taobao)
     * @return poster 64 bit info
     */
    public String generateGoodsPoster(String skuUrl) {
        if (!login(uId, uPwd)) return null; // 1. verify login
        Map<String, String> reptile = reptile(skuUrl); // 2. Reptiles
        return createBase64(reptile); // 3. Assemble the poster
    }
    // mock login
    protected abstract Boolean login(String uId, String uPwd);
    // Reptiles
    protected abstract Map<String, String> reptile(String skuUrl);
    // generate goods info
    protected abstract String createBase64(Map<String, String> goodsInfo);
}
