/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;


public class Sirius extends MyMotor {

    private String color;
    private Scanner sc = new Scanner(System.in);
    private Sirius arrSi[] = new Sirius[5000];
    private int count = 0;

    public Sirius() {
    }

    public Sirius(String color, String code, String name, int capacity, String type) {
        super(code, name, capacity, type);
        this.color = color;
    }

    public Sirius(String color) {
        this.color = color;
    }

    public void inputSi() {
        InputInfo();
        do {
            System.out.print("Nhập màu xe (xanh, vàng, trắng): ");
            color = sc.nextLine();
        } while (!color.equals("xanh") && !color.equals("vàng") && !color.equals("trắng"));
        arrSi[count] = new Sirius(color, code, name, capacity, type);
        count++;
    }

    public void displaySi() {
        DisplayInfo();
        System.out.printf("%-10s|\n", color);
    }

    public void searchSirius(String code) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (arrSi[i].getCode().equals(code)) {
                System.out.println(arrSi[i]);
                found = true;
            }
            break;
        }
        if (!found) {
            System.out.println("Không ​tìm thấy xe Sirius có mã: " + code);
        }
    }
}
