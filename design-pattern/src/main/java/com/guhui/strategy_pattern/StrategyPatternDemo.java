package com.guhui.strategy_pattern;

import com.guhui.strategy_pattern.context.Context;
import com.guhui.strategy_pattern.context.DiscountContext;
import com.guhui.strategy_pattern.impl.OperationAdd;
import com.guhui.strategy_pattern.impl.OperationMultiply;
import com.guhui.strategy_pattern.impl.OperationSubtract;
import com.guhui.strategy_pattern.impl.OverDiscountStrategy;

import java.math.BigDecimal;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: PACKAGE_NAME
 * Author: GuHui
 * CreateTime: 2025-09-03 13:34
 * Version: 1.0
 * 策略模式:当一个系统中有许多类，它们之间的区别仅在于它们的行为时。
 * 定义策略接口：所有策略类都将实现这个统一的接口。
 * 创建具体策略类：每个策略类封装一个具体的算法或行为。
 * 上下文类：包含一个策略对象的引用，并通过该引用调用策略。
 **/
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10+5=" + context.executeStrategy(10, 5));
        context = new Context(new OperationMultiply());
        System.out.println("10*5=" + context.executeStrategy(10, 5));
        context = new Context(new OperationSubtract());
        System.out.println("10-5=" + context.executeStrategy(10, 5));

        //默认使用普通会员折扣:
        DiscountContext ctx = new DiscountContext();
        BigDecimal price1 = ctx.calculatePrice(BigDecimal.valueOf(105));
        System.out.println(price1);
        //使用满减折扣:
        ctx.setStrategy(new OverDiscountStrategy());
        BigDecimal price2 = ctx.calculatePrice(BigDecimal.valueOf(105));
        System.out.println(price2);
    }

}










