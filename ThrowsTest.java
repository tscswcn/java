package new1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest {

    public static void main(String[] args) throws FileNotFoundException {
        //�ɷ����ĵ����߲����쳣���߼��������׳�
        throwsTest();

    }

    public static void throwsTest() throws FileNotFoundException {
        new FileInputStream("////d:home/project/1.file");
    }
}
