package lamda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @ClassName PredicateTest
 * @Author qianchao
 * @Date 2021/11/2
 * @Version OPRA V1.0
 **/
public class PredicateTest {
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
                new Employee("张三",2500.00,34),
                new Employee("李四",4500.00,45),
                new Employee("lisi",3500.00,35)
        );
        checkSalary(employees,(em)->em.getSalary()>2600);
    }
    public static void checkSalary(List<Employee> list, Predicate<Employee> p){
        for(Employee e:list){
            //判断 e  是否满足 :e传给em      em->em.getSalary()>2600
            if(p.test(e)){
                System.out.println(e.getName());
            }
        }
    }
}
