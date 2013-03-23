
    alter table t_app_dict_data 
        drop 
        foreign key FKD7E2756A5D86820A;

    drop table if exists t_app_dict_data;

    drop table if exists t_app_dict_type;

    create table t_app_dict_data (
        id bigint not null auto_increment,
        created_date datetime,
        dict_cd varchar(50),
        dict_name varchar(255),
        disp_order_no decimal(12,0),
        i18n varchar(255),
        remark varchar(255),
        updated_date datetime,
        dict_type_id bigint,
        primary key (id)
    ) ENGINE=InnoDB;

    create table t_app_dict_type (
        id bigint not null auto_increment,
        created_date datetime,
        dict_type_cd varchar(255),
        dict_type_name varchar(255),
        disp_order_no decimal(12,0),
        remark varchar(255),
        updated_date datetime,
        primary key (id)
    ) ENGINE=InnoDB;

    alter table t_app_dict_data 
        add index FKD7E2756A5D86820A (dict_type_id), 
        add constraint FKD7E2756A5D86820A 
        foreign key (dict_type_id) 
        references t_app_dict_type (id);
