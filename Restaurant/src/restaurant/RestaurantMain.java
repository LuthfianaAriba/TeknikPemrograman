/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @author ASUS
 */
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        
        menu.tambahMenuMakanan("Pizza", 250000, 20);
        Restaurant.nextId();
        
        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        Restaurant.nextId();
        
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);
        
        menu.tampilMenuMakanan();
    }
}