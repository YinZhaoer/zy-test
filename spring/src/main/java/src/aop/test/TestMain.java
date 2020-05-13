package src.aop.test;

/**
 * @author: ZhaoYin@corp.netease.com
 * @version: 2020/5/13
 * @description:
 */
public class TestMain {
    public static void main(String[] args) {
        SubjectProxy proxy = new SubjectProxy(new RealSubject());
        Subject subject = proxy.getSubject();
        int result = subject.request("hahahaha");
        System.out.println(result);
    }
}
