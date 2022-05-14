package com.experiment04.service.impl;

import com.experiment04.entity.Student;
import com.experiment04.resource.DatabaseUtils;
import com.experiment04.service.StudentService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentServiceImpl implements StudentService {
    public List<Student> studentList=new ArrayList<Student>();

    public void util() {

        studentList.removeIf(u->{
            return true;
        });
        studentList.add(new Student(201001, Student.Sex.FEMALE, "赵阳阳", 2010));

        studentList.add(new Student(201002, Student.Sex.MALE, "邵鹏", 2010));

        studentList.add(new Student(201103, Student.Sex.MALE, "高学斌", 2011));

        studentList.add(new Student(201104, Student.Sex.MALE, "张扬", 2011));

        studentList.add(new Student(201205, Student.Sex.FEMALE, "吕惠玲", 2012));

        studentList.add(new Student(201206, Student.Sex.MALE, "曾志优", 2012));
    }
    @Override
    public List<Student> addStudent(Student student) {
        studentList.add(student);
        return studentList;
    }

    @Override
    public List<Student> listStudentsByYear(int year) {
        List<Student>studentsYear=new ArrayList<Student>();
        Stream<Student> stream = DatabaseUtils.getStudents().stream();
        Stream<Student>newstream= stream.filter(s->{
            if(s.getYear()==year){
                return true;
            }
            return false;
        });
        studentsYear=newstream.collect(Collectors.toList());
        return studentsYear;
    }

    @Override
    public List<String> listStudentsNames(int year, Student.Sex sex) {
        List <String>yearSearchList=new ArrayList<String>();
        studentList.forEach(u->{
            if(u.getYear()==year && u.getSex()==sex)
            {
                yearSearchList.add(u.getName());
            }
        });
        return yearSearchList;

    }

    @Override
    public Map<Student.Sex, List<Student>> mapStudentsBySex() {
        Map<Student.Sex,List<Student>> map=new HashMap<>();
        map.put(Student.Sex.MALE,new ArrayList<Student>());
        map.put(Student.Sex.FEMALE,new ArrayList<Student>());
        studentList.forEach(u->{
            if(u.getSex()== Student.Sex.MALE){
                map.get(Student.Sex.MALE).add(u);
            }
            if(u.getSex()== Student.Sex.FEMALE){
                map.get(Student.Sex.FEMALE).add(u);
            }
        });

        return map;
    }

    @Override
    public boolean removeStudent(int id) {
        return DatabaseUtils.getStudents().removeIf(s->s.getId()==id);

    }

}
