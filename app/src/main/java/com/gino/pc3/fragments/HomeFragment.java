package com.gino.pc3.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.LinearLayout;

import com.gino.pc3.R;

import com.gino.pc3.databinding.FragmentHomeBinding;
import com.gino.pc3.model.Shows;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RVPlatillosAdapter adapter = new RVPlatillosAdapter(getData());
        binding.rvPlatillo.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.rvPlatillo.setLayoutManager(layoutManager);
    }

    private List<Shows> getData() {
        List<Shows> shows = new ArrayList<>();
        shows.add(new Shows("Hamburguesa","https://d31npzejelj8v1.cloudfront.net/media/catalog/product/b/a/base-bembos-clasica_1.jpg",8));
        shows.add(new Shows("Salchipapa","https://www.peru.travel/Contenido/Uploads/salchipapa-interior-2_637612665363329300.jpg",12));
        shows.add(new Shows("Salchipollo","https://1.bp.blogspot.com/-BXmdE7adEPM/YRyUAcQcjuI/AAAAAAAAQS0/JNnTk3AKQ7krHhl3-eJGlSpNUF2CM2GUgCLcBGAsYHQ/s800/salchipollo.jpg",14));
        return shows;
    }

}
