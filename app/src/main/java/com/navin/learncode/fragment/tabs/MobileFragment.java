package com.navin.learncode.fragment.tabs;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.navin.learncode.R;
import com.navin.learncode.adapter.MainAdapter;
import com.navin.learncode.utils.WebCategory;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MobileFragment extends Fragment {


    public MobileFragment() {
        // Required empty public constructor
    }
    @BindView(R.id.recycler)
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_mobile, container, false);
        ButterKnife.bind(this,view);
        MainAdapter mainAdapter=new MainAdapter(getActivity(), WebCategory.getAllMobile());
        recyclerView.setAdapter(mainAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL
        ,false));


        return view;
    }

}
