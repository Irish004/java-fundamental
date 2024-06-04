/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;


public class Exciter extends MyMotor {

    private int warranty;
    private Scanner sc = new Scanner(System.in);
    private Exciter arrEx[] = new Exciter[5000];
    private int count = 0;

    public Exciter() {
    }

    public Exciter(int warranty, String code, String name, int capacity, String type) {
        super(code, name, capacity, type);
        this.warranty = warranty;
    }

    public Exciter(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return String.format("|%-10s|%-10s|%5d|%-10s|%5d|\n", code, name, capacity, type, warranty);
    }

    public void inputEx() {
        InputInfo();
        do {
            System.out.print("Nhập thời gian bảo hành (>= 1 năm): ");
            warranty = sc.nextInt();
            sc.nextLine();
        } while (warranty < 1);
        arrEx[count] = new Exciter(warranty, code, name, capacity, type);
        count++;
    }

    public void displayEx() {
        for (int i = 0; i < count; i++) {
            System.out.println(arrEx[i]);
        }
    }

    public void searchExciter(String code) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (arrEx[i].getCode().equals(code)) {
                System.out.println(arrEx[i]);
                found = true;
            }
            break;
        }
        if (!found) {
            System.out.println("Không tìm thấy xe Exciter có mã: " + code);
        }
    }

}
