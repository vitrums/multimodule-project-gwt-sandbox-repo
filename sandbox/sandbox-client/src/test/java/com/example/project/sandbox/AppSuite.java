package com.example.project.sandbox;

import com.google.gwt.junit.tools.GWTTestSuite;
import com.example.project.sandbox.AppGwtTest;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AppSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for App");
//    suite.addTestSuite(AppGwtTest.class);
    return suite;
  }
}
