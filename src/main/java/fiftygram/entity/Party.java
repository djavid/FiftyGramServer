package fiftygram.entity;


import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Party")
public class Party {

    //fields

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "OwnerId", nullable = false)
    private int OwnerId;

    @Column(name = "Name", nullable = false, length = 30)
    private String Name;

    @Column(name = "Description", nullable = false, length = 180)
    private String Description;

    @Column(name = "DateBegin", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateBegin;

    @Column(name = "DateEnd", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateEnd;

    @Column(name = "MaxGuests", nullable = false)
    private int MaxGuests;

    @Column(name = "LocationCoordinatesHorizontal", nullable = false)
    private double LocationCoordinatesHorizontal;

    @Column(name = "LocationCoordinatesVertical", nullable = false)
    private double LocationCoordinatesVertical;

    @Column(name = "LocationAddress", nullable = false, length = 150)
    private String LocationAddress;

    @Column(name = "AccessType", nullable = false, length = 20)
    private String AccessType;

    @Column(name = "Type", nullable = false, length = 20)
    private String Type;

    @Column(name = "Price", nullable = false)
    private int Price;


    //getters and setters
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(int ownerId) {
        OwnerId = ownerId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getDateBegin() {
        return DateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        DateBegin = dateBegin;
    }

    public Date getDateEnd() {
        return DateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        DateEnd = dateEnd;
    }

    public double getLocationCoordinatesVertical() {
        return LocationCoordinatesVertical;
    }

    public void setLocationCoordinatesVertical(double locationCoordinatesVertical) {
        LocationCoordinatesVertical = locationCoordinatesVertical;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getAccessType() {
        return AccessType;
    }

    public void setAccessType(String accessType) {
        AccessType = accessType;
    }

    public String getLocationAddress() {
        return LocationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        LocationAddress = locationAddress;
    }

    public double getLocationCoordinatesHorizontal() {
        return LocationCoordinatesHorizontal;
    }

    public void setLocationCoordinatesHorizontal(double locationCoordinatesHorizontal) {
        LocationCoordinatesHorizontal = locationCoordinatesHorizontal;
    }

    public int getMaxGuests() {
        return MaxGuests;
    }

    public void setMaxGuests(int maxGuests) {
        MaxGuests = maxGuests;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


    //constructor
    public Party(int id, int OwnerId, String Name,
                 String Description, Date DateBegin,
                 Date DateEnd, int MaxGuests,
                 double LocationCoordinatesHorizontal,
                 double LocationCoordinatesVertical,
                 String LocationAddress, String AccessType,
                 String Type, int Price) {

        this.id = id;
        this.OwnerId = OwnerId;
        this.Name = Name;
        this.Description = Description;
        this.DateBegin = DateBegin;
        this.DateEnd = DateEnd;
        this.MaxGuests = MaxGuests;
        this.LocationCoordinatesHorizontal = LocationCoordinatesHorizontal;
        this.LocationCoordinatesVertical = LocationCoordinatesVertical;
        this.LocationAddress = LocationAddress;
        this.AccessType = AccessType;
        this.Type = Type;
        this.Price = Price;
    }

    public Party() {
        //TO-DO empty constructor
    }
}
