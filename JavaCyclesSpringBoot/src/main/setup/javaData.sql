drop table product;

create table product (
    prodId varchar(50) primary key,
    brand varchar(50),
    name varchar(50),
    description varchar(200),
    imageName varchar(100),
    price decimal(10,2),
    type varchar(20)
);

insert into product (prodId,brand,name,description,imageName,price,type) values('1', 'Trek',     'Trek Madone 9.9',              'The bike the Pros ride!',                          '1478000_2018_A_1_MADONE_9_9_C_H2.jpg',     11999.99,   'bicycle');
insert into product (prodId,brand,name,description,imageName,price,type) values('2', 'Trek',     'Domane SLR 9 Disc',            'Our most comfortable bike, now with disc brakes.', '1477400_2018_D_1_Domane_SLR_8_Disc.jpeg',  10100.88,   'bicycle');
insert into product (prodId,brand,name,description,imageName,price,type) values('3', 'Trek',     'Boone 7 Disc',                 'Our lightest XC bike to date!',                    '2466000_2018_A_1_Boone_7_Disc.jpeg',       7000.00,    'bicycle');
insert into product (prodId,brand,name,description,imageName,price,type) values('4', 'Twin Six', 'The HC',                       '100% Soft Polyester Microfiber',                   'HC_F_2048x2048.jpg',                       85.00,      'clothing');
insert into product (prodId,brand,name,description,imageName,price,type) values('5', 'Twin Six', 'Boone 7 Disc',                 '850% Soft Polyester Microfiber',                   'ModSquad_F_2048x2048.jpg',                 85.00,      'clothing');
insert into product (prodId,brand,name,description,imageName,price,type) values('6', 'Nashbar',  'Nashbar 360 Repair Stand',     'Cheap and light stand',                            'BN-WS360-NCL-TOP.jpg',                     89.99,      'accessory');
insert into product (prodId,brand,name,description,imageName,price,type) values('7', 'Nashbar',  'Nashbar Multi-11 Bike Tool',   'All the tools you need',                           'BN-M11-NCL-TOP.jpg',                       7.99,       'accessory');
