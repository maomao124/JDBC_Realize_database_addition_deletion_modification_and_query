import java.util.ArrayList;

/**
 * Project name(项目名称)：JDBC实现数据库的增删改查
 * Package(包名): PACKAGE_NAME
 * Interface(接口名): Function_interface
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/14
 * Time(创建时间)： 13:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface Function_interface
{
    //查询所有学生
    public ArrayList<Student> find();

    //按学生id查找学生
    public Student findById(Integer no);

    //添加学生
    public int insert(Student student);

    //修改学生信息
    public int update(Student student);

    //修改学生信息，包括学号
    public int update(Student student, int old_no);

    //删除学生信息
    public int delete(Integer no);

    //排序
    public ArrayList<Student> sort(String column, String asc_or_desc);
}
