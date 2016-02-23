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

    @Column(name = "FollowId", nullable = false)
    private long FollowId;

    @Column(name = "FollowerId", nullable = false)
    private long FollowerId;

    @Column(name = "Date",  columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date Date;


    //getters and setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getFollowId() {
        return FollowId;
    }
    public void setFollowId(long followId) {
        FollowId = followId;
    }

    public long getFollowerId() {
        return FollowerId;
    }
    public void setFollowerId(long followerId) {
        FollowerId = followerId;
    }

    public Date getDate() { return Date; }
    public void setDate(Date date) { Date = date; }


    //constructor
    public Followers(long followId, long followerId, Date date) {
        FollowId = followId;
        FollowerId = followerId;
        Date = date;
    }

    public Followers() {
        //TO-DO empty constructor
    }
}
