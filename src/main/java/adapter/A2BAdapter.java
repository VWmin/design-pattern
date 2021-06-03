package adapter;

/**
 * 客户使用该适配器去执行一些像是B的行为，但不知道其实是A装的
 * @author vwmin
 * @version 1.0
 * @date 2021/6/3 15:30
 */
public class A2BAdapter implements InterfaceB{
    // B是适配到的目标

    // 这里A是被适配者
    private InterfaceA insideA;

    @Override
    public void someActionOfB() {
        // maybe do something more.
        insideA.someActionOfA();
    }
}
