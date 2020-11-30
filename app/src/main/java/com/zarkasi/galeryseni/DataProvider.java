package com.zarkasi.galeryseni;


import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import com.zarkasi.galeryseni.model.Senibudaya;
import com.zarkasi.galeryseni.model.Tarian;
import com.zarkasi.galeryseni.model.Rumah;

public class DataProvider {
    private static List<Senibudaya> senibudayas = new ArrayList<>();

    private static List<Tarian> initDataTari(Context ctx) {
        List<Tarian> tarians = new ArrayList<>();
        tarians.add(new Tarian("Kecak", " Berasal dari bali ",
                "Jenis tarian satu ini menggambarkan tentang cerita Pewayangan, khususnya untuk cerita Ramayana yang dipertunjukan dengan seni gerak dan tarian.\n" +
                        "Tari Kecak biasanya dimainkan oleh sekelompok penari laki-laki yang duduk berbaris melingkar yang diiringi dengan irama menyerukan “cak” ketika mengangkat kedua lengan untuk menggambarkan kisah Ramayana ketika barisan kera membantu Rama melawan Rahwana.\n", R.drawable.tari_kecak));
        tarians.add(new Tarian("Jaipong", "Berasal dari Jawa barat ",
                "Diciptakan oleh Seniman berdarah Sunda, Gugum Gumbira dan Haji Suanda, tarian ini merupakan gabungan dari beberapa kesenian seperti Wayang Golek, Pencak Silat, dan Ketuk Tilu.", R.drawable.tari_jaipong));
        tarians.add(new Tarian("Reog Ponorogo", "Berasal dari Jawa Timur ",
                "di gerbang kota Ponorogo kamu akan bisa melihat hiasan sosok warok dan gemblak yang merupakan dua sosok yang ikut tampil pada saat tari Reog dipertunjukan.\n" +
                        "Reog merupakan salah satu dari 34 tari tradisional asal Indonesia yang masih sangat kental dengan hal-hal yang berbau mistis serta ilmu kebatinan yang kuat.\n", R.drawable.tari_reogponorogo));
        tarians.add(new Tarian("Saman Meuseukat", "Berasal dari Banda Aceh ",
                "Tari Saman merupakan salah satu tari tradisional asal Indonesia yang bahkan sudah cukup dikenal di seluruh mancanegara.\n" +
                        "Tarian satu ini merupakan sebuah tarian suku Gayo yang biasa ditampilkan ketika perayaan peristiwa-peristiwa penting di dalam adat.\n" +
                        "Maka dari itu, syair yang terdapat di dalam salah satu tarian dari 34 tari tradisional asal Indonesia ini menggunakan Bahasa Gayo.\n", R.drawable.tari_saman_meuseukat));
        tarians.add(new Tarian("Sekapur Sirih", "Berasal dari Jambi Kepulauan Riau ",
                "Tari Sekapur Sirih merupakan tari tradisional asal Indonesia yang berasal dari Provinsi Jambi, Kepulauan Riau dan Riau.\n" +
                        "Tarian ini biasanya menjadi tarian selamat datang guna menyambut para tamu-tamu besar yang hadir di sebuah acara.\n", R.drawable.tari_sekapur));
        return tarians;
    }

    private static List<Rumah> initDataRumah(Context ctx) {
        List<Rumah> rumahs = new ArrayList<>();
        rumahs.add(new Rumah("Balon", "Berasal dari Sumatera Utara ",
                "Rumah balon adalah rumah khas sumatera utara yang berasal dari batak. Ada juga beberapa jenis rumah balon dan memiliki gaya arsitektur rumah orang batak.", R.drawable.rumah_balon));
        rumahs.add(new Rumah("Rumah Gadang", "Berasal dari Sumatera Barat ",
                "Rumah gadang adalah rumah adat yang berasal dari Minangkabau, yang hingga kini masih banyak di temui di Provinsi Sumatra Barat. Nah rumah gadang juga ada di Malaysia, karena kebudayaan melayu dulu menyebar sampai Semenanjung Melaya.", R.drawable.rumah_gadang));
        rumahs.add(new Rumah("Krong Bade", "Berasal dari Nanggroe Aceh Darussalam",
                "Rumah adat Nangroe Aceh Darussalam atau biasa dikenal dengan rumah adat kronge bade berasal dari Provinsi paling barat di indonesia, yaitu Nangroe Aceh Darussalam.", R.drawable.rumah_krongbade));
        rumahs.add(new Rumah("Rakit Limas", "Berasal dari Bangka Belitung",
                "Rumah adat Bangka Belitung yang merupakan daerah pulau, sehingga menambahkan pada aksen rakit, sebagai pembeda dan penanda, untuk mennjukan ciri khas bangka belitung bahwa banka belitung memiliki rumah adat yang berbeda dan unik.", R.drawable.rumah_rakitlimas));
        rumahs.add(new Rumah("Panggung Kanjang Leko", "Berasal dari Jambi",
                "Rumah adat panggung kajang leko, adalah rumah  yang berasal dari provonsi Jambi. Rumah ini merupakan rumah adat yang cukup lengkap, karena didalam rumah in, memiliki 8 ruangan di dalamnya.", R.drawable.rumah_panggungkanjangleko));
                return rumahs;
    }




    private static void initAllHewans(Context ctx) {
        senibudayas.addAll(initDataTari(ctx));
        senibudayas.addAll(initDataRumah(ctx));

    }

    public static List<Senibudaya> getAllHewan(Context ctx) {
        if (senibudayas.size() == 0) {
            initAllHewans(ctx);
        }
        return senibudayas;
    }

    public static List<Senibudaya> getHewansByTipe(Context ctx, String jenis) {
        List<Senibudaya> hewansByType = new ArrayList<>();
        if (senibudayas.size() == 0) {
            initAllHewans(ctx);
        }
        for (Senibudaya h : senibudayas) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
