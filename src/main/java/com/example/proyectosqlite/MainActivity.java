package com.example.proyectosqlite;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;  // Cambiar a ViewPager2
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;  // Cambiar a ViewPager2
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        // Configuramos el adaptador para manejar los fragments de cada pestaña
        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPagerAdapter.addFragment(new AgregarNotaFragment(), "Agregar Nota");
        viewPagerAdapter.addFragment(new VerNotasFragment(), "Ver Notas");
        viewPagerAdapter.addFragment(new EditarNotasFragment(), "Editar Notas");

        viewPager.setAdapter(viewPagerAdapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            // Aquí puedes personalizar los títulos de las pestañas
            switch (position) {
                case 0:
                    tab.setText("Agregar Nota");
                    break;
                case 1:
                    tab.setText("Ver Notas");
                    break;
                case 2:
                    tab.setText("Editar Notas");
                    break;
            }
        }).attach();



    }
}
