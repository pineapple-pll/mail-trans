create table config
(
    config_id            bigint not null auto_increment,
    backup_dir           varchar(255),
    trans_domain         varchar(255),
    host                 varchar(255),
    local_path           varchar(255),
    mail_id              varchar(255),
    mail_ip              varchar(255),
    mail_port            varchar(255),
    mail_pw              varchar(255),
    office_db_id         varchar(255),
    office_db_ip         varchar(255),
    office_db_name       varchar(255),
    office_db_port       varchar(255),
    office_db_pw         varchar(255),
    remote_backup_path   varchar(255),
    remote_db_id         varchar(255),
    remote_db_ip         varchar(255),
    remote_db_name       varchar(255),
    remote_db_pw         varchar(255),
    remote_db_table_name varchar(255),
    remote_mail_path     varchar(255),
    sid                  varchar(255),
    primary key (config_id)
) engine=InnoDB;

create table mail
(
    mail_id       bigint not null auto_increment,
    file_location varchar(255),
    mail_date     datetime(6),
    trans_status  varchar(255),
    mail_box_id   bigint,
    mail_user_id  varchar(255),
    primary key (mail_id)
) engine=InnoDB

create table mail_box
(
    mail_box_id          bigint  not null auto_increment,
    mail_box_name        varchar(255),
    mailplug_mail_box_id integer not null,
    mail_user_id         varchar(255),
    primary key (mail_box_id)
) engine=InnoDB

create table mail_user
(
    mail_user_id varchar(255) not null,
    account_id   varchar(255),
    name         varchar(255),
    primary key (mail_user_id)
) engine=InnoDB