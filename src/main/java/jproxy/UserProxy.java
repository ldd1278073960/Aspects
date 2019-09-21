package jproxy;


/**
 * 代理类
 */
public class UserProxy implements IUser {

    private IUser user;


    public UserProxy(IUser user){
        this.user = user;

    }

    @Override
    public void insert() {
        begin();
        System.out.println("增加");
        commit();
    }

    @Override
    public void select() {

    }


    public static void commit(){
        System.out.println("事务提交");
    }

    public static void begin(){
        System.out.println("开启事务");
    }
}
