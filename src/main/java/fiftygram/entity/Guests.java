package fiftygram.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Guests")
public class Guests {

    //fields
    @Id
    @GenericGenerator(name = "inc", strategy = "increment")
    @GeneratedValue(generator = "inc")
    private long id;

    @Column(name = "userId", nullable = false)
    private long userId;

    @Column(name = "partyId", nullable = false)
    private long partyId;

    @Column(name = "date",  columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


    //getters and setters
    public long getId() {
        return id;
    }
    public void setId(long id) { this.id = id; }

    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPartyId() {
        return partyId;
    }
    public void setPartyId(long partyId) {
        this.partyId = partyId;
    }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }


    //constructors
    public Guests(long userId, long partyId, java.util.Date date) {
        this.userId = userId;
        this.partyId = partyId;
        this.date = date;
    }

    public Guests() {
        //TO-DO empty constructor
    }
}
