package new1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        System.out.println("������ʾ����ʱ�䣺");
        // �ַ���ת�����ڸ�ʽ
        DateFormat fdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = fdate.format(new Date());
        System.out.println(str);

        // ���� Calendar ����
        Calendar calendar = Calendar.getInstance();
        // ��ʼ�� Calendar ���󣬵�������Ҫ��������Ҫ����ʱ��
        calendar.setTime(new Date());

        // ��ʾ���
        System.out.println("�꣺ " + calendar.get(Calendar.YEAR));

        // ��ʾ�·� (��0��ʼ, ʵ����ʾҪ��һ)
        System.out.println("�£� " + calendar.get(Calendar.MONTH));


        // ��ǰ������
        System.out.println("���ӣ� " + calendar.get(Calendar.MINUTE));

        // ����ĵ� N ��
        System.out.println("����ĵ� " + calendar.get(Calendar.DAY_OF_YEAR) + "��");

        // ���µ� N ��
        System.out.println("���µĵ� " + calendar.get(Calendar.DAY_OF_MONTH) + "��");

        // 3Сʱ�Ժ�
        calendar.add(Calendar.HOUR_OF_DAY, 3);
        System.out.println("��Сʱ�Ժ��ʱ�䣺 " + calendar.getTime());
        // ��ʽ����ʾ
        str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());
        System.out.println(str);

        // ���� Calendar ��ʾ��ǰʱ��
        calendar.setTime(new Date());
        str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());
        System.out.println(str);

        // ����һ�� Calendar ���ڱȽ�ʱ��
        Calendar calendarNew = Calendar.getInstance();

        // �趨Ϊ 5 Сʱ��ǰ�����ߴ���ʾ -1
        calendarNew.add(Calendar.HOUR, -5);
        System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));

        // �趨7Сʱ�Ժ�ǰ�ߴ���ʾ 1
        calendarNew.add(Calendar.HOUR, +7);
        System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));

        // �˻� 2 Сʱ��ʱ����ͬ����ʾ0
        calendarNew.add(Calendar.HOUR, -2);
        System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));

        // calendarNew����ʱ���
        System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendarNew.getTime()));
        // calendar����ʱ���
        System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime()));
        System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));
    }
}
