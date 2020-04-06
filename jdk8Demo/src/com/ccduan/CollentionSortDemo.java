package com.ccduan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CollentionSortDemo {

    public static void main(String[] args) {
        //集合排序
        Student student1 = new Student("张三",15,"dda");
        Student student2 = new Student("李四",14,"gffg");
        Student student3 = new Student("王五",16,"rtr");
        List<Student> studentList = Arrays.asList(student1,student2,student3);
        //按长度排序
        studentList.sort(
                Comparator.comparingInt(Student::getAge)
                .reversed()//倒叙
                .thenComparing(Student::getNo)
                .reversed()//最后这个对连个条件都生效
        );
studentList.forEach(System.out::println);

//都是正序，不加
        //都是倒叙，最后一个加.reversed()
        //先是倒叙（加reserved），然后正序
        //先是正序（加reserved）,然后倒叙（加reserved）

    }
    
}
