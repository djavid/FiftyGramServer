package fiftygram.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Comments")
public class Comments {

    @Id
    @GenericGenerator(name = "inc", strategy = "increment")
    @GeneratedValue(generator = "inc")
    private long id;

    @Column(name = "userId", nullable = false)
    private long userId;

    @Column(name = "partyId", nullable = false)
    private long partyId;

    @Column(name = "text", nullable = false, length = 500)
    private String text;

    @Column(name = "date",  columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


    //getters and setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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


    //constructor
    public Comments(long UserId, long PartyId, String Text, Date date) {

        this.userId = UserId;
        this.partyId = PartyId;
        this.text = Text;
        this.date = date;
    }

    public Comments(){
        //TO-DO empty constructor
    }
}
