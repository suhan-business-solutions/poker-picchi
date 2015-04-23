create table pokerp_BuyIn (
	transactionId LONG not null primary key,
	gameId LONG,
	playerId LONG,
	amount DOUBLE,
	credit BOOLEAN,
	createdBy VARCHAR(75) null,
	createdDate DATE null,
	updatedBy VARCHAR(75) null,
	updatedDate DATE null
);

create table pokerp_BuyOut (
	transactionId LONG not null primary key,
	gameId LONG,
	playerId LONG,
	amount DOUBLE,
	createdBy VARCHAR(75) null,
	createdDate DATE null,
	updatedBy VARCHAR(75) null,
	updatedDate DATE null
);

create table pokerp_PokerTable (
	gameId LONG not null primary key,
	orgId LONG,
	tableName VARCHAR(75) null,
	playerCount INTEGER,
	status INTEGER,
	notes VARCHAR(75) null,
	createdBy VARCHAR(75) null,
	createdDate DATE null,
	updatedBy VARCHAR(75) null,
	updatedDate DATE null
);

create table pokerp_PokerTablePlayer (
	gameId LONG not null,
	playerId LONG not null,
	timeJoined DATE null,
	timeLeft DATE null,
	amountWon DOUBLE,
	createdBy VARCHAR(75) null,
	createdDate DATE null,
	updatedBy VARCHAR(75) null,
	updatedDate DATE null,
	primary key (gameId, playerId)
);