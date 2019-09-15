package new1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

//����ע�����
@DisplayName("Common annotation test")
public class AnnotationsTest {

    private static Add add;

    @BeforeAll
    public static void beforeAll() {
        add=new Add();
        //�����в��Է�������ǰ����
        System.out.println("Run before all test methods run");
    }

    @BeforeEach
    public void beforeEach() {
        //ÿ�����Է�������ǰ����
        System.out.println("Run before each test method runs");
    }

    @AfterEach
    public void afterEach() {
        //ÿ�����Է���������Ϻ�����
        System.out.println("Run after each test method finishes running");
    }

    @AfterAll
    public static void afterAll() {
        //�����в��Է���������Ϻ�����
        System.out.println("Run after all test methods have finished running");
    }

    @Disabled
    @Test
    @DisplayName("Ignore the test")
    public void disabledTest() {
        //������Բ�������
        System.out.println("This test will not run");
    }

    @Test
    @DisplayName("Test Methods 1+1")
    public void testAdd1() {
        System.out.println("Running test method1+1");
        Assertions.assertEquals(2,add.add(1,1));
    }

    @Test
    @DisplayName("Test Methods 2+2")
    public void testAdd2() {
        System.out.println("Running test method2+2");
        Assertions.assertEquals(4,add.add(2,2));
    }


}
