INSERT INTO currency(currency_id, abbrev, name, requested) VALUES (1, 'MXN', 'Mexican pesos', 0);
INSERT INTO currency(currency_id, abbrev, name, requested) VALUES (2, 'EUR', 'Euro', 0);
INSERT INTO currency(currency_id, abbrev, name, requested) VALUES (3, 'USD', 'US dollar', 0);
INSERT INTO currency(currency_id, abbrev, name, requested) VALUES (4, 'GBP', 'Pound sterling', 0);
INSERT INTO currency(currency_id, abbrev, name, requested) VALUES (5, 'CZK', 'Czech koruna', 0);

insert into exchange(exchange_id,currency_from,currency_to,rate) values(1,1,2,0.0412345628);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(2,1,3,0499268087);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(3,1,4,0.0361845659);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(4,1,5,1.0619136961);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(5,2,1,24.2515);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(6,2,3,1.2108);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(7,2,4,0.87753);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(8,2,5,25.753);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(9,3,1,20.0293194582);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(10,3,2,0.8259002313);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(11,3,4,0.7247522299);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(12,3,5,21.2694086554);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(13,4,1,27.6360922134);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(14,4,2,1.1395621802);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(15,4,3,1.3797818878);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(16,4,5,29.347144827);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(17,5,1,0.9416961131);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(18,5,2,0.0388304275);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(19,5,3,0.047132547);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(20,5,4,0.0340748651);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(21,1,1,1);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(22,2,2,1);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(23,3,3,1);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(24,4,4,1);
insert into exchange(exchange_id,currency_from,currency_to,rate) values(25,5,5,1);
