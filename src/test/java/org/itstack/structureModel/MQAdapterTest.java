package org.itstack.structureModel;

import com.alibaba.fastjson2.JSON;
import org.itstack.structureModel.adaptor.MQAdapter;
import org.itstack.structureModel.adaptor.OrderAdapterService;
import org.itstack.structureModel.adaptor.RebateInfo;
import org.itstack.structureModel.adaptor.impl.InsideOrderService;
import org.itstack.structureModel.adaptor.impl.POPOrderAdapterServiceImpl;
import org.itstack.structureModel.adaptor.mq.CreateAccount;
import org.itstack.structureModel.adaptor.mq.OrderMq;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;

public class MQAdapterTest {
    @Test
    public void test_MQAdapter() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        CreateAccount create_account = new CreateAccount();
        create_account.setNumber("100001");
        create_account.setAddress("shanghai,pudong");
        create_account.setAccountDate(new Date());
        create_account.setDesc("school open an account");
        HashMap<String, String> link01 = new HashMap<>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MQAdapter.filter(create_account.toString(), link01);
        System.out.println("mq.create_account(before adaptor)" + create_account);
        System.out.println("mq.create_account(After adaptor)" + JSON.toJSONString(rebateInfo01));
        System.out.println("");
        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(new Date());
        HashMap<String, String> link02 = new HashMap<>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RebateInfo rebateInfo02 = MQAdapter.filter(orderMq.toString(), link02);
        System.out.println("mq.orderMq(before adaptor)" + orderMq);
        System.out.println("mq.orderMq(After adaptor)" + JSON.toJSONString(rebateInfo02));
    }

    @Test
    public void test_itfAdapter() {
        OrderAdapterService popOrderAdapterService = new
                POPOrderAdapterServiceImpl();
        System.out.println("judge if it is first order (Adaptor POP)" +
                popOrderAdapterService.isFirst("100001"));
        OrderAdapterService insideOrderService = new InsideOrderService();
        System.out.println("judge if it is first order (Adaptor self-merchant)" +
                insideOrderService.isFirst("100001"));
    }
}
