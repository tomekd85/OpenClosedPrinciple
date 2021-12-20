package org.tedeo.printerpresenter;

import org.tedeo.controller.FinancialEntities;
import org.tedeo.pdfview.PdfView;

public class PrinterPresenter {

    public PdfView show(FinancialEntities financialEntities){
        long revenue = financialEntities.getRevenue();
        return new PdfView(revenue);
    }
}
