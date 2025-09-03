package com.guhui.strategy_pattern.operation;

import java.math.BigDecimal;

public interface DiscountStrategy {
    //计算折扣额度：
    BigDecimal getDiscount(BigDecimal total);
}
