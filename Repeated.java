package new1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;


class Repeated {

    //�Զ����ظ����Ե���ʾ����
    @RepeatedTest(value=10,name="{displayName}-->{currentRepetition}/{totalRepetitions}")
    @DisplayName("repeatTest")
    void repeatedTest(TestInfo testInfo,RepetitionInfo repetitionInfo) {
        //���ǿ���ͨ��TestInfo�ڲ����л�ȡ���Ե������Ϣ����������Զ���Ĳ�����
        System.out.println(testInfo.getDisplayName());
        //�����ǰ�ظ�����
        System.out.println("currentRepetition:"+repetitionInfo.getCurrentRepetition());

    }

}
