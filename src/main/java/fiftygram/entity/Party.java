package fiftygram.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;


@Embeddable
public class Party {

    //fields
    private int id;
    private int OwnerId;
    private String Name;
    private String Description;
    private Date DateBegin;
    private Date DateEnd;
    private int MaxGuests;
    private double LocationCoordinatesHorizontal;
    private double LocationCoordinatesVertical;
    private String LocationAddress;
    private String AccessType;
    private String Type;
    private int Price;


    //getters and setters
    public int getId() {
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
