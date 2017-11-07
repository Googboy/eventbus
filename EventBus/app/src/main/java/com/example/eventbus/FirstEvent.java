package com.example.eventbus;

/**
 * Created by 潘硕 on 2017/11/7.
 */

class FirstEvent {
    private String Msg;
    public FirstEvent(String s) {
        Msg = s;
    }

    public String getMsg() {
        return Msg;
    }
}
