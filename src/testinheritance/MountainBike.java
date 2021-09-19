/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinheritance;

/**
 *
 * @author HoangTN
 */
// Lớp dẫn xuất
public class MountainBike extends Bicycle{
        // Lớp con MountainBike thêm thuộc tính
    public int seatHeight;
 
    // Lớp MountainBike tạo 1 hàm khởi tạo
    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        // gọi hàm khởi tạo của lớp cơ sở 
        super(gear, speed);
        seatHeight = startHeight;
    }
 
    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
 
    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nChiều cao của ghế là "
                + seatHeight);
    }
}
 


