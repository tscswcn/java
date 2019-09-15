package new1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;


class Repeated {

    //自定义重复测试的显示名称
    @RepeatedTest(value=10,name="{displayName}-->{currentRepetition}/{totalRepetitions}")
    @DisplayName("repeatTest")
    void repeatedTest(TestInfo testInfo,RepetitionInfo repetitionInfo) {
        //我们可以通过TestInfo在测试中获取测试的相关信息，比如输出自定义的测试名
        System.out.println(testInfo.getDisplayName());
        //输出当前重复次数
        System.out.println("currentRepetition:"+repetitionInfo.getCurrentRepetition());

    }

}
