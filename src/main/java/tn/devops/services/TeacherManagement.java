package tn.devops.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.devops.repository.ITeacherRepository;
import tn.devops.entities.Teacher;
import java.util.List;
//import java.util.Optional;
@Service
public class TeacherManagement implements ITeacherManagement{
    @Autowired
    ITeacherRepository repo;
    @Override
    public int addTeacher(Teacher t) {
        repo.save(t);
        return t.getId();
    }

    @Override
    public void deleteTeacher(int id) {
        repo.deleteById(id);
    }

    @Override
    public String updateTeacherEmail(int id, String email) {
        Teacher t = repo.findById(id).orElse(null);
        t.setEmail(email);
        repo.save(t);
        return t.getEmail();
    }

    @Override
    public String updateTeacherAddress(int id, String address) {
        Teacher t = repo.findById(id).orElse(null);
        t.setAddress(address);
        repo.save(t);
        return t.getAddress();
    }

    @Override
    public String updateTeacherName(int id, String name) {
        Teacher t = repo.findById(id).orElse(null);
        t.setName(name);
        repo.save(t);
        return t.getName();
    }

    @Override
    public int updateTeacherAge(int id, int age) {
        Teacher t = repo.findById(id).orElse(null);
        t.setAge(age);
        repo.save(t);
        return t.getAge();
    }
    @Override
    public Teacher findTeacherId(int id){
        Teacher t = repo.findById(id).orElse(null);
        return t;
    }
    @Override
    public List<Teacher> getListTeacher() {
        return null;
    }
}
