package com.learn.pagehelper.entity;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserBook {
    private Integer total;
    private List<Book> bookList;

}
