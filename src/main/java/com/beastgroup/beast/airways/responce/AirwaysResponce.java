package com.beastgroup.beast.airways.responce;

import org.springframework.scheduling.support.SimpleTriggerContext;

public class AirwaysResponce {
    private String msg;
    //Constructor
    public AirwaysResponce(String msg){
        this.msg = msg;
    }
    //Getter&Setter
    public String getMsg(){
        return msg;
    }
    public void setMsg(String msg){
        this.msg = msg;
    }
}
