package com.guhui.strategy_pattern.context;

import com.guhui.strategy_pattern.impl.UserDiscountStrategy;
import com.guhui.strategy_pattern.operation.DiscountStrategy;

import java.math.BigDecimal;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.strategy.context
 * Author: GuHui
 * CreateTime: 2025-09-03 13:59
 * Version: 1.0
 **/
public class DiscountContext {
    //1，持有某个策略
    private DiscountStrategy strategy = new UserDiscountStrategy();

    //2，允许客户端设置新策略
    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal calculatePrice(BigDecimal total) {
        return total.subtract(this.strategy.getDiscount(total)).setScale(2);
    }

}