/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList; 

import java.util.Scanner; 

/**
 *
 * @author RC_Student_lab
 */
public class Series {
      private ArrayList<SeriesModel> seriesList = new ArrayList<>(); 

    private Scanner scanner = new Scanner(System.in); 

  

    public void captureSeries() { 

        System.out.println("\nCAPTURE A NEW SERIES"); 

        System.out.print("Enter the series id: "); 

        String id = scanner.nextLine(); 

  

        System.out.print("Enter the series name: "); 

        String name = scanner.nextLine(); 

  

        int age = getValidAge(); 

  

        System.out.print("Enter the number of episodes for " + name + ": "); 

        int episodes = getValidNumber(); 

  

        SeriesModel newSeries = new SeriesModel(id, name, age, episodes); 

        seriesList.add(newSeries); 

  

        System.out.println("\nSeries processed successfully!!!"); 

    } 

  

    public void searchSeries() { 

        System.out.print("\nEnter the series id to search: "); 

        String id = scanner.nextLine(); 

  

        SeriesModel result = findSeriesById(id); 

  

        if (result != null) { 

            printSeries(result); 

        } else { 

            System.out.println("Series with Series Id: " + id + " was not found!"); 

        } 

    } 

  

    public void updateSeries() { 

        System.out.print("\nEnter the series id to update: "); 

        String id = scanner.nextLine(); 

  

        SeriesModel result = findSeriesById(id); 

  

        if (result != null) { 

            System.out.print("Enter the new series name: "); 

            result.seriesName = scanner.nextLine(); 

  

            result.seriesAge = getValidAge(); 

  

            System.out.print("Enter the new number of episodes: "); 

            result.seriesNumberOfEpisodes = getValidNumber(); 

  

            System.out.println("Series updated successfully."); 

        } else { 

            System.out.println("Series with Series Id: " + id + " was not found!"); 

        } 

    } 

  

    public void deleteSeries() { 

        System.out.print("\nEnter the series id to delete: "); 

        String id = scanner.nextLine(); 

  

        SeriesModel result = findSeriesById(id); 

  

        if (result != null) { 

            System.out.print("Are you sure you want to delete series " + id + " from the system? Yes (y) to delete: "); 

            String confirm = scanner.nextLine(); 

  

            if (confirm.equalsIgnoreCase("y")) { 

                seriesList.remove(result); 

                System.out.println("Series with Series Id: " + id + " WAS deleted!"); 

            } else { 

                System.out.println("Deletion canceled."); 

            } 

        } else { 

            System.out.println("Series with Series Id: " + id + " was not found!"); 

        } 

    } 

  

    public void seriesReport() { 

        if (seriesList.isEmpty()) { 

            System.out.println("\nNo series available to show."); 

            return; 

        } 

  

        System.out.println("\nSERIES REPORT 2025"); 

        int count = 1; 

        for (SeriesModel s : seriesList) { 

            System.out.println("\nSeries " + count++); 

            printSeries(s); 

        } 

    } 

  

    public void exitSeriesApplication() { 

        System.out.println("Exiting the application..."); 

        System.exit(0); 

    } 

  

    // === Helper Methods === 

    private SeriesModel findSeriesById(String id) { 

        for (SeriesModel s : seriesList) { 

            if (s.seriesId.equals(id)) { 

                return s; 

            } 

        } 

        return null; 

    } 

  

    private void printSeries(SeriesModel s) { 

        System.out.println("SERIES ID: " + s.seriesId); 

        System.out.println("SERIES NAME: " + s.seriesName); 

        System.out.println("SERIES AGE RESTRICTION: " + s.seriesAge); 

        System.out.println("NUMBER OF EPISODES: " + s.seriesNumberOfEpisodes); 

    } 

  

    private int getValidAge() { 

        int age; 

        while (true) { 

            System.out.print("Enter the series age restriction: "); 

            String input = scanner.nextLine(); 

            try { 

                age = Integer.parseInt(input); 

                if (age >= 2 && age <= 18) { 

                    break; 

                } else { 

                    System.out.println("You have entered an incorrect series age!!! Please enter an age between 2 and 18."); 

                } 

            } catch (NumberFormatException e) { 

                System.out.println("You have entered an incorrect series age!!! Please enter a valid number."); 

            } 

        } 

        return age; 

    } 

  

    private int getValidNumber() { 

        int num; 

        while (true) { 

            String input = scanner.nextLine(); 

            try { 

                num = Integer.parseInt(input); 

                if (num >= 0) { 

                    break; 

                } else { 

                    System.out.print("Please enter a non-negative number: "); 

                } 

            } catch (NumberFormatException e) { 

                System.out.print("Invalid number. Please enter again: "); 

            } 

        } 

        return num; 

    } 

    public void addSeries(SeriesModel sample) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

    public SeriesModel searchSeriesById(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean updateSeriesById(String string, String extreme_Sports_2025, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean deleteSeriesById(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public boolean isValidAge(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 }



