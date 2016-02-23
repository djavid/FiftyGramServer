package fiftygram.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;


@Entity
@Table(name = "Guests")
public class Guests {
    @Id
    @GenericGenerator(name = "inc", strategy = "increment")
    @GeneratedValue(generator = "inc")
    private long id;

    @Column(name = "UserId", nullable = false)
    private long UserId;

    @Column(name = "PartyId", nullable = false)
    private long PartyId;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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


    public Guests(long userId, long partyId) {
        UserId = userId;
        PartyId = partyId;
    }

    public Guests() {
        //TO-DO empty constructor
    }
}
