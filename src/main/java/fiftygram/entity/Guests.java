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

    @Column(name = "UserId", nullable = false)
    private long UserId;

    @Column(name = "PartyId", nullable = false)
    private long PartyId;

    @Column(name = "Date",  columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date Date;


    //getters and setters
    public long getId() {
        return id;
    }
    public void setId(long id) { this.id = id; }

    public long getUserId() {
        return UserId;
    }
    public void setUserId(long userId) {
        UserId = userId;
    }

    public long getPartyId() {
        return PartyId;
    }
    public void setPartyId(long partyId) {
        PartyId = partyId;
    }

    public Date getDate() { return Date; }
    public void setDate(Date date) { Date = date; }


    //constructors
    public Guests(long userId, long partyId, java.util.Date date) {
        UserId = userId;
        PartyId = partyId;
        Date = date;
    }

    public Guests() {
        //TO-DO empty constructor
    }
}
