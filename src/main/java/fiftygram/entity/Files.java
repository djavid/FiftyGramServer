package fiftygram.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;



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

    //constructor
    public Files(long UserId,long PartyId,String Type, String source) {
        this.PartyId = PartyId;
        this.UserId = UserId;
        this.Type = Type;
        this.Source = source;
    }

    public Files() {
        //TO-DO empty constructor
    }
}
