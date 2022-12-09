package tn.devops;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.devops.entities.Research;
import tn.devops.services.ResearchManagement;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Tests {

    @Autowired
    ResearchManagement researchService;

    //@Autowired
    //GroupManagement groupService;

    //@Test
    //void contextLoads() {
    //}

    @Test
    public void addResearchTest(){
        Research r = new Research("Title1", "topic1");
        int researchId= researchService.addResearch(r);
        assertNotNull(researchId);
    }
    //do we test the method in all its forms? if we had a lot of methods with different arguments
    @Test
    public void deleteResearchTest(){
        Research r = new Research("Title1", "topic1");
        int researchId= researchService.addResearch(r);
        researchService.deleteResearch(researchId);
        assertNull(researchService.findResearchId(researchId));
    }

    @Test
    public void updateResearchTopicTest(){
        Research r = new Research("Title1", "topic1");
        int researchId= researchService.addResearch(r);
        String researchTopic= researchService.updateResearchTopic(researchId,"topic2");
        assertEquals(researchTopic,"topic2");
    }

}
