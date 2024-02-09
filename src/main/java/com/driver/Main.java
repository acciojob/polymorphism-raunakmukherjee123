package com.driver;

public class Main {
   public static void main(String[] args)
  {
     Product p=new Product();
     int ans1=p.product(10,15);
     int ans2=p.product(10,15,20);
     double ans3=p.product(20,30);
     System.out.println(ans1+" "+ans2+" "+ans3);
   }
   static class Product
  {
      public int product(int x, int y)
      {
      return x*y;
      }
      public int product(int x, int y, int z)
      {
          return x*y*z;
      }
      double product(double x, double y)
      {
          return x*y;
      }
  }
   }