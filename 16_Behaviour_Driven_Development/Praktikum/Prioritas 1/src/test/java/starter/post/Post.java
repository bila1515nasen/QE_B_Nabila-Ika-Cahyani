package starter.post;

import net.thucydides.core.annotations.Step;

public class Post {
    @Step("I am on the home page")
    public void onTheHomePage(){
        System.out.println("I am on the home page");
    }
    @Step("I create a post")
    public void createAPost(){
        System.out.println("I create a post");
    }
    @Step("I click post button")
    public void clickPostButton(){
        System.out.println("I click post button");
    }
    @Step("I am finish my post")
    public void finishMyPost(){
        System.out.println("I am finish my post");
    }
}
