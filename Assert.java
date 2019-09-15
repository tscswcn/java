package new1;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class Assert {
	@Test
    void standardAssertions() {
        assertEquals(2, 2);
        assertEquals(4, 4, "������Ϣ");
        assertTrue(2 == 2, () -> "������Ϣ");
    }

    @Test
    void groupedAssertions() {
        //������ԣ�ִ�з��������ж��ԣ��������κ�һ�����Դ��󶼻�һ�𱨸�
        assertAll("person",
            () -> assertEquals("John", "John"),
            () -> assertEquals("Doe", "Doe")
        );
    }

    @Test
    void dependentAssertions() {
        //�������
        assertAll("properties",
            () -> {
            	// �ڴ�����У��������ʧ�ܣ�����Ĵ��뽫��������
                String firstName = "John";
                assertNotNull(firstName);
                // ֻ��ǰһ������ͨ���Ż�����
                assertAll("first name",
                    () -> assertTrue(firstName.startsWith("J")),
                    () -> assertTrue(firstName.endsWith("n"))
                );
            },
            () -> {
                // ������ԣ������ܵ�first Name������Ӱ�죬���Լ�ʹ����Ķ���ִ��ʧ�ܣ���������ɻ�ִ��
                String lastName = "Doe";
                assertNotNull(lastName);

                // ֻ��ǰһ������ͨ���Ż�����
                assertAll("last name",
                    () -> assertTrue(lastName.startsWith("D")),
                    () -> assertTrue(lastName.endsWith("e"))
                );
            }
        );
    }

    @Test
    void exceptionTesting() {
    	//�����쳣���׳�ָ�����쳣�����ԲŻ�ͨ��
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("a message");
        });
        assertEquals("a message", exception.getMessage());
    }

    @Test
    void timeoutNotExceeded() {
        // ���Գ�ʱ
        assertTimeout(ofMinutes(2), () -> {
            // �������С��2����ʱ������ͨ����
        });
    }

    @Test
    void timeoutNotExceededWithResult() {
        // ���Գɹ������ؽ��
        String actualResult = assertTimeout(ofMinutes(2), () -> {
            return "result";
        });
        assertEquals("result", actualResult);
    }

   

    @Test
    void timeoutExceeded() {
        // ���Գ�ʱ����������ִ����Ϻ�ŷ��أ�Ҳ����1000����󷵻ؽ��
        assertTimeout(ofMillis(10), () -> {
            // ִ�����񻨷�ʱ��1000����
            Thread.sleep(1000);
        });
    }


    @Test
    void timeoutExceededWithPreemptiveTermination() {
        // ���Գ�ʱ�������10����������û��ִ����ϣ����������ض���ʧ�ܣ�����ȵ�1000�����
        assertTimeoutPreemptively(ofMillis(10), () -> {
           
            Thread.sleep(1000);
        });
    }

}
