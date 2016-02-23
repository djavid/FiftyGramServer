INSERT INTO Party (id, ownerId, name, description, dateBegin,
  dateEnd, maxGuests, locationCoordinatesHorizontal,
  locationCoordinatesVertical,
  locationAddress, accessType, type, price)
VALUES (1, 1, 'Party in da house!','открываешь глаза: утро, десять часов.
в голове – пустота, вроде не было снов.
да какие там сны, если лечь на заре,
когда скоро рассвет заблестит на дворе?!
полминуты лежишь, не решаясь вставать,
у тебя теплый мир: плед, подушка, кровать.',
     NOW(),DATE_SUB(CURDATE(), INTERVAL +1 DAY),
     10, 25.3, 27.5,'Общага ВШЭ', 'Private', 'Party', 0);

INSERT INTO Party (id, ownerId, name, description, dateBegin,
dateEnd, maxGuests, locationCoordinatesHorizontal,
locationCoordinatesVertical,
locationAddress, accessType, type, price)
VALUES (2, 1, 'LaLalalala!','Что же мы делаем? Кто же мы? Где же мы? Рвем на две части мы мир этот бешеный! Бьемся в истерике, каждый по-своему, Кем-то неглавным опять успокоены… Ищем какое-то тайное знаменье, Чтоб хоть на миг отступило раскаянье.',
NOW(),DATE_SUB(CURDATE(), INTERVAL +1 DAY),
10, 25.3, 27.5,'Dubki', 'Private', 'Party', 0);

INSERT INTO Party (id, ownerId, name, description, dateBegin,
                   dateEnd, maxGuests, locationCoordinatesHorizontal,
                   locationCoordinatesVertical,
                   locationAddress, accessType, type, price)
VALUES (3, 1, 'Вписка в дубках!','Побухали по кайфу! Збс попиздели, охуенно посидели.',
           DATE_SUB(CURDATE(), INTERVAL -36 DAY),DATE_SUB(CURDATE(), INTERVAL -35 DAY),
           10, 25.3, 27.5,'ул. Дениса Давыдова, 3', 'Private', 'Party', 0);

INSERT INTO Party (id, ownerId, name, description, dateBegin,
                   dateEnd, maxGuests, locationCoordinatesHorizontal,
                   locationCoordinatesVertical,
                   locationAddress, accessType, type, price)
VALUES (4, 1, 'Вписка у ванька на хате','Побухали по кайфу, все обблевали, хату спалили.',
           DATE_SUB(CURDATE(), INTERVAL -30 DAY),DATE_SUB(CURDATE(), INTERVAL -25 DAY),
           10, 25.3, 27.5,'метро Щукинская', 'Private', 'Party', 0);



INSERT INTO Likes (id, userId, partyId) VALUES (1, 1, 3);
INSERT INTO Likes (id, userId, partyId) VALUES (2, 1, 2);
INSERT INTO Likes (id, userId, partyId) VALUES (3, 1, 1);
INSERT INTO Likes (id, userId, partyId) VALUES (4, 2, 1);
INSERT INTO Likes (id, userId, partyId) VALUES (5, 2, 2);
INSERT INTO Likes (id, userId, partyId) VALUES (6, 3, 2);
INSERT INTO Likes (id, userId, partyId) VALUES (7, 3, 3);



INSERT INTO User (id, fullName, phoneNumber, email, login, password)
VALUES (1, 'Djavid', '89038310133', 'djavid10@yandex.ru', 'djavid', '131313');

INSERT INTO User (id, fullName, phoneNumber, email, login, password)
VALUES (2, 'Misha', '80123456789', 'misha@yandex.ru', 'misha', 'qwerty');

INSERT INTO User (id, fullName, phoneNumber, email, login, password)
VALUES (3, 'Ivan', '80233456789', 'ivan@yandex.ru', 'ivan', '123456');



INSERT INTO Comments (id, date, partyId, text, userId)
VALUES (1, DATE_SUB(CURDATE(), INTERVAL -35 DAY), 3, 'классное время было!', 1);

INSERT INTO Comments (id, date, partyId, text, userId)
VALUES (2, DATE_SUB(CURDATE(), INTERVAL -35 DAY), 1, 'вот бы еще раз собраться так)', 2);

INSERT INTO Comments (id, date, partyId, text, userId)
VALUES (3, DATE_SUB(CURDATE(), INTERVAL -35 DAY), 2, 'лол, ванек вчера стол обоссал', 1);

INSERT INTO Comments (id, date, partyId, text, userId)
VALUES (4, DATE_SUB(CURDATE(), INTERVAL -35 DAY), 2, 'это был колян!', 3);



INSERT INTO Guests (id, date, partyId, userId)
VALUES (1, DATE_SUB(CURDATE(), INTERVAL -35 DAY), 1, 1);

INSERT INTO Guests (id, date, partyId, userId)
VALUES (2, DATE_SUB(CURDATE(), INTERVAL -35 DAY), 2, 1);

INSERT INTO Guests (id, date, partyId, userId)
VALUES (3, DATE_SUB(CURDATE(), INTERVAL -35 DAY), 3, 1);

INSERT INTO Guests (id, date, partyId, userId)
VALUES (4, DATE_SUB(CURDATE(), INTERVAL -35 DAY), 4, 1);

INSERT INTO Guests (id, date, partyId, userId)
VALUES (5, DATE_SUB(CURDATE(), INTERVAL -35 DAY), 2, 3);

INSERT INTO Guests (id, date, partyId, userId)
VALUES (6, DATE_SUB(CURDATE(), INTERVAL -35 DAY), 3, 2);

INSERT INTO Guests (id, date, partyId, userId)
VALUES (7, DATE_SUB(CURDATE(), INTERVAL -35 DAY), 4, 2);

INSERT INTO Guests (id, date, partyId, userId)
VALUES (8, DATE_SUB(CURDATE(), INTERVAL -35 DAY), 4, 3);
