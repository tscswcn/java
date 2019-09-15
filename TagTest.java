package new1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TagTest {

    @Test
    @Tag("tag1")
    void tag1() {
        System.out.println("Tag1 Test");
    }

    @Test
    @Tag("tag2")
    void tag2() {
        System.out.println("Tag2 test");
    }
    

    @Test
    @Tag("tag3")
    void tag3() {
        System.out.println("Tag3 test");
    }


    @Test
    //使用@Disabled注解关闭
    @Disabled
    void disabled1() {
        System.out.println("Not running");
    }

    @Test
    void open() {
        System.out.println("running");
    }
}
