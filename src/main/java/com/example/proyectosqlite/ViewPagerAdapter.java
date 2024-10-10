package com.example.proyectosqlite;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();

    public ViewPagerAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    // Método para añadir fragmentos y sus títulos
    public void addFragment(Fragment fragment, String title) {
        fragmentList.add(fragment);
        fragmentTitleList.add(title);
    }

    // Método que crea el fragmento en la posición dada
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentList.get(position);
    }

    // Retorna la cantidad de fragmentos
    @Override
    public int getItemCount() {
        return fragmentList.size();
    }

    // Método para obtener el título del fragmento en la posición dada
    public String getFragmentTitle(int position) {
        return fragmentTitleList.get(position);
    }
}
