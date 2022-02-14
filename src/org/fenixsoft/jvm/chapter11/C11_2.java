package org.fenixsoft.jvm.chapter11;

/**
 * @author ：archer
 * @date ：Created in 2022/2/14 10:54
 * @description：
 *  参数 -XX:+PrintCompilation 要求虚拟机在即时编译时将被编译成本地代码的方法名称打印出来
 *  参数 -XX:+PrintInlining 要求虚拟机输出方法内联信息(-XX:+UnlockDiagnosticVMOptions -XX:+PrintInlining 配合使用且有顺序要求)
 */
public class C11_2 {
    //jdk 8 main方法循环大于等60416时，才会触发编译优化
    public static final int NUM = 60416;

    public static int doubleValue(int i) {
        // 这个空循环用于后面演示JIT代码优化过程
        for(int j=0; j<100000; j++);
        return i * 2;
    }

    public static long calcSum() {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += doubleValue(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 0; i < NUM; i++) {
            calcSum();
        }
    }
}
