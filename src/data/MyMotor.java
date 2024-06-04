/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

public class MyMotor implements IMotor {

    public String code;
    public String name;
    public int capacity;
    public String type;
    Scanner sc = new Scanner(System.in);
    private MyMotor arr[]=new MyMotor[5000];
    private int count=0;

    public MyMotor(String code, String name, int capacity, String type) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public MyMotor() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("|%-10s|%-10s|%5d|%-10s|", code, name, capacity, type);
    }

    @Override
    public void InputInfo() {
            do {
                System.out.print("Nhập mã xe (tối thiểu 4 ký tự): ");
                code = sc.nextLine();
            } while (code.length() < 4 || checkCode());
            do {
                System.out.print("Nhập tên xe (tối thiểu 6 ký tự): ");
                name = sc.nextLine();
            } while (name.length() < 6);
            do {
                System.out.print("Nhập dung tích (>= 50): ");
                capacity = sc.nextInt();
                sc.nextLine();
            } while (capacity < 50);
            do {
                System.out.print("Nhập loại xe (Xe số hoặc Xe ga): ");
                type = sc.nextLine();
            } while (!type.equals("Xe số") && !type.equals("Xe ga"));
            arr[count]=new MyMotor(code, name, capacity, type);
            count++;
    }

    @Override
    public void DisplayInfo() {
        System.out.printf("|%-10s|%-10s|%5d|%-10s|", code, name, capacity, type);
    }
    
    public boolean checkCode(){
        for (int i = 0; i < count; i++) {
            if(arr[i].getCode().equalsIgnoreCase(code)){
                return true;
            }
        }
        return false;
    }
}
