package new1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

	public List<String> getHeadNumber() {
        List<String> list = new ArrayList<String>(); 
        // ������Ʊ��ǰ��κ��뼯��
        String lotteryNumber = "";
        for (int i = 1; i < 36; i++) { 
            // ���ѭ����Ϊ�˳�ʼ����Ʊ��ǰ��κ��뼯��

            if (i < 10) {
                list.add("0" + i + "  ");
                // �ڼ��������0~9�ĺ��룬��Ϊ�Ǹ�λ����Ϊ����ʾ�ϸ������Ի���������Ҫ��ʮλ�ĵط���ӡ�0��
            } else {
                list.add("" + i + "  ");
                // �򼯺���Ӵ���9�ĺ��룬�����˫λ��
            }
        }

        int roundIndex = 0;
        // ��������ʼ�������

        List<String> lotteryList = new ArrayList<String>(); 
        // ����ǰ�κ����List����

        for (int j = 0; j < 5; j++) {
            int amount = list.size(); // ��ȡǰ��κ���ĸ���
            Random r = new Random(); // ������ʵ����Random�Ķ���
            roundIndex = r.nextInt(amount); // ��ȡһ��0��amount-1�������
            lotteryNumber = list.get(roundIndex); // ��ȡ��Ʊ���֣���ҡ�ŵĺ���
            lotteryList.add(lotteryNumber); // ����Ʊ�������lotteryList��
            list.remove(roundIndex); // �Ƴ��ող����ĺ���
        }
        Collections.sort(lotteryList); 
        // ��ǰ��κ���������������Ŀ����Ϊ���ý�����߿ɶ���
        return lotteryList;
        //����ǰ��κ���
    }

	public List<String> getRearNumber() {
        List<String> list = new ArrayList<String>(); 
        // �������κ��뼯�ϣ�Ҳ������������������

        String lotteryNumber = "";
        for (int i = 1; i < 13; i++) { 
            // ��ʼ�����κ��뼯��

            if (i < 10) {
                list.add("0" + i + "  ");
                // ���0~9�ĺ��룬ԭ��ͬǰ���
            } else {
                list.add("" + i + "  ");
                // ��Ӵ���9�ĺ���
            }
        }
        int roundIndex = 0;
        //��������ʼ�������

        List<String> lotteryList = new ArrayList<String>(); 
        // ������κ����List����

        for (int j = 0; j < 2; j++) {
            int amount = list.size(); // ��ȡ���κ���ĸ���
            Random r = new Random(); // ������ʵ����Random�Ķ���
            roundIndex = r.nextInt(amount); // ��ȡһ��0��amount-1�������
            lotteryNumber = list.get(roundIndex); // ҡ��
            lotteryList.add(lotteryNumber); // ����Ʊ�������lotteryList��
            list.remove(roundIndex); // �Ƴ��ող����ĺ���
        }

        Collections.sort(lotteryList); 
        // �Ժ��κ����������
        return lotteryList;
    }

	public void generateLottery(String groupNum) {

        int groupNumber = 0;
        //Ϊ�˱��ⲻ��Ҫ�Ĵ���һ���ڴ�������ʱ��ҪΪ�丳��ʼֵ

        groupNumber = Integer.parseInt(groupNum);
        StringBuilder sbuiler = new StringBuilder();
        // �����ַ�������������ʹ���ַ����������ܹ���Ϊ��������ַ�����׷������

        for (int i = 0; i < groupNumber; i++) {
            List<String> startList = getHeadNumber();
            // ��ò�Ʊǰ��κ���ļ���

            List<String> endList = getRearNumber();
            // ��ò�Ʊ���κ���ļ���

            for (int m = 0; m < startList.size(); m++) {
                sbuiler.append(startList.get(m));
                // append()��Ϊ׷�ӷ�����������Ӳ�Ʊ��ǰ��κ��뵽�ַ�����������
            }
            sbuiler.append("    ");
            for (int n = 0; n < endList.size(); n++) {
                sbuiler.append(endList.get(n));
                // ��Ӳ�Ʊ�ĺ��κ��뵽�ַ�����������
            }
            sbuiler.append("\n");
        }

        System.out.println(sbuiler.toString());
        //��ÿ�����ɺõĲ�Ʊ���뼴ʱ���
    }
	
}
