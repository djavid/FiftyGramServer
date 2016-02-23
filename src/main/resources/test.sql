INSERT INTO Party (id, OwnerId, Name, Description, DateBegin,
  DateEnd, MaxGuests, LocationCoordinatesHorizontal,
  LocationCoordinatesVertical,
  LocationAddress, AccessType, Type, Price)
VALUES (1, 1, 'Party in da house!','Best Party!',
     NOW(),DATE_SUB(CURDATE(), INTERVAL +1 DAY),
     10, 25.3, 27.5,'Dubki', 'Private', 'Party', 0);

INSERT INTO Party (id, OwnerId, Name, Description, DateBegin,
DateEnd, MaxGuests, LocationCoordinatesHorizontal,
LocationCoordinatesVertical,
LocationAddress, AccessType, Type, Price)
VALUES (2, 1, 'LaLalalala!','Best Party!',
NOW(),DATE_SUB(CURDATE(), INTERVAL +1 DAY),
10, 25.3, 27.5,'Dubki', 'Private', 'Party', 0);

INSERT INTO Likes (id, UserId, PartyId) VALUES (1, 1, 3);
INSERT INTO Likes (id, UserId, PartyId) VALUES (2, 2, 3);
INSERT INTO Likes (id, UserId, PartyId) VALUES (3, 3, 3);
