#Partypack

Attempt to recreate World of Warcraft's dungeon finder system.

##Requirements

###Basic

- [ ] There are three roles: tank, healer and damage dealer (dps)
- [ ] There is only one dungeon, and all players are eligible for it
- [ ] Player can queue as a specific role
- [ ] It is known that tank is the least popular role and DPS is the most popular
- [ ] The only party setup is 1 tank, 1 healer, 3 dps

###Advanced

- [ ] Player can choose multiple roles
- [ ] Player can queue for a random dungeon
- [ ] Player can queue for multiple dungeons
- [ ] Player can see which slots are filled or empty while he is waiting in the queue (questionable accuracy)
- [ ] Player can see estimated waiting time, based on his selected roles
- [ ] There is an additional setup for raids: 2 tanks, 6 healers, 17 dps.

###Moving to generic queuing system

- [ ] The number of roles is configurable
- [ ] It is unknown beforehand which roles are more or less popular
- [ ] The party configuration is flexible, e.g. "It's OK to have from 2 to 4 tanks and from 6 to 8 healers"