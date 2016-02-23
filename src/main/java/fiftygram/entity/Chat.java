package fiftygram.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Chat")
public class Chat {
    @Id
    @GenericGenerator(name = "inc", strategy = "increment")
    @GeneratedValue(generator = "inc")
    private long id;

    @Column(name = "userId", nullable = false)
    private long userId;

    @Column(name = "partyId", nullable = false)
    private long partyId;

    @Column(name = "text", nullable = false, length = 150)
    private String text;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    //constructor
    public Chat(long UserId, long PartyId, String Text, Date date) {

        this.userId = UserId;
        this.partyId = PartyId;
        this.text = Text;
        this.date = date;
    }

    public Chat(){
        //TO-DO empty constructor
    }

}
