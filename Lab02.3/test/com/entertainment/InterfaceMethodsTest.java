/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment;

public class InterfaceMethodsTest {

  public static void main(String[] args) {
    InterfaceMethodsTest testClient = new InterfaceMethodsTest();
    testClient.testDefaultMethods();
    testClient.testStaticMethods();
  }

  public void testDefaultMethods() {
    System.out.println("-- testDefaultMethods --");

    // create instances of Volume, store in Volume[] array for convenience in testing
    // QUIZ YOURSELF: why is Television and Radio okay in this Volume[] array?
    Volume[] volArray = {new Television("Zenith", 17), new Radio(5)};

    // iterate over the array, silencing each element
    for (Volume vol : volArray) {
      // DONE: uncomment below once you add the silence() method to Volume
      vol.silence();

      // ACTUAL TEST - make sure each element is silent
      System.out.println("volume is zero: " + (vol.getVolume() == 0));
    }
  }

  public void testStaticMethods() {
    System.out.println("-- testStaticMethods --");

    Volume[] volArray = {new Television("Zenith", 17), new Radio(5)};

    // DONE: uncomment below once you add the silenceAll() method to Volume
    Volume.silenceAll(volArray);

    // ACTUAL TEST - iterate over the array, testing that they are all silent
    for (Volume vol : volArray) {
      System.out.println("volume is zero: " + (vol.getVolume() == 0));
    }
  }

}