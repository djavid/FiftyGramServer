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

    @Column(name = "userId", nullable = false)
    private long userId;

    @Column(name = "partyId", nullable = false)
    private long partyId;

    @Column(name = "source", nullable = false, length = 100)
    private String source;

    @Column(name = "type", nullable = false, length = 15)
    private String type;

    @Column(name = "date",  columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public long getPartyId() {
        return partyId;
    }

    public void setPartyId(long partyId) {
        this.partyId = partyId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }


    //constructor
    public Files(long UserId, long PartyId, String Type, String source, Date date) {
        this.partyId = PartyId;
        this.userId = UserId;
        this.type = Type;
        this.source = source;
        this.date = date;
    }

    public Files() {
        //TO-DO empty constructor
    }
}
