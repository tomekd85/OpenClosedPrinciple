package org.tedeo.controller;

import org.tedeo.interactor.FinancialReportGenerator;
import org.tedeo.pdfview.PdfView;
import org.tedeo.printerpresenter.PrinterPresenter;
import org.tedeo.screenpresenter.ScreenPresenter;
import org.tedeo.webview.WebView;

public class FinancialReportController {

    public static void main(String[] args) {
        final FinancialReportController financialReportController = new FinancialReportController();
        financialReportController.generatePdfView();
        financialReportController.generateWebView();
    }


    public void generatePdfView(){
        FinancialEntities financialEntities = new FinancialReportGenerator().generateReportData();
        final PdfView pdfView = new PrinterPresenter().show(financialEntities);
        pdfView.load();
    }

    public void generateWebView(){
        FinancialEntities financialEntities = new FinancialReportGenerator().generateReportData();
        final WebView webView = new ScreenPresenter().show(financialEntities);
        webView.load();
    }
}
