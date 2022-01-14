package org.fenixsoft.jvm.chapter6;

/**
 * @author ：archer
 * @date ：Created in 2022/1/13 14:54
 * @description：
 */
// javap -verbose TestClass.class 解析字节码文件
public class TestClass {
    private int m;

    public int incr() {
        return m + 1;
    }
}
