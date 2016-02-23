package fiftygram.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Files")
public class Files {
    @Id
    @GenericGenerator(name = "inc", strategy = "increment")
    @GeneratedValue(generator = "inc")
    private long id;

    @Column(name = "UserId", nullable = false)
    private long UserId;

    @Column(name = "PartyId", nullable = false)
    private long PartyId;

    @Column(name = "Source", nullable = false, length = 100)
    private String Source;

    @Column(name = "Type", nullable = false, length = 15)
    private String Type;

    @Column(name = "Date",  columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date Date;


    //getters and setters
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public long getPartyId() {
        return PartyId;
    }

    public void setPartyId(long partyId) {
        PartyId = partyId;
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() { return Date; }

    public void setDate(Date date) { Date = date; }


    //constructor
    public Files(long UserId, long PartyId, String Type, String source, Date date) {
        this.PartyId = PartyId;
        this.UserId = UserId;
        this.Type = Type;
        this.Source = source;
        this.Date = date;
    }

    public Files() {
        //TO-DO empty constructor
    }
}
