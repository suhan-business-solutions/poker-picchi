create index IX_654B2A6A on pokerp_BuyIn (gameId);
create index IX_8F6DB1BA on pokerp_BuyIn (gameId, playerId);

create index IX_D091CF57 on pokerp_BuyOut (gameId);
create index IX_7570D267 on pokerp_BuyOut (gameId, playerId);

create index IX_44350785 on pokerp_PokerTablePlayer (gameId);
create index IX_C1862915 on pokerp_PokerTablePlayer (gameId, playerId);
create index IX_74A1A574 on pokerp_PokerTablePlayer (playerId);