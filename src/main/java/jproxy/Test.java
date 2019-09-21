package jproxy;

/**
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {

        UserProxy userProxy = new UserProxy(new User());

        userProxy.insert();

    }

}
