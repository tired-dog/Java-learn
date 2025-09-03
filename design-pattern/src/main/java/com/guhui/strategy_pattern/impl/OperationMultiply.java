package com.guhui.strategy_pattern.impl;

import com.guhui.strategy_pattern.operation.Strategy;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.strategy.impl
 * Author: GuHui
 * CreateTime: 2025-09-03 11:30
 * Version: 1.0
 **/
public class OperationMultiply implements Strategy {
    @Override
    public int doOperate(int num1, int num2) {
        return num1 * num2;
    }
}