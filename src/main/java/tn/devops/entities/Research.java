package tn.devops.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Research implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int researchId;
    private String title;
    private String topic;
    public Research(){
    }
    public Research(String title, String topic) {
        this.title = title;
        this.topic = topic;
    }

    @ManyToOne
    @JoinColumn(name="teacher_id") //: à vérifier
    private Teacher teacher;

    public int getId() {
        return researchId;
    }
    public String getTitle(){
        return title;
    }
    public String getTopic(){
        return topic;
    }
    public void setId(int id) {
        researchId = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setTopic(String topic){
        this.topic = topic;
    }

}
