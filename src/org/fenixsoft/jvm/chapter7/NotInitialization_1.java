package org.fenixsoft.jvm.chapter7;

/**
 * 非主动使用类字段演示
 * -XX:+TraceClassLoading 查看类加载情况
 * 子类有加载，但无初始化
 **/
public class NotInitialization_1 {

    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }

}
