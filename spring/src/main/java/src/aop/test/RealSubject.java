package src.aop.test;

/**
 * @author: ZhaoYin@corp.netease.com
 * @version: 2020/5/13
 * @description:
 */
public class RealSubject implements Subject{
    @Override
    public int request(String output) {
        System.out.println(output);
        return 10;
    }
}
