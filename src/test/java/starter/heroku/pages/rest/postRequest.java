package starter.heroku.pages.rest;

public class postRequest {

    public String title;
    public String body;
    public String userId;

    public postRequest(String title, String body, String userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }
}
