package org.BetsolTraining;

        import org.openqa.selenium.By;
        import org.openqa.selenium.By.ById;
        import org.openqa.selenium.By.ByXPath;

public class ObjectRepo {
    public By.ById source_city = new ById("src");
    public By.ByXPath signin_path = new ByXPath("//*[@id=\"t-signin\"]/a");
    public By.ById destination_city = new ById("dest");
    public By.ByXPath username = new ByXPath("//*[@id=\"login\"]");
    public By.ByXPath password = new ByXPath("//*[@id=\"password\"]");
    public By.ByXPath signin_button = new ByXPath("//*[@id=\"form-oldschool\"]/form/input[3]");
    public By.ByXPath current_date = new ByXPath("//div[@id = 'rb-calendar_onward_cal']//td[@class = 'current day']");
    public By.ByXPath search = new ByXPath("//*[@id=\"search\"]/input");
    public By.ByXPath logo = new ByXPath("//a[@class = 'redbus-logo home-redirect']");

    public By.ByXPath netguru = new ByXPath("//*[@id=\"wrap\"]/div[1]/ol/li[2]/a");

    public By.ByXPath follow_click = new ByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[2]/div[2]/a[1]");
    public By.ByXPath unfollow_click = new ByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[2]/div[2]/a[2]");

    public By.ByXPath hover = new ByXPath("//*[@id=\"t-profile\"]/a");
    public By.ByXPath logout_button = new ByXPath("//*[@id=\"t-profile\"]/ul/li[4]/a");
}
