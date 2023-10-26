import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
    Random random = new Random();
        int[] diz1 = new int[random.nextInt(5) + 1];
        int[] diz2 = new int[random.nextInt(5) + 1];
        int[] topdiz = new int[Math.max(diz1.length, diz2.length)];

        for (int i = 0; i < diz1.length; i++)
         {
             diz1[i] = random.nextInt(10) + 1;
        }

        for (int i = 0; i < diz2.length; i++)
         {
             diz2[i] = random.nextInt(10) + 1;
        }

        for (int i = 0; i < diz1.length; i++)
        {
            topdiz[i] += diz1[i];
        }

        for (int i = 0; i < diz2.length; i++)
        {
            topdiz[i] += diz2[i];
        }

        int carpim = 0;
        for (int i = 0; i < diz1.length; i++)
        {
            if (i < diz2.length)
            {
                carpim += diz1[i] * diz2[i];
             }
        }
        System.out.println("---------------------------");
        System.out.println("Dizi 1: " + java.util.Arrays.toString(diz1));
        System.out.println("Dizi 2: " + java.util.Arrays.toString(diz2));
        System.out.println("Toplamları (+): " + java.util.Arrays.toString(topdiz));
        System.out.println("Çarpımları (*): " + carpim);
        System.out.println("---------------------------");
        System.out.println("MUHAMMED ALI HANBABA");
    }
}

/*İrregular array = farklı uzunluğa sahip olabilen düzensiz dizidir.
**Math.max fonk   = x=5, y=3 diyelim bu fonksiyon yüksek değere sahip olan değişkeni kullanır yani Buyukoolansayi= 5 kullanır.
*java.util.arrays = İmport ettiğimiz, Çıkan dizi sonucunun Konsola yazdırmak istediğimizde kodumuzda kullanırız.
*Dizi boyutu      = dizinin kaç eleman oldgunu belirtir.
*Random random = new Random() = Rastgele sayı üretmek için kullanıyoruz nextInt(100) olsaydi eger 0-99 arası sayı belirler di.
*-----
* Dizi 1: [9, 10, 6, 9, 6]
* Dizi 2: [4, 3, 3]
* Çarpım şu şekilde çalışır = 9 * 4 = 36, 10 * 3 = 30, 6 * 3= 18, çarpım sonuçlarını toplarız ve konsoola yansıtırız. ve konsola 84 yazdırılıır
*-----
* For dongusunu neden tercih ettim ? = iki dizinin elenanlarını karşılaştrmak için ve işlem yapmak için daha uygun gördüğümden dolayı for dongusunu kullandım.
*TEŞEKKÜRLER.
*  */
