package W9;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try (JsonReader reader = new JsonReader(new FileReader("C:\\Users\\ACER\\Downloads\\barang.json"))){
            Barang obj = new Barang();
            List<Barang> dataBarang = obj.readBarangArray(reader);

            for (Barang barang : dataBarang){
                System.out.println(barang);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }

}          