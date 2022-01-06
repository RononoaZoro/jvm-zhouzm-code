package org.fenixsoft.jvm.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * jdk9之前
 * -XX:+PrintGC 打印GC日志
 * -XX:+PrintGCDetails
 * JDK 9（包括jdk9）之后使用-X-log：gc*
 *
 * -XX:+参数（如HeapDumpOnOutOfMemoryError）
 *
 * @author zzm
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}

