package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
        col.add("one");
        col.add("two");
        col.add("three");
        int size = col.size();
        Boolean b1=col.contains("four");
        Boolean b2=col.isEmpty();
        col.clear();
        int size2=col.size();
        Boolean b3=col.isEmpty();
        System.out.println("元素个数:"+size);
        System.out.println("是否含有four::"+b1);
        System.out.println("是否不含有元素:"+b2);
        System.out.println("元素个数:"+size);
        System.out.println("是否不含有元素:"+b3);
    }
}
