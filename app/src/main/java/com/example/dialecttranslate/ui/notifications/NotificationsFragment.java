package com.example.dialecttranslate.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.dialecttranslate.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NotificationsFragment extends Fragment {


    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);


        ListView myListView = (ListView)root.findViewById(R.id.translations);


        // Instanciating an array list (you don't need to do this,
        // you already have yours).
        List<String> your_array_list = new ArrayList<String>();
        your_array_list.add("Saan ka");
        your_array_list.add("Halika na");
        your_array_list.add("Bilisan mo");
        your_array_list.add("Marami");
        your_array_list.add("Malamig");
        your_array_list.add("Ang lamig lamig");
        your_array_list.add("Mabango");
        your_array_list.add("Baliw");
        your_array_list.add("Kawawa");
        your_array_list.add("Lolo");
        your_array_list.add("Lola");
        your_array_list.add("Pagkain");
        your_array_list.add("Kapatid");
        your_array_list.add("Matangkad");
        your_array_list.add("Pandak");
        your_array_list.add("Sakit");
        your_array_list.add("Nagkasakit");


        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1,
                your_array_list );

        myListView.setAdapter(arrayAdapter);
        return root;
    }
}