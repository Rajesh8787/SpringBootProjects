package com.beastgroup.beast.airways.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Account {
    private int  id;
    private String userName;
    private long userBalance;


}
