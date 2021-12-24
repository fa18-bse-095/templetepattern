/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author fa18-bse-078
 */
class StoreOrder extends OrderProcessTemplate
{
 
    @Override
    public void doSelect()
    {
        System.out.println("Customer chooses the item from shelf.");
    }
 
    @Override
    public void doPayment()
    {
        System.out.println("Pays at counter through cash/POS");
    }
 
    @Override
    public void doDelivery()
    {
        System.out.println("Item delivered to in delivery counter.");
    }
 
}
