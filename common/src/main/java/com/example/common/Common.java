package com.example.common;


public class Common {

    private static CommonComponent commonComponent;

    private Common() {
    }

    static public CommonComponent getCommonComponent(){
        return commonComponent;
    }

    static public void setCommonComponent(CommonComponent commonComponentValue) {
        commonComponent = commonComponentValue;
    }


    public interface CommonModuleInterface{
       CommonText getCommonText();
    }
}
