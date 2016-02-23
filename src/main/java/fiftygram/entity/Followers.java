package fiftygram.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;


@Entity
@Table(name = "Followers")
public class Followers {
    @Id
    @GenericGenerator(name = "inc", strategy = "increment")
    @GeneratedValue(generator = "inc")
    private long id;

    @Column(name = "FollowId", nullable = false)
    private long FollowId;

    @Column(name = "FollowerId", nullable = false)
    private long FollowerId;


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


    public Followers(long followId, long followerId) {
        FollowId = followId;
        FollowerId = followerId;
    }

    public Followers() {
        //TO-DO empty constructor
    }
}
