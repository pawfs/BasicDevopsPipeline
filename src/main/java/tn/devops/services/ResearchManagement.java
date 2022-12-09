package tn.devops.services;
import tn.devops.entities.Research;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.devops.repository.IResearchRepository;
import java.util.List;
//import java.util.Optional;

@Service
public class ResearchManagement implements IResearchManagement{
    @Autowired
    IResearchRepository repo;
    @Override
    public int addResearch(Research r) {
        repo.save(r);
        return r.getId();
    }

    @Override
    public void deleteResearch(int id) {
        repo.deleteById(id);
    }

    @Override
    public String updateResearchTitle(int id, String title) {
        Research r = repo.findById(id).orElse(null);
        r.setTitle(title);
        repo.save(r);
        return r.getTitle();
    }

    @Override
    public String updateResearchTopic(int id, String topic) {
        Research r = repo.findById(id).orElse(null);
        r.setTopic(topic);
        repo.save(r);
        return r.getTopic();
    }

    @Override
    public Research findResearchId(int id) {
        Research r = repo.findById(id).orElse(null);
        return r;
    }

    @Override
    public List<Research> getListPerson() {
        return null;
    }
}
