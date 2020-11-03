package com.learn.pagehelper.entity;

import lombok.*;

/**
 *create table book(
 * id int not null primary key auto_increment,
 * bookId int default 0 ,
 * bookName varchar(20) default "",
 * title varchar(20) default "",
 * detail varchar(36) default "")engine=INNODB comment "书名";
 *
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Book {
    private Integer id;
    private Integer bookId;
    private String bookName;
    private String title;
    private String detail;
}
