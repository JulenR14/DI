package com.julen.ejercicio2_tyv;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/**
 * Este adaptador se utiliza para gestionar las secciones de la interfaz de usuario.
 * Cada sección se representa como un fragmento.
 */
public class SectionsPagerAdapter extends FragmentStateAdapter {
    private final Context context;

    /**
     * Constructor del adaptador de secciones.
     *
     * @param context El contexto de la aplicación.
     * @param fragmentManager El administrador de fragmentos.
     * @param lifecycle El ciclo de vida del fragmento.
     */
    public SectionsPagerAdapter(Context context, FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        this.context = context;
    }

    /**
     * Devuelve el número de secciones.
     *
     * @return El número de secciones.
     */
    @Override
    public int getItemCount() {
        return 3;
    }

    /**
     * Crea el fragmento para la sección especificada.
     *
     * @param position La posición de la sección.
     * @return El fragmento para la sección.
     */
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            default:
                return new Fragment3();
        }
    }
}