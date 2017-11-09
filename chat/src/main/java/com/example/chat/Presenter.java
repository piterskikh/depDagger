package com.example.chat;


import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class Presenter extends MvpPresenter<TestInterface> {


    public void setTextOnActivity() {

        getViewState().setTextAct("Это текст из Презентера !!!");
    }


}
