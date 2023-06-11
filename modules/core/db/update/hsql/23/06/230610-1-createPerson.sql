create table SUPER_PERSON (
    ID integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(255),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(255),
    DELETE_TS timestamp,
    DELETED_BY varchar(255),
    VERSION integer,
    --
    SHORT_NAME varchar(255) not null,
    LONG_NAME varchar(255),
    AGE integer,
    --
    primary key (ID)
);