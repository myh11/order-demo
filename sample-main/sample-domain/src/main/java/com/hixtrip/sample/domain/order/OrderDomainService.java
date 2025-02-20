package com.hixtrip.sample.domain.order;

import com.hixtrip.sample.domain.order.model.Order;
import com.hixtrip.sample.domain.pay.model.CommandPay;
import org.springframework.stereotype.Component;

/**
 * 订单领域服务
 * todo 只需要实现创建订单即可
 * @Auther:MingYhua
 * @date:2024-04-12
 * 订单相关实现逻辑、方案在Resource目录下
 */

@Component
public class OrderDomainService {


    /**
     * todo 需要实现
     * 创建待付款订单
     */
    public void createOrder(Order order) throws Exception {
        //需要你在infra实现, 自行定义出入参
    }

    /**
     * todo 需要实现interceptor
     * 待付款订单支付成功
     */
    public void orderPaySuccess(CommandPay commandPay) {
        //需要你在infra实现, 自行定义出入参
    }

    /**
     * todo 需要实现
     * 待付款订单支付失败
     */
    public void orderPayFail(CommandPay commandPay) {
        //需要你在infra实现, 自行定义出入参
    }
}
