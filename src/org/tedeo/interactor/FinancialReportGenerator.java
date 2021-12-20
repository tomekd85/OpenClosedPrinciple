package org.tedeo.interactor;

import org.tedeo.controller.FinancialEntities;
import org.tedeo.db.FinancialDataMapper;
import org.tedeo.db.FinancialDatabase;

public class FinancialReportGenerator {
    public FinancialEntities generateReportData() {
        FinancialEntities financialEntities = new FinancialEntities();
        financialEntities.setRevenue(new FinancialDataMapper().getRevenue(new FinancialDatabase()));
        return financialEntities;
    }
}
