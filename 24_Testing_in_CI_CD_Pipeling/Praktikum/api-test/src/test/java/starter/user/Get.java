package starter.user;

import net.thucydides.core.annotations.Step;

public class Get {
    protected public static String url = "https://reqres.in/api/users?page=2"

    @Step("I set GET api endpoint")
    public String setApiEndpoint() {
        return url + "usr/2";
    }

    @Step("I send GET HTTP request")
    public void sendGetHtypRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200")
    public void validDataHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200) );
    }

    private void restAssuredThat(Object o) {
    }
    @Step("I receive valid data for detail user")
    public void validdatafordetailuser(){

    }
}