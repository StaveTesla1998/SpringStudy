package com.qiji.pojo;

import java.util.Arrays;
import java.util.Map;

public class Student {
    private Integer stuId;
    private String stuName;

    private Integer age;
    private String sex;
    private Clazz clazz;

    private String[] hobby;

    private Map<String,Teacher> teacherMap;

    public Student() {
    }

    public Student(Integer stuId, String stuName, Integer age, String sex, Clazz clazz, String[] hobby) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.age = age;
        this.sex = sex;
        this.clazz = clazz;
        this.hobby = hobby;
    }

    public Student(Integer stuId, String stuName, Integer age, String sex, Clazz clazz, String[] hobby, Map<String, Teacher> teacherMap) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.age = age;
        this.sex = sex;
        this.clazz = clazz;
        this.hobby = hobby;
        this.teacherMap = teacherMap;
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

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", clazz=" + clazz +
                ", hobby=" + Arrays.toString(hobby) +
                ", teacherMap=" + teacherMap +
                '}';
    }

    public void seyHello(){
        System.out.println("hello spring");
    }
}
