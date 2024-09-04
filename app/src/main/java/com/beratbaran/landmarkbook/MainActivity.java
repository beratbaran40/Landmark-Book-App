package com.beratbaran.landmarkbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.beratbaran.landmarkbook.databinding.ActivityDetailsBinding;
import com.beratbaran.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmarks> landmarksArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarksArrayList = new ArrayList<>();

        //Data
        Landmarks eiffeltower = new Landmarks("Eiffel Tower \uD83C\uDDEB\uD83C\uDDF7", "France ",R.drawable.eiffeltower);
        Landmarks tajmahal = new Landmarks("Taj Mahal \uD83C\uDDEE\uD83C\uDDF3", "India ",R.drawable.tajmahal);
        Landmarks petra = new Landmarks("Petra \uD83C\uDDEF\uD83C\uDDF4", "Jordan ",R.drawable.petra);
        Landmarks stonehenge = new Landmarks("Stonehenge \uD83C\uDDEC\uD83C\uDDE7", "England ",R.drawable.stonehenge);
        Landmarks statueofliberty = new Landmarks("Statue of Liberty \uD83C\uDDFA\uD83C\uDDF8", "USA",R.drawable.statueofliberty);
        Landmarks pyramidsofgiza = new Landmarks("Pyramids of Giza \uD83C\uDDEA\uD83C\uDDEC", "Egypt",R.drawable.pyramidsofgiza);
        Landmarks machupicchu = new Landmarks("Machupicchu \uD83C\uDDF5\uD83C\uDDEA", "Mexico",R.drawable.machupicchu);
        Landmarks greatwallofchina = new Landmarks("Great Wall of China \uD83C\uDDE8\uD83C\uDDF3", "China",R.drawable.greatwallofchina);
        Landmarks christtheredeeme = new Landmarks("Christ the Redeeme \uD83C\uDDE7\uD83C\uDDF7", "Brazil",R.drawable.christtheredeeme);
        Landmarks pisa = new Landmarks("Pisa Tower \uD83C\uDDEE\uD83C\uDDF9", "Italy",R.drawable.pisa);
        Landmarks sydneyopera = new Landmarks("Sydney Opera House \uD83C\uDDE6\uD83C\uDDFA", "Australia", R.drawable.sydneyopera);
        Landmarks colosseum = new Landmarks("Colosseum \uD83C\uDDEE\uD83C\uDDF9", "Italy", R.drawable.colosseum);
        Landmarks mountfuji = new Landmarks("Mount Fuji \uD83C\uDDEF\uD83C\uDDF5", "Japan", R.drawable.mountfuji);
        Landmarks santorinicaldera = new Landmarks("Santorini Caldera \uD83C\uDDEC\uD83C\uDDF7", "Greece", R.drawable.santorinicaldera);
        Landmarks salaruyuni = new Landmarks("Salar de Uyuni \uD83C\uDDE7\uD83C\uDDF4", "Bolivia", R.drawable.salaruyuni);
        Landmarks angkorwat = new Landmarks("Angkor Wat \uD83C\uDDF0\uD83C\uDDED", "Cambodia", R.drawable.angkorwat);
        Landmarks mountkilimanjaro = new Landmarks("Mount Kilimanjaro \uD83C\uDDF9\uD83C\uDDFF", "Tanzania", R.drawable.mountkilimanjaro);
        Landmarks venicecanals = new Landmarks("Canals of Venice \uD83C\uDDEE\uD83C\uDDF9", "Italy", R.drawable.venicecanals);
        Landmarks empirestate = new Landmarks("Empire State Building \uD83C\uDDFA\uD83C\uDDF8", "USA", R.drawable.empirestate);
        Landmarks buringkhalifa = new Landmarks("Burj Khalifa \uD83C\uDDE6\uD83C\uDDEA", "UAE", R.drawable.buringkhalifa);
        Landmarks hagiasophia = new Landmarks("Hagia Sophia \uD83C\uDDF9\uD83C\uDDF7", "Turkey", R.drawable.hagiasophia);
        Landmarks cappadocia = new Landmarks("Cappadocia \uD83C\uDDF9\uD83C\uDDF7", "Turkey", R.drawable.cappadocia);
        Landmarks pamukkale = new Landmarks("Pamukkale \uD83C\uDDF9\uD83C\uDDF7", "Turkey", R.drawable.pamukkale);
        Landmarks mountnemrut = new Landmarks("Mount Nemrut \uD83C\uDDF9\uD83C\uDDF7", "Turkey", R.drawable.mountnemrut);
        Landmarks grandcanyon = new Landmarks("Grand Canyon \uD83C\uDDFA\uD83C\uDDF8", "USA", R.drawable.grandcanyon);
        Landmarks victoriafalls = new Landmarks("Victoria Falls \uD83C\uDDFF\uD83C\uDDF2/\uD83C\uDDFF\uD83C\uDDFC", "Zambia/Zimbabwe", R.drawable.victoriafalls);
        Landmarks galapagosislands = new Landmarks("Galapagos Islands \uD83C\uDDEA\uD83C\uDDE8", "Ecuador", R.drawable.galapagosislands);
        Landmarks easterisland = new Landmarks("Easter Island \uD83C\uDDE8\uD83C\uDDF1", "Chile", R.drawable.easterisland);
        Landmarks banffnationalpark = new Landmarks("Banff National Park \uD83C\uDDE8\uD83C\uDDE6", "Canada", R.drawable.banffnationalpark);
        Landmarks alhambra = new Landmarks("Alhambra \uD83C\uDDEA\uD83C\uDDF8", "Spain", R.drawable.alhambra);

        landmarksArrayList.add(eiffeltower);
        landmarksArrayList.add(tajmahal);
        landmarksArrayList.add(petra);
        landmarksArrayList.add(stonehenge);
        landmarksArrayList.add(statueofliberty);
        landmarksArrayList.add(pyramidsofgiza);
        landmarksArrayList.add(machupicchu);
        landmarksArrayList.add(greatwallofchina);
        landmarksArrayList.add(christtheredeeme);
        landmarksArrayList.add(pisa);
        landmarksArrayList.add(sydneyopera);
        landmarksArrayList.add(colosseum);
        landmarksArrayList.add(mountfuji);
        landmarksArrayList.add(santorinicaldera);
        landmarksArrayList.add(salaruyuni);
        landmarksArrayList.add(angkorwat);
        landmarksArrayList.add(mountkilimanjaro);
        landmarksArrayList.add(venicecanals);
        landmarksArrayList.add(empirestate);
        landmarksArrayList.add(buringkhalifa);
        landmarksArrayList.add(hagiasophia);
        landmarksArrayList.add(cappadocia);
        landmarksArrayList.add(pamukkale);
        landmarksArrayList.add(mountnemrut);
        landmarksArrayList.add(grandcanyon);
        landmarksArrayList.add(victoriafalls);
        landmarksArrayList.add(galapagosislands);
        landmarksArrayList.add(easterisland);
        landmarksArrayList.add(banffnationalpark);
        landmarksArrayList.add(alhambra);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarksArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);



        /*

        //Adapter
        //Listview

        //Mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarksArrayList.stream().map(landmarks -> landmarks.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, landmarksArrayList.get(position).name, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("landmark", landmarksArrayList.get(position));
                startActivity(intent);
            }
        });

        */


    }
}