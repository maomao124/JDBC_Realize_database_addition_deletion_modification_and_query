import java.util.ArrayList;

/**
 * Project name(项目名称)：JDBC实现数据库的增删改查
 * Package(包名): PACKAGE_NAME
 * Class(类名): sort_test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/14
 * Time(创建时间)： 14:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class sort_test
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        {
            Function function = new Function();
            ArrayList<Student> list = function.sort("no", "desc");

            for (Student student : list)
            {
                System.out.println(student.getNo() + "\t\t" + student.getName() + "\t\t" + student.getSex() + "\t\t" + student.getAge());
            }
        }
        System.out.println();
        System.out.println();
        {
            Function function = new Function();
            ArrayList<Student> list = function.sort("name", "asc");

            for (Student student : list)
            {
                System.out.println(student.getNo() + "\t\t" + student.getName() + "\t\t" + student.getSex() + "\t\t" + student.getAge());
            }
        }
        System.out.println();
        System.out.println();
        {
            Function function = new Function();
            ArrayList<Student> list = function.sort("name", "desc");

            for (Student student : list)
            {
                System.out.println(student.getNo() + "\t\t" + student.getName() + "\t\t" + student.getSex() + "\t\t" + student.getAge());
            }
        }
        System.out.println();
        System.out.println();
        {
            Function function = new Function();
            ArrayList<Student> list = function.sort("sex", "asc");

            for (Student student : list)
            {
                System.out.println(student.getNo() + "\t\t" + student.getName() + "\t\t" + student.getSex() + "\t\t" + student.getAge());
            }
        }

        System.out.println();
        System.out.println();
        {
            Function function = new Function();
            ArrayList<Student> list = function.sort("sex", "desc");

            for (Student student : list)
            {
                System.out.println(student.getNo() + "\t\t" + student.getName() + "\t\t" + student.getSex() + "\t\t" + student.getAge());
            }
        }

        System.out.println();
        System.out.println();
        {
            Function function = new Function();
            ArrayList<Student> list = function.sort("age", "asc");

            for (Student student : list)
            {
                System.out.println(student.getNo() + "\t\t" + student.getName() + "\t\t" + student.getSex() + "\t\t" + student.getAge());
            }
        }

        System.out.println();
        System.out.println();
        {
            Function function = new Function();
            ArrayList<Student> list = function.sort("age", "desc");

            for (Student student : list)
            {
                System.out.println(student.getNo() + "\t\t" + student.getName() + "\t\t" + student.getSex() + "\t\t" + student.getAge());
            }
        }
        System.out.println();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
             double final_runtime;
             final_runtime = (endTime - startTime);
             final_runtime = final_runtime / 1000;
             System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
         }
        else
        {
             double final_runtime;
             final_runtime = (endTime - startTime) / 10000;
             final_runtime = final_runtime / 100000;
             System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
