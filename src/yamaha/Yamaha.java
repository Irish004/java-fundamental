/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yamaha;

import data.Exciter;
import data.MyMotor;
import data.Sirius;
import java.util.Scanner;

public class Yamaha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exciter e=new Exciter();
        Sirius s=new Sirius();
        MyMotor arrMotor[]=new MyMotor[5000];
        int choice,count=0;
        Scanner sc=new Scanner(System.in);
        do{
            menu();
            choice=Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    e.inputEx();
                    break;
                case 2:
                    s.inputSi();
                    break;
                case 3:
                    e.displayEx();
                    break;
                case 4:
                    s.displaySi();
                    break;
                case 5:
                    System.out.println("Nhập mã xe exciter cần tìm: ");
                    String searchExciterCode = sc.nextLine();
                    e.searchExciter(searchExciterCode);
                    break;
                case 6:
                    System.out.print("Nhập mã xe sirius cần tìm: ");
                    String searchSiriusCode = sc.nextLine();
                    s.searchSirius(searchSiriusCode);
                    break;
                default:
                    System.out.println("Good Bye!!!");
                    break;
            }
        }while(choice<7);
    }
    public static void menu(){
        System.out.println("1. Nhập thông tin xe Exciter");
        System.out.println("2. Nhập thông tin xe Sirius");
        System.out.println("3. Hiển thị thông tin xe Exciter");
        System.out.println("4. Hiển thị thông tin xe Sirius");
        System.out.println("5. Tìm kiếm xe Exciter");
        System.out.println("6. Tìm kiếm xe Sirius");
        System.out.println("7. Thoát chương trình");
        System.out.println("Lựa chọn của bạn:");
    }
    
}
