/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cse.springtute;

import java.util.ArrayList;
import java.util.List;
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
public class SimpleStudentRepositoryTest {
    private Student stu = new Student("Thanuja","Uruththira",100553,"Colombo");
    private SimpleStudentRepository ssr = new SimpleStudentRepository();
        
        
    public SimpleStudentRepositoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of saveStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        //Student stu = null;
        //SimpleStudentRepository instance = new SimpleStudentRepository();
        ssr.saveStudent(stu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        //Student stu = null;
        //SimpleStudentRepository instance = new SimpleStudentRepository();
        ssr.deleteStudent(stu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindStudent() {
        System.out.println("findStudent");
        //long regNumber = 0L;
        //SimpleStudentRepository instance = new SimpleStudentRepository();
        Student expResult = stu;
        Student result = ssr.findStudent(100553);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
        //Student stu = null;
        //SimpleStudentRepository instance = new SimpleStudentRepository();
        ssr.updateStudent(stu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAllStudents method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindAllStudents() {
        System.out.println("findAllStudents");
        //SimpleStudentRepository instance = new SimpleStudentRepository();
        List expResult = new ArrayList() ;
        expResult.add(stu);
        List result = ssr.findAllStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
