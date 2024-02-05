package com.julen.ejercicio2_tyv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
/**
 * Este fragmento se utiliza para representar una sección en la interfaz de usuario.
 * Cada sección se identifica por un número de sección que se pasa como argumento al crear una instancia de este fragmento.
 */
public class PlaceholderFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Constructor requerido vacío.
     */
    public PlaceholderFragment() {
        // Required empty public constructor
    }

    /**
     * Crea una nueva instancia de este fragmento.
     *
     * @param sectionNumber El número de sección que identifica a este fragmento.
     * @return Una nueva instancia de PlaceholderFragment.
     */
    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * Se llama cuando se está creando el fragmento.
     *
     * @param savedInstanceState Si el fragmento se está recreando a partir de un estado guardado anteriormente, este es el estado.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * Se llama para tener el fragmento instanciar su interfaz de usuario.
     *
     * @param inflater El objeto LayoutInflater se puede usar para inflar cualquier vista en el fragmento.
     * @param container Si no es nulo, esta es la vista principal a la que se debe adjuntar la interfaz de usuario del fragmento.
     * @param savedInstanceState Si no es nulo, este fragmento se está recreando a partir de un estado guardado anteriormente.
     * @return Devuelve la vista para la interfaz de usuario del fragmento, o null.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    /**
     * Se llama inmediatamente después de que onCreateView(LayoutInflater, ViewGroup, Bundle) ha devuelto, pero antes de que se haya restaurado cualquier estado guardado en la vista.
     *
     * @param view La vista devuelta por {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)}.
     * @param savedInstanceState Si no es nulo, este fragmento se está recreando a partir de un estado guardado anteriormente.
     */
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null && getArguments().containsKey(ARG_SECTION_NUMBER)) {
            int sectionNumber = getArguments().getInt(ARG_SECTION_NUMBER);
            TextView textView = view.findViewById(R.id.section_label);
            textView.setText("FRAGMENT " + String.valueOf(sectionNumber));
        }
    }
}