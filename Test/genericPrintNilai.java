package Test;

public class genericPrintNilai {
    
	   // Metoda main
	   public static void main(String[] args) {
	 
	      // Deklarasi dan pemberian nilai awal ke variabel
	      Integer varInt = 201524044;
	      Double varDouble = 1221.6383;
	      Character varChar = 'F';
	      String varString = "Belajar Java";
	 
	      System.out.println();
	      System.out.println("Nilai-nilai yang dicetak:");
	 
	      // Memanggil generic method print
	      print(varInt);
	      print(varDouble);
	      print(varChar);
	      print(varString);        
	   }
	 
	   // Generic method untuk mencetak nilai berbegai tipe
	   public static <T> void print(T nilai) {
	      System.out.println(nilai);
	   }
	}