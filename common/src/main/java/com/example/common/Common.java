package com.example.common;

public class Common {

    private static CommonComponent commonComponent;

    static public void setCommonComponent(CommonComponent commonComponentValue){
        commonComponent = commonComponentValue;
    }

    static public CommonComponent getCommonComponent(){
        return commonComponent;
    }

    private Common() {
    }


    public interface CommonModuleInterface{
       CommonText getCommonText();
    }
}
