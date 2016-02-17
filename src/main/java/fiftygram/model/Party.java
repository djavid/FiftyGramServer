package fiftygram.model;


import sun.security.krb5.internal.crypto.Des;

import java.sql.Date;

public class Party {
    //fields
    public int id;
    public int OwnerId;
    public String Name;
    public String Description;
    public Date DateBegin;
    public Date DateEnd;
    public int MaxGuests;
    public double LocationCoordinatesHorizontal;
    public double LocationCoordinatesVertical;
    public String LocationAddress;
    public String AccessType;
    public String Type;
    public int Price;

    //getters and setters

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
}
