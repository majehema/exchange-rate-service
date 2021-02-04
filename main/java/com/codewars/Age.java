/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codewars;

/**
 *
 * @author mary_
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Age {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate born = LocalDate.parse("07/12/1985", fmt);
        LocalDate today = LocalDate.parse("07/08/2006", fmt);

        Period age = Period.between(born, today);
        System.out.printf("Age: %s years, %s months y %s days",
                age.getYears(), age.getMonths(), age.getDays());
    }
}
