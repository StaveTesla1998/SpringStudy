package com.qiji.pojo;

public class Student {
    private Integer stuId;
    private String stuName;

    private Integer age;
    private String sex;

    public Student() {
    }

    public Student(Integer stuId, String stuName, Integer age, String sex) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.age = age;
        this.sex = sex;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void seyHello(){
        System.out.println("hello spring");
    }
}
