package tn.devops.services;
import org.springframework.stereotype.Service;
import tn.devops.entities.Research;
import java.util.List;

public interface IResearchManagement {
    public int addResearch (Research r);
    public void deleteResearch(int id);
    //id topic title
    public String updateResearchTitle(int id, String title);
    public String updateResearchTopic(int id, String topic);
    public Research findResearchId(int id);
    public List<Research> getListPerson();
}
