package com.amandeep.topgames;

public class ViewModel {
    private int image;

    private String text;


    ViewModel(int image,String text)
    {
        this.image=image;
        this.text=text;
    }


    public String getText() {
        return text;
    }
    public int getImage() {
        return image;
    }

}
