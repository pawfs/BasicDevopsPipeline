package tn.devops.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.devops.entities.Research;
import tn.devops.entities.Teacher;

@Repository
public interface ITeacherRepository extends CrudRepository<Teacher,Integer> {
}
