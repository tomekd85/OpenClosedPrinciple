package org.tedeo.webview;

public class WebView {
    private final long revenue;

    public WebView(long revenue) {
        this.revenue = revenue;
    }

    public void load(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "WebView{" +
                "revenue=" + revenue +
                '}';
    }
}
