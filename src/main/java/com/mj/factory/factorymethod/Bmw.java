package com.mj.factory.factorymethod;

import com.mj.factory.simplefactory.Car;

class Bmw implements Car {
   @Override
   public void driver() {
       System.out.println("Driving Bmw");
   }
}
