package jpuppeteer.cdp.cdp.entity.network;

/**
*/
@lombok.Setter
@lombok.Getter
@lombok.ToString
public class GetAllCookiesResponse {

    /**
    * Array of cookie objects.
    */
    private java.util.List<jpuppeteer.cdp.cdp.entity.network.Cookie> cookies;



}