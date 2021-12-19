create schema if not exists dict;
create sequence if not exists dict.currency_id_seq;
create sequence if not exists dict.bank_book_id_seq;

create table if not exists dict.currency(
   id integer unique not null default nextval('dict.currency_id_seq'),
   name varchar not null,
   PRIMARY KEY (id)
);

insert into dict.currency(name)
values ('USD'), ('EUR'), ('RUB'), ('GBR');

create table if not exists dict.bank_book(
   id integer unique not null default nextval('dict.bank_book_id_seq'),
   user_id integer not null,
   number varchar not null,
   amount numeric not null,
   currency integer not null,
   PRIMARY KEY (id),
   FOREIGN KEY (currency) REFERENCES dict.currency(id)
);

