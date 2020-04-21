package com.hr.corp;

import gov.irs.TaxPayer;

public class Corporation implements TaxPayer{

    @Override
    public void payTaxes() {
        System.out.println("Corporation paid no taxes - we lobbied hard and it worked");
    }

    @Override
    public void submitDocuments(){
        System.out.println("Sending legal team instead");
    }



}
