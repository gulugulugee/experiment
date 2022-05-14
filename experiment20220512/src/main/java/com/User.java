package com;

public class User {
    private int uid;
    private String uname;
    private int account;
    private int keyWord;

    public User(int uid, String uname, int account, int keyWord) {
        this.uid = uid;
        this.uname = uname;
        this.account = account;
        this.keyWord = keyWord;
    }

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(int keyWord) {
        this.keyWord = keyWord;
    }
}
