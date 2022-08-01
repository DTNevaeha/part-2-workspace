package com.javatunes.personnel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee employee;

  @Before
  public void setUp() throws Exception {
    employee = new SalariedEmployee("John Smith", new Date(0), 1000.00);
  }

  @Test
  public void Pay() {
    assertEquals(1000.0, employee.pay(), 0.005);
  }

  @Test
  public void PayTaxes() {
    assertEquals(1000 * (TaxPayer.SALARIED_TAX_RATE), employee.payTaxes(), 0.005);
  }
  @SuppressWarnings("SimplifiableAssertion")
  @Test //says that employee2 is = to salaried employeee
  public void equals_same() {
    Employee employee2 = new SalariedEmployee("John Smith", new Date(0), 1000.00);
    //noinspection SimplifiableAssertion   --No idea what this means
    assertTrue(employee.equals(employee2));
    assertTrue(employee2.equals(employee));
  }

  @Test //ensures that employee2 is NOT equal to salaried employee
  public void equals_different() {
    Employee employee2 = new SalariedEmployee("Jane Smith", new Date(0), 1000.00);
    assertFalse(employee.equals(employee2));
  }

  @Test
  public void hashCode_same() {
    Employee employee2 = new SalariedEmployee("John Smith", new Date(0), 1000.00);
    assertEquals(employee.hashCode(), employee2.hashCode());
  }

  @Test
  public void hashCode_different() {
    Employee employee2 = new SalariedEmployee("John Smith", new Date(1), 1000.00);
    assertNotEquals(employee.hashCode(), employee2.hashCode());
  }

}