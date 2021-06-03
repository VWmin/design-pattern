package decorator;

import decorator.concretecomponent.Espresso;
import decorator.decorator.Mocha;
import decorator.decorator.Soy;
import decorator.decorator.Whip;

public class Test {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage);

        //添加装饰
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage);

//        String path = Objects.requireNonNull(beverage.getClass().getClassLoader().getResource(".")).getPath() + "/";
//        int c;
//        try{
//            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(path+"input.txt")));
//            while((c = in.read()) >= 0){
//                System.out.print((char) c);
//            }
//            in.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }


    }
}
