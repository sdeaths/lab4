package com.example.lab4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lab4.databinding.FragmentSecondScreenBinding;

import java.util.ArrayList;
import java.util.List;

public class SecondScreenFragment extends Fragment {
    private FragmentSecondScreenBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSecondScreenBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<CosmeticListItem> listItems = new ArrayList<>();
        String[] categoryTitles = {"Косметика", "Еда", "Акссесуары"};
        for (int i = 0; i < 200; i++) {
            listItems.add(new CosmeticListItem(R.drawable.lipstick, categoryTitles[(int) (Math.random() * categoryTitles.length)]));
        }
        CategoryListAdapter adapter = new CategoryListAdapter(getContext(), R.layout.item_cosmetic_list, listItems);
        binding.categoryList.setAdapter(adapter);
    }
}
