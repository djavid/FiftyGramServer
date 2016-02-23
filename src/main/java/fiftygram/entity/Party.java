package fiftygram.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Party")
public class Party {

    //fields
    @Id
    @GenericGenerator(name = "inc", strategy = "increment")
    @GeneratedValue(generator = "inc")
    private long id;

    @Column(name = "ownerId", nullable = false)
    private long ownerId;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "description", nullable = false, length = 500)
    private String description;

    @Column(name = "dateBegin", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateBegin;

    @Column(name = "dateEnd", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnd;

    @Column(name = "maxGuests", nullable = false)
    private int maxGuests;

    @Column(name = "locationCoordinatesHorizontal", nullable = false)
    private double locationCoordinatesHorizontal;

    @Column(name = "locationCoordinatesVertical", nullable = false)
    private double locationCoordinatesVertical;

    @Column(name = "locationAddress", nullable = false, length = 150)
    private String locationAddress;

    @Column(name = "accessType", nullable = false, length = 20)
    private String accessType;

    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "created",  columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;


    //getters and setters
    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public long getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(long ownerId) {
        ownerId = ownerId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getDateBegin() {
        return dateBegin;
    }
    public void setDateBegin(Date dateBegin) {
        dateBegin = dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public double getLocationCoordinatesVertical() {
        return locationCoordinatesVertical;
    }
    public void setLocationCoordinatesVertical(double locationCoordinatesVertical) {
        this.locationCoordinatesVertical = locationCoordinatesVertical;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getAccessType() {
        return accessType;
    }
    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public String getLocationAddress() {
        return locationAddress;
    }
    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public double getLocationCoordinatesHorizontal() {
        return locationCoordinatesHorizontal;
    }
    public void setLocationCoordinatesHorizontal(double locationCoordinatesHorizontal) {
        this.locationCoordinatesHorizontal = locationCoordinatesHorizontal;
    }

    public int getMaxGuests() {
        return maxGuests;
    }
    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() { return created; }
    public void setCreated(Date created) { this.created = created; }


    //constructors
    public Party(long OwnerId, String Name,
                 String Description, Date DateBegin,
                 Date DateEnd, int MaxGuests,
                 double LocationCoordinatesHorizontal,
                 double LocationCoordinatesVertical,
                 String LocationAddress, String AccessType,
                 String Type, int Price) {

        this.ownerId = OwnerId;
        this.name = Name;
        this.description = Description;
        this.dateBegin = DateBegin;
        this.dateEnd = DateEnd;
        this.maxGuests = MaxGuests;
        this.locationCoordinatesHorizontal = LocationCoordinatesHorizontal;
        this.locationCoordinatesVertical = LocationCoordinatesVertical;
        this.locationAddress = LocationAddress;
        this.accessType = AccessType;
        this.type = Type;
        this.price = Price;
    }

    public Party() {
        //TO-DO empty constructor
    }
}
