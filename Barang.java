import java.util.Scanner;
import java.util.Arrays;

public class Barang {
    String Nama;
    int Kode,Harga;
    Barang next;
    public static Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan Kode Barang\t: ");
        Kode=in.nextInt();
        System.out.print("Masukkan Nama Barang\t: ");
        Nama=str.nextLine();
        System.out.print("Masukkan Harga Barang\t: ");
        Harga=in.nextInt();
        next=null;
    }
    public void view(){
        System.out.println("Kode Barang     : "+Kode); 
        System.out.println("Nama Barang     : "+Nama);
        System.out.println("Harga Barang    : "+Harga);
    }
    public static void main(String[] args) {
        int Pilih=0;
        linked st=new linked();
        while(Pilih!=4){
            System.out.println("1. Push:");
            System.out.println("2. Pop :");
            System.out.println("3. View :");
            System.out.println("4. Exit :");
            System.out.println("Pilih :");
            Pilih=in.nextInt();
            if(Pilih==1){
                Barang baru=new Barang();
                baru.input();
                st.push(baru);
            }
            else if(Pilih==2) st.pop();
            else if(Pilih==3) st.view();
            else if(Pilih==4) System.out.println("keluar ");
            System.out.println(" ");
        }
    }    
}
class linked{
    Barang top;
    public linked(){
        top=null;
    }
    public void push(Barang a){
        if(top==null) top=a;
        else{
            a.next=top;
            top=a;
        }
    }
    public void pop(){
        if(top==null) System.out.println("kosong");
        else{
            System.out.println("Popping Data . . .");
            top.view();
            top=top.next;
        }
    }
    public void view(){
        if(top==null) System.out.println("Data Tidak Ditemukan");
        else{
            Barang ptr=top;
            while(ptr!=null){
                System.out.println("---------------");
                ptr.view();
                ptr=ptr.next;
            }
        }
    }
}