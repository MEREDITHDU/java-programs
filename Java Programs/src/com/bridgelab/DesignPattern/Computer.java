/******************************************************************************
 *  Purpose: abstract class of Computer
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.DesignPattern;

public abstract class Computer {
 public abstract String getRAM();
 public abstract String getHDD();
 public abstract String getCPU();
 
 public String toString()
 {
	 return "RAM = " +this.getRAM() +", HDD = " + this.getHDD() +", CPU = "+ this.getCPU();
 }
}
