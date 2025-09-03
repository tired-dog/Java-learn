package com.guhui.strategy_pattern.context;

import com.guhui.strategy_pattern.operation.Strategy;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.strategy
 * Author: GuHui
 * CreateTime: 2025-09-03 11:30
 * Version: 1.0
 **/
public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperate(num1, num2);
    }
}