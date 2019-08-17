package com.qf.agent;

import java.lang.instrument.Instrumentation;

public class TestAgent {
    public static void agentmain(String args, Instrumentation inst) {
        inst.addTransformer(new TestTransformer(), true);
        try {
            inst.retransformClasses(TransformTarget.class);
            System.out.println("探针加载完成.");
        } catch (Exception e) {
            System.out.println("探针加载失败!");
        }
    }
}