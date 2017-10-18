package com.nust.ticket.test;

import java.util.Date;

/**
 * @author zhanghang
 * @description
 * @date 2017/10/18 14:51
 * @modified by
 */
public class TicketDO {
    private String id;
    private String description;
    private Date time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TicketDO{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", time=" + time +
                '}';
    }
    public  static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("666");
            }
        });
        thread.start();
    }
}
