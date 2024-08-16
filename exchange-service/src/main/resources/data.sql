create table exchangetable
 (exchange_id integer not null, exchange_value integer not null, currency_from varchar(255), 
 currency_to varchar(255), primary key (exchange_id));
insert into EXCHANGETABLE (EXCHANGE_ID, CURRENCY_FROM, CURRENCY_TO, EXCHANGE_VALUE ) values(101,'USD','INR',80);
insert into EXCHANGETABLE (EXCHANGE_ID, CURRENCY_FROM, CURRENCY_TO, EXCHANGE_VALUE ) values(102,'AUD','INR',65);
insert into EXCHANGETABLE (EXCHANGE_ID, CURRENCY_FROM, CURRENCY_TO, EXCHANGE_VALUE ) values(103,'EUR','INR',88);
insert into EXCHANGETABLE (EXCHANGE_ID, CURRENCY_FROM, CURRENCY_TO, EXCHANGE_VALUE ) values(104,'MYR','INR',19);
insert into EXCHANGETABLE (EXCHANGE_ID, CURRENCY_FROM, CURRENCY_TO, EXCHANGE_VALUE ) values(105,'PON','INR',90);
