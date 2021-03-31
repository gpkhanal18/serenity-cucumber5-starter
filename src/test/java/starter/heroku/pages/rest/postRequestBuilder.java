package starter.heroku.pages.rest;

public final class postRequestBuilder {
    public String title;
    public String body;
    public String userId;

    private postRequestBuilder() {
    }

    public static postRequestBuilder apostRequest() {
        return new postRequestBuilder();
    }

    public postRequestBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public postRequestBuilder withBody(String body) {
        this.body = body;
        return this;
    }

    public postRequestBuilder withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public postRequest build() {
        return new postRequest(title, body, userId);
    }
}
