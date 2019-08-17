package com.qf.agent;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

public class Attacher {
    public static void main(String[] args) throws AttachNotSupportedException, IOException, AgentLoadException, AgentInitializationException {

        VirtualMachine vm = VirtualMachine.attach("20808"); // 目标 JVM pid  通过jps -l查看
        vm.loadAgent("D:\\github\\agentTest\\target\\agentTest-1.0-SNAPSHOT-jar-with-dependencies.jar");
    }
}