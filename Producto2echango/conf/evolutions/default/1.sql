# --- First database schema

# --- !Ups

create table producto (
  id                        bigint not null,
  name                      varchar(255),
  precio                	varchar(255),
  fecha              		timestamp,
  constraint pk_computer primary key (id))
;

create sequence producto_seq start with 1000;


# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists producto;


SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists producto_seq;



