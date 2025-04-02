/*
 * This file was automatically generated by EvoSuite
 */

package com.ib.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.ib.client.EException;
import com.ib.client.EReader;
import com.ib.client.EWrapper;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class EReaderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 1467);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      EReader eReader0 = new EReader(dataInputStream0, (EWrapper) null, 2030);
      // Undeclared exception!
      try {
        eReader0.run();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pipedInputStream0);
      EReader eReader0 = new EReader(dataInputStream0, (EWrapper) null, 711);
      eReader0.stop();
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      EReader eReader0 = new EReader(dataInputStream0, (EWrapper) null, (int) (byte)67);
      // Undeclared exception!
      try {
        eReader0.processMsg(19);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) pipedInputStream0);
      EReader eReader0 = new EReader(dataInputStream0, (EWrapper) null, 1);
      try {
        eReader0.processMsg(1);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Pipe not connected
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte) (-15);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      EReader eReader0 = new EReader(dataInputStream0, (EWrapper) null, (int) (byte) (-86));
      // Undeclared exception!
      try {
        eReader0.readBoolFromInt();
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"\uFFF1\"
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) bufferedInputStream0);
      // Undeclared exception!
      try {
        EReader.readInt(dataInputStream0);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"\uFFFF\"
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-102);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      EReader eReader0 = new EReader(dataInputStream0, (EWrapper) null, (int) (byte)67);
      eReader0.readDoubleMax();
      // Undeclared exception!
      try {
        eReader0.readDouble();
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"\uFF9A\"
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      EReader eReader0 = new EReader(dataInputStream0, (EWrapper) null, 1);
      eReader0.readDouble();
  }

  @Test
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-102);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      EReader.readInt(dataInputStream0);
      EReader eReader0 = new EReader(dataInputStream0, (EWrapper) null, (int) (byte)67);
      // Undeclared exception!
      try {
        eReader0.readDoubleMax();
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"\uFF9A\"
         */
      }
  }
}
