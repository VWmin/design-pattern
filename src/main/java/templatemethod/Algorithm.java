package templatemethod;

/**
 * @author vwmin
 * @version 1.0
 * @date 2021/6/3 16:18
 */
abstract class Algorithm {
    final void run(){
        step1();
        step2();
        step3();
    }



    // 这是算法中必须的步骤
    abstract void step3();

    // 这是一个hook函数，是算法中可选的部分，子类可以选择覆盖该函数，添加额外的动作，或是对算法的流程进行控制
    void step2() {
        // somethings
    }

    abstract void step1();


}
