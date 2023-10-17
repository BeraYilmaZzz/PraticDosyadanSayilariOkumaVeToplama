import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try{

            File file = new File("values.txt");
        try {
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("Dosya Oluşturuldu");
            } else {
                System.out.println("Dosya mevcut.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

            // Dosyaya sayıları yazdırıyoruz
            PrintWriter valueDocument = new PrintWriter(new FileWriter("values.txt"));

            valueDocument.println("5");
            valueDocument.println("10");
            valueDocument.println("20");
            valueDocument.println("12");
            valueDocument.println("33");

            valueDocument.close();

            //Dosya okuma işlemini yaptırıyoruz
            BufferedReader be = new BufferedReader(new FileReader("values.txt"));
            String row;
            int count = 0 ;

            //okunan her satır için toplama işlemini gerçekleştiriyoruz
            while ((row = be.readLine()) != null){
                int value = Integer.valueOf(row);
                count += value;
            }
            System.out.println("Toplam = " + count);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}