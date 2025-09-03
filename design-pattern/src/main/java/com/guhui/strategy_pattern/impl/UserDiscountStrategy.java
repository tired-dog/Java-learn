package com.guhui.strategy_pattern.impl;

import com.guhui.strategy_pattern.operation.DiscountStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.strategy.impl
 * Author: GuHui
 * CreateTime: 2025-09-03 13:56
 * Version: 1.0
 **/
public class UserDiscountStrategy implements DiscountStrategy {
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        //普通会员打九折
        return total.multiply(new BigDecimal("0.1").setScale(2, RoundingMode.DOWN));
    }
}