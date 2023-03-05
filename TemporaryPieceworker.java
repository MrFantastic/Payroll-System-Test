/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * written as a subclass that extends from the Employee class
 * @author Alexander Raymond
 */
public class TemporaryPieceworker extends Employee {
   private double wage;
   private int pieces;


   // parameterized constructor for first, last, ssn, wage, pieces
   public TemporaryPieceworker(String first, String last, String ssn, double wage, int pieces) {
       super(first, last, ssn);
       this.wage = wage;
       this.pieces = pieces;
   }

  //returns wage
   public double getWage() {
       return wage;
   }

   //sets wage
   public void setWage(double wage) {
       this.wage = wage;
   }

  
   //returns the pieces
   public int getPieces() {
       return pieces;
   }

   // sets pieces
   public void setPieces(int pieces) {
       this.pieces = pieces;
   }

   // calculate earnings
   @Override
   public double earnings() {
       return wage * pieces;
   }

   // return String representation of TemporaryPieceworker object
   public String toString() {
       return String.format("pieceworker employee: %s\n%s: $%,.2f\n%s: %d", super.toString(), "wage", getWage(),
               "pieces", getPieces());
   }
}

