package second;

import first.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Test extends Student{
//    public Test(){
//        System.out.println(super.b);
//    }
    public static void main(String[] args)  throws Exception{
        //Student s1=new Student();
        //Test t=new Test();
        //System.out.println(t.b); //不同包子类可以访问基类的protected属性
        File file=new File("data.txt");
        FileReader in=new FileReader(file);
//        File file=new File("data.txt");
//        try {
//            FileReader in=new FileReader(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//               int a = 20;
//               int b = 0;
//               int result = myDiv(a, b);
//               System.out.println(a + "/" + b + "=" + result);
//           }catch (IllegalArgumentException e){
//               System.out.println(e.getMessage());
//           }catch (ArrayIndexOutOfBoundsException e){
//               System.out.println(e.getMessage());
//           }finally {
//               System.out.println("程序正常结束bye bye");
//           }
//        }
    /**
     * 计算a和b的除法，在函数里对除数进行处理
     * @param a
     * @param b
     * @return
     */
//    public static int myDiv(int a,int b){
//        if(b==0){
//            throw new IllegalArgumentException("除数不能为0");  //参数不正确的异常名IllegalArgumentException
//        }
//        return a/b;
   }
}
