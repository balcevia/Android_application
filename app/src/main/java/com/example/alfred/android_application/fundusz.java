package com.example.alfred.android_application;

public class fundusz {
    private String title, TFI;

    public fundusz(){
    }

    public fundusz(String title, String TFI){
        this.title = title;
        this.TFI = TFI;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTFI(){
        return TFI;
    }

    public void setTFI(String TFI){
        this.TFI = TFI;
    }
}
