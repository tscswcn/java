package new1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

	public List<String> getHeadNumber() {
        List<String> list = new ArrayList<String>(); 
        // 创建彩票的前半段号码集合
        String lotteryNumber = "";
        for (int i = 1; i < 36; i++) { 
            // 这个循环是为了初始化彩票的前半段号码集合

            if (i < 10) {
                list.add("0" + i + "  ");
                // 在集合中添加0~9的号码，因为是个位数，为了显示上更加人性化，所以需要在十位的地方添加“0”
            } else {
                list.add("" + i + "  ");
                // 向集合添加大于9的号码，即添加双位数
            }
        }

        int roundIndex = 0;
        // 创建并初始化随机数

        List<String> lotteryList = new ArrayList<String>(); 
        // 保存前段号码的List集合

        for (int j = 0; j < 5; j++) {
            int amount = list.size(); // 获取前半段号码的个数
            Random r = new Random(); // 创建并实例化Random的对象
            roundIndex = r.nextInt(amount); // 获取一个0到amount-1的随机数
            lotteryNumber = list.get(roundIndex); // 获取彩票数字，即摇号的号码
            lotteryList.add(lotteryNumber); // 将彩票号码添加lotteryList中
            list.remove(roundIndex); // 移除刚刚产生的号码
        }
        Collections.sort(lotteryList); 
        // 对前半段号码进行排序，排序的目的是为了让结果更具可读性
        return lotteryList;
        //返回前半段号码
    }

	public List<String> getRearNumber() {
        List<String> list = new ArrayList<String>(); 
        // 创建后半段号码集合，也就是最后两个球的数字

        String lotteryNumber = "";
        for (int i = 1; i < 13; i++) { 
            // 初始化后半段号码集合

            if (i < 10) {
                list.add("0" + i + "  ");
                // 添加0~9的号码，原理同前半段
            } else {
                list.add("" + i + "  ");
                // 添加大于9的号码
            }
        }
        int roundIndex = 0;
        //创建并初始化随机数

        List<String> lotteryList = new ArrayList<String>(); 
        // 保存后半段号码的List集合

        for (int j = 0; j < 2; j++) {
            int amount = list.size(); // 获取后半段号码的个数
            Random r = new Random(); // 创建并实例化Random的对象
            roundIndex = r.nextInt(amount); // 获取一个0到amount-1的随机数
            lotteryNumber = list.get(roundIndex); // 摇号
            lotteryList.add(lotteryNumber); // 将彩票号码添加lotteryList中
            list.remove(roundIndex); // 移除刚刚产生的号码
        }

        Collections.sort(lotteryList); 
        // 对后半段号码进行排序
        return lotteryList;
    }

	public void generateLottery(String groupNum) {

        int groupNumber = 0;
        //为了避免不必要的错误，一般在创建变量时都要为其赋初始值

        groupNumber = Integer.parseInt(groupNum);
        StringBuilder sbuiler = new StringBuilder();
        // 创建字符串生成器对象，使用字符串生成器能够较为方便地在字符串中追加内容

        for (int i = 0; i < groupNumber; i++) {
            List<String> startList = getHeadNumber();
            // 获得彩票前半段号码的集合

            List<String> endList = getRearNumber();
            // 获得彩票后半段号码的集合

            for (int m = 0; m < startList.size(); m++) {
                sbuiler.append(startList.get(m));
                // append()即为追加方法，用于添加彩票的前半段号码到字符串生成器中
            }
            sbuiler.append("    ");
            for (int n = 0; n < endList.size(); n++) {
                sbuiler.append(endList.get(n));
                // 添加彩票的后半段号码到字符串生成器中
            }
            sbuiler.append("\n");
        }

        System.out.println(sbuiler.toString());
        //将每组生成好的彩票号码即时输出
    }
	
}
