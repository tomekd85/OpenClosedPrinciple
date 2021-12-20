package org.tedeo.controller;

import org.tedeo.interactor.FinancialReportGenerator;
import org.tedeo.printerpresenter.PrinterPresenter;
import org.tedeo.screenpresenter.ScreenPresenter;

public class FinancialReportController {

    public void generatePdfView(){
        FinancialEntities financialEntities = new FinancialReportGenerator().generateReportData();
        new PrinterPresenter().show(financialEntities);
    }

    public void generateWebView(){
        FinancialEntities financialEntities = new FinancialReportGenerator().generateReportData();
        new ScreenPresenter().show(financialEntities);
    }
}
