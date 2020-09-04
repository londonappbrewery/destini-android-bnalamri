package com.londonappbrewery.destini;

public class Story {
    private String mStoryTextId;
    private String mButtonTopTextId;
    private String mButtonButtomTextId;

    public Story(String storyTextId, String buttonTopTextId, String buttonButtomTextId){
        mStoryTextId = storyTextId;
        mButtonTopTextId = buttonTopTextId;
        mButtonButtomTextId = buttonButtomTextId;
    }

    public String getStoryTextId() {
        return mStoryTextId;
    }

    public void setStoryTextId(String storyTextId) {
        mStoryTextId = storyTextId;
    }

    public String getButtonTopTextId() {
        return mButtonTopTextId;
    }

    public void setButtonTopTextId(String buttonTopTextId) {
        mButtonTopTextId = buttonTopTextId;
    }

    public String getButtonButtomTextId() {
        return mButtonButtomTextId;
    }

    public void setButtonButtomTextId(String buttonButtomTextId) {
        mButtonButtomTextId = buttonButtomTextId;
    }
}
