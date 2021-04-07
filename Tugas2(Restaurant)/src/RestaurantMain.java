import java.util.*;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		System.out.println("Restaurant menu:");
		menu.tampilMenuMakanan();
		Scanner in = new Scanner(System.in);
		String makanan;
		int bayar = 0;
		int jumlah;
		int choice = 1;
		while(true){
			System.out.println("Silahkan pesan makanan!");
			System.out.print("Nama Makanan: ");
			makanan = in.next();
			System.out.print("Jumlah: ");
			jumlah = in.nextInt();
			menu.Pemesanan(makanan, jumlah);
			bayar += menu.calculateprice(makanan, jumlah);
			System.out.println("Pesan lagi?");
			System.out.println("[1] Ya");
			System.out.println("[2] Tidak");
			choice = in.nextInt();
			if(choice == 2){
				break;
			}
		}
		System.out.println("Total Harga untuk bayar pesanan: Rp" + bayar);
		bayar = 0;
		while(true){
			System.out.println("Tambah Stok Makanan:");
			System.out.print("Nama Makanan: ");
			makanan = in.next();
			System.out.print("Jumlah: ");
			jumlah = in.nextInt();
			menu.addstok(makanan, jumlah);
			bayar += menu.calculateprice(makanan, jumlah);
			System.out.println("Pesan lagi?");
			System.out.println("[1] Ya");
			System.out.println("[2] Tidak");
			choice = in.nextInt();
			if(choice == 2){
				break;
			}
		}
		System.out.println("Total Harga untuk menambah stok: Rp" + bayar);
		System.out.println("Informasi Stok Setelah Pemesanan");
		menu.tampilMenuMakanan();
		in.close();
	}
}
