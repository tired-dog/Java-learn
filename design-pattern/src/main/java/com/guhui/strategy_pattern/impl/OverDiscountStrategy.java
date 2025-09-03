package com.guhui.strategy_pattern.impl;

import com.guhui.strategy_pattern.operation.DiscountStrategy;

import java.math.BigDecimal;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.strategy.impl
 * Author: GuHui
 * CreateTime: 2025-09-03 13:58
 * Version: 1.0
 **/
public class OverDiscountStrategy implements DiscountStrategy {
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        //满100减20优惠
        return total.compareTo(BigDecimal.valueOf(100)) >= 0 ? BigDecimal.valueOf(20) : BigDecimal.ZERO;
    }
}