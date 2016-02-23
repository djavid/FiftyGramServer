package fiftygram.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by mikhailarzumanov on 23.02.16.
 */
@Entity
@Table(name = "Comments")
public class Comments {
    @Id
    @GenericGenerator(name = "inc", strategy = "increment")
    @GeneratedValue(generator = "inc")
    private long id;

    @Column(name = "UserId", nullable = false)
    private long UserId;

    @Column(name = "PartyId", nullable = false)
    private long PartyId;

    @Column(name = "Text", nullable = false, length = 500)
    private String Text;

    @Column(name = "Date",  columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date Date;

//getters and setters
    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
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
    //constructor
    public Comments(long UserId, long PartyId, String Text, java.util.Date date) {

        this.UserId = UserId;
        this.PartyId = PartyId;
        this.Text = Text;
        this.Date = date;
    }

    public Comments(){
        //TO-DO empty constructor
    }
}