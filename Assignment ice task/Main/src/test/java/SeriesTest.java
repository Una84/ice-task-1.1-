/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.main.Series;
import com.mycompany.main.SeriesModel;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author RC_Student_lab
 */
public class SeriesTest {
    
     private Series seriesManager; 

  

    @BeforeEach 

    public void setUp() { 

        seriesManager = new Series(); 

        SeriesModel sample = new SeriesModel("101", "Extreme Sports", 12, 10); 

        seriesManager.addSeries(sample); 

    } 

  

    @Test 

    public void TestSearchSeries() { 

        SeriesModel found = seriesManager.searchSeriesById("101"); 

        assertNotNull(found); 

        assertEquals("Extreme Sports", found.seriesName); 

    } 

  

    @Test 

    public void TestSearchSeries_SeriesNotFound() { 

        SeriesModel found = seriesManager.searchSeriesById("999"); 

        assertNull(found); 

    } 

  

    @Test 

    public void TestUpdateSeries() { 

        boolean updated = seriesManager.updateSeriesById("101", "Extreme Sports 2025", 10, 13); 

        assertTrue(updated); 

  

        SeriesModel updatedSeries = seriesManager.searchSeriesById("101"); 

        assertEquals("Extreme Sports 2025", updatedSeries.seriesName); 

        assertEquals(10, updatedSeries.seriesAge); 

        assertEquals(13, updatedSeries.seriesNumberOfEpisodes); 

    } 

  

    @Test 

    public void TestDeleteSeries() { 

        boolean deleted = seriesManager.deleteSeriesById("101"); 

        assertTrue(deleted); 

        assertNull(seriesManager.searchSeriesById("101")); 

    } 

  

    @Test 

    public void TestDeleteSeries_SeriesNotFound() { 

        boolean deleted = seriesManager.deleteSeriesById("999"); 

        assertFalse(deleted); 

    } 

  

    @Test 

    public void TestSeriesAgeRestriction_AgeValid() { 

        assertTrue(seriesManager.isValidAge("12")); 

        assertTrue(seriesManager.isValidAge("2")); 

        assertTrue(seriesManager.isValidAge("18")); 

    } 

  

    @Test 

    public void TestSeriesAgeRestriction_SeriesAgeinValid() { 

        assertFalse(seriesManager.isValidAge("1"));       // Below min 

        assertFalse(seriesManager.isValidAge("19"));      // Above max 

        assertFalse(seriesManager.isValidAge("Ten"));     // Not a number 

        assertFalse(seriesManager.isValidAge(""));        // Empty string 

    } 

} 

 

 