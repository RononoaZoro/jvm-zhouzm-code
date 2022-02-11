package org.fenixsoft.jvm.chapter10;

/**
 * @author ：archer
 * @date ：Created in 2022/2/11 13:50
 * @description：
 */
public class BADLY_NAMED_CODE {
    enum colors {
        red, blue, green;
    }
    static final int _FORTY_TWO = 42;
    public static int NOT_A_CONSTANT = _FORTY_TWO;
    protected void BADLY_NAMED_CODE() {
        return;
    }
    public void NOTcamelCASEmethodNAME() {
        return;
    }

}
