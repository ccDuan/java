package com.ccduan;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo02 {
    public static void main(String[] args) {
        Student student1 = new Student("张三",15,"123");
        Student student2 = new Student("李四",14,"123");
        Student student3 = new Student("王五",16,"123");
       List<Student> studentList = Arrays.asList(student1,student2,student3);
        List<Student> collect = studentList.stream()
                .filter(Student.p) //把谓语放到Student中
                .collect(Collectors.toList());
        System.out.println(collect);

        //filter 中的是谓词逻辑


    }

}

class Student{

    public static Predicate<Student> p = e -> e.getAge() > 15 && e.getNo().equals("123") ;

    private String name;
    private Integer age;
    private String no;

    public Student(String name, Integer age, String no) {
        this.name = name;
        this.age = age;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", no='" + no + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}