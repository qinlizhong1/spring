package proxy;

public class ProxyTest {
    public static void main(String[] args) {
        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy();
        UserService userServiceJdk = jdkDynamicProxy.getProxyObjct();
        userServiceJdk.doSomething();
        System.out.println();

        CglibDynamicProxy cglibDynamicProxy = new CglibDynamicProxy();
        LoginService loginServiceCglib = cglibDynamicProxy.getProxyObjct();
        loginServiceCglib.doSomething();
    }
}
