package com.example.recyclerviewpolije;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MoviesRecyclerViewAdapter adapter;
    ArrayList<Movies> objMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById((R.id.recyclerView));
// Membuat data yang akan di tampilkan di detail
        objMovies.add(new Movies("Teknik Infromatika", "Teknik Informatika","Trismayanti Dwi Puspitasari, S.Kom, M.Cs.","B", "Visi :\n" +
                "\n" +
                "“Menjadi program studi pada jenjang pendidikan diploma IV di bidang Teknik Informatika yang mampu mengembangkan ilmu pengetahuan dan teknologi terapan yang mendukung bidang agribisnis dan bidang lainnya.”\n" +
                "\n" +
                "Misi :\n" +
                "\n" +
                "1. Menyelenggarakan pendidikan vokasi yang menghasilkan sarjana terapan di bidang Teknik Informatika yang kompeten, profesional, bermoral dan berjiwa kewirausahaan.\n" +
                "2. Menyelenggarakan pengembangan ilmu pengetahuan dan teknologi terapan di bidang Teknik Informatika yang mendukung bidang agribisnis dan bidang lainnya yang mampu bersaing di tingkat nasional dan internasional.\n" +
                "3. Menyelenggarakan pendidikan vokasi yang berkarakter dan berkontribusi terhadap penguatan budaya akademis dengan menghasilkan lulusan di bidang Teknik Informatika yang berakhlak mulia, kompeten dan berjiwa wirausaha.\n" +
                "4. Mensinergikan keahlian bidang teknik informatika dengan bidang ilmu lainnya melalui pelaksanaan penelitian terapan.\n" +
                "5. Menyebarluaskan keterkinian teknologi dibidang teknik informatika melalui kegiatan pengabdian kepada masyarakat.\n" +
                "Tujuan\n" +
                "Menyelenggarakan pendidikan vokasi bidang informatika sehingga dapat menghasilkan lulusan yang :\n" +
                "\n" +
                "1. Mampu mengembangkan sistem informasi dan melakukan pengelolaan sumberdaya informasi dengan berbagai teknik dan metode.\n" +
                "2. Mampu membuat perangkat lunak baik berbasis desktop, website, maupun mobile untuk diterapkan pada berbagai bidang keilmuan.\n" +
                "3. Mampu melaksanakan tugas sebagai staf, penyelia, hingga menjalankan fungsi manajerial tingkat menengah dalam bidang informatika.\n" +
                "4. Memiliki kemampuan berwirausaha yang kompetitif dalam bidang informatika maupun bidang lainnya.\n", "25 Agustus 2007"));


        adapter = new MoviesRecyclerViewAdapter(objMovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}