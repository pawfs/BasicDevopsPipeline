package tn.devops.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.devops.entities.Research;

@Repository
public interface IResearchRepository extends CrudRepository<Research,Integer>{
}
