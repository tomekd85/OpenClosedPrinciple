package org.tedeo.screenpresenter;

import org.tedeo.controller.FinancialEntities;
import org.tedeo.webview.WebView;

public class ScreenPresenter {

    public WebView show(FinancialEntities financialEntities){
        long revenue = financialEntities.getRevenue();
        return new WebView(revenue);
    }
}
