package gov.irs.enumtype;

import gov.irs.TaxPayer;

public interface IRS {

  void collectTaxes();

  void register(TaxPayer payer);

  static IRS getInstance() { //this calls the IRSEnum class, so to call this you have to call IRS not IRSEnum
    return IRSEnum.INSTANCE;
  }


}
