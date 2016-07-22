# FiftyGramServer
FiftyGram server for iOS and Android clients

## Commands API

### For POST commands:
- if success - returns HTTP 200 (OK)<br />
  else - returns HTTP 500 (INTERNAL SERVER ERROR)

### Party
- **/party/get/all** - get all Parties (GET)
- **/party/get/id/{id}** - get Party with specified id (GET)
- **/party/insert** - put Party object (POST)<br />

### Like
- **/likes/get/all** - get all Likes (GET)
- **/likes/get/partyid/{id}** - get Like with specified Party id (GET)
- **/likes/insert** - put Like object (POST)<br />
- **/likes/insert/array** - put Like objects array (POST)<br />
- **/likes/delete** - remove Like by its object (DELETE)<br />
- **/likes/delete/{id}** - remove Like by its id (GET)<br />

### Guest
- **/guests/get/partyid/{id}** - get Guest with specified Party id (GET)

### Comment
- **/comment/get/partyid/{id}** - get Comment with specified Party id (GET)

### User
- **/user/get/all** - get all Users (GET)
- **/user/get/id/{id}** - get User with specified id (GET)
- **/user/get/login/{login}** - get User with specified login (GET)<br />

To be continued...
