package fiftygram.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Followers")
public class Followers {

    //fields
    @Id
    @GenericGenerator(name = "inc", strategy = "increment")
    @GeneratedValue(generator = "inc")
    private long id;

    @Column(name = "followId", nullable = false)
    private long followId;

    @Column(name = "followerId", nullable = false)
    private long followerId;

    @Column(name = "date",  columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


    //getters and setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getFollowId() {
        return followId;
    }
    public void setFollowId(long followId) {
        this.followId = followId;
    }

    public long getFollowerId() {
        return followerId;
    }
    public void setFollowerId(long followerId) {
        this.followerId = followerId;
    }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }


    //constructor
    public Followers(long followId, long followerId, Date date) {
        this.followId = followId;
        this.followerId = followerId;
        this.date = date;
    }

    public Followers() {
        //TO-DO empty constructor
    }
}
