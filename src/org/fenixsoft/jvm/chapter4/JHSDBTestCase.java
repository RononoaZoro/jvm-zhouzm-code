package org.fenixsoft.jvm.chapter4;

/** 启动JHSDB工具 D:\developer\Java\jdk1.8.0_231\lib>java -cp .sa-jdi.jar sun.jvm.hotspot.HSDB
 * staticObj、instanceObj、localObj存放在哪里？
 */
public class JHSDBTestCase {
//scanoops 0x0000000004200000 0x0000000004550000 org/fenixsoft/jvm/chapter4/JHSDBTestCase$ObjectHolder
//    revptrs 0x0000000004429980(地址)
    static class Test {
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();

        void foo() {
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");    // 这里设一个断点
        }
    }

    private static class ObjectHolder {}

    public static void main(String[] args) {
        Test test = new JHSDBTestCase.Test();
        test.foo();
    }
}
