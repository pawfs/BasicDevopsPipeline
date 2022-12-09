package tn.devops.services;
import org.springframework.stereotype.Service;
import tn.devops.entities.Teacher;

import java.util.List;

//@Service
public interface ITeacherManagement {
    public int addTeacher(Teacher t);
    public void deleteTeacher(int id);
    public String updateTeacherEmail(int id, String email);
    public String updateTeacherAddress(int id, String address);
    public String updateTeacherName(int id, String name);
    public int updateTeacherAge(int id, int age);
    public Teacher findTeacherId(int id);
    public List<Teacher> getListTeacher();
}


