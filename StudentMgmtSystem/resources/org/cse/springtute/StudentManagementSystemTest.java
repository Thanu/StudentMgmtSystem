/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cse.springtute;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class StudentManagementSystemTest {
    private   StudentManagementSystem sms = new StudentManagementSystem();
    
    
    public StudentManagementSystemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @org.junit.Before    
    public void setUp() {
        
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of listAllStudents method, of class StudentManagementSystem.
     */
    /*@Test
    public void testListAllStudents() {
        System.out.println("listAllStudents");
        //StudentManagementSystem instance = new StudentManagementSystem();
        sms.listAllStudents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of registerStudent method, of class StudentManagementSystem.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        Student stu = new Student("Thanuja","Uruththira",100553,"Colombo");
        //StudentManagementSystem instance = new StudentManagementSystem();
        sms.registerStudent(stu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
