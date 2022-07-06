package javaClass.Bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Application {
    private static ArrayList<HangHoa> list = new ArrayList<>();
    public Application(){
    }
    public Date outPutDay(){
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        Date date2=null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            date2 = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date2;
    }
    public void checkDay(Date homnay,Date hethan){
        Boolean check = homnay.equals(hethan);
        if(check){
            System.out.println("Đã hết hạn");
        }else {
            System.out.println("Chưa hết hạn");
        }
    }
    public static void menu(){
        System.out.println("1. Input\n2. Printf\n3. Check");
    }
    public static void main(String[] args) {
        Application application = new Application();
        Scanner sc = new Scanner(System.in);
        HangHoa hangHoa = new HangHoa();
        application.menu();
        while (true){
            System.out.println("chọn :");
            int a = sc.nextInt();
            switch (a){
                case 1:
                    System.out.println("Nhập mã hàng :");
                    int mahang = sc.nextInt();
                    System.out.println("Nhập tên hàng :");
                    String name = sc.next();
                    System.out.println("Nhập đồng giá :");
                    int donggia = sc.nextInt();
                    System.out.println("Nhập ngày sản xuất");
                    Date nhap = application.outPutDay();
                    System.out.println("Nhập ngày hết hạn");
                    Date nhap1 = application.outPutDay();
                    list.add(new HangHoa(mahang,name,donggia,nhap,nhap1));
                    menu();
                    break;
                case 2:
                    for (HangHoa h : list) {
                        System.out.println(h.toString());
                    }
                    menu();
                    break;
                case 3:
                    System.out.println("Nhập Thực Phẩm cần check");
                    String thucpham = sc.next();
                    for (HangHoa hangHoa1: list) {
                        if (Objects.equals(hangHoa1.getTen(), thucpham)) {
                            System.out.println("Nhập ngày hôm nay");
                            Date homnay = application.outPutDay();
                            application.checkDay(homnay,hangHoa.getNgayHetHan());
                        }
                    }
                    menu();
                    break;
                case 4:
                    System.exit(0);
                    break;

            }
        }
    }
}
