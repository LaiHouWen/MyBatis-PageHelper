package com.learn.pagehelper.entity;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Emp {
    private int empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Integer sal;
    private Integer comm;
    private int deptno;
}
