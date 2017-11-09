package com.example.chat;


import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;


public interface TestInterface extends MvpView {


    @StateStrategyType(OneExecutionStateStrategy.class)
    void setTextAct(String str);


}
