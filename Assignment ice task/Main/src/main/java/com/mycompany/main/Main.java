/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Main { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        Series seriesManager = new Series(); 

  

        while (true) { 

            System.out.println("\nLATEST SERIES 2025"); 

            System.out.print("Enter (1) to launch menu or any other key to exit: "); 

            String choice = scanner.nextLine(); 

  

            if (!choice.equals("1")) { 

                System.out.println("Goodbye!"); 

                break; 

            } 

  

            while (true) { 

                System.out.println("\nPlease select one of the following menu items:"); 

                System.out.println("(1) Capture series."); 

                System.out.println("(2) Search for series."); 

                System.out.println("(3) Update series age restriction."); 

                System.out.println("(4) Delete series."); 

                System.out.println("(5) Print series report."); 

                System.out.println("(6) Exit Application."); 

                System.out.print("Enter your choice: "); 

  

                String option = scanner.nextLine(); 

  

                switch (option) { 

                    case "1": 

                        seriesManager.captureSeries(); 

                        break; 

                    case "2": 

                        seriesManager.searchSeries(); 

                        break; 

                    case "3": 

                        seriesManager.updateSeries(); 

                        break; 

                    case "4": 

                        seriesManager.deleteSeries(); 

                        break; 

                    case "5": 

                        seriesManager.seriesReport(); 

                        break; 

                    case "6": 

                        seriesManager.exitSeriesApplication(); 

                        break; 

                    default: 

                        System.out.println("Invalid option selected."); 

                        break; 

                } 

  

                System.out.print("\nEnter (1) to launch menu or any other key to exit: "); 

                String again = scanner.nextLine(); 

                if (!again.equals("1")) { 

                    System.out.println("Goodbye!"); 

                    return; 

                } 

            } 

        } 

    } 

} 
