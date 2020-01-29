package com.lmnguni.tax_calc.tax_rates.repository.impl;

import com.lmnguni.tax_calc.tax_rates.model.MedicalCreditRate;
import com.lmnguni.tax_calc.tax_rates.repository.TaxRateRepsitory;

public class MedicalCreditRateRepository extends TaxRateRepsitory<MedicalCreditRate> {

    
    @Override
    protected Class<MedicalCreditRate> getEntityClass() {
        return MedicalCreditRate.class;
    }
}
