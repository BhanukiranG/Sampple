package com.example.recyclerview.ui.home;

import static com.example.recyclerview.R.*;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView,recyclerView2,recyclerView3,recyclerView4;
    private HomeAdapter adapter;
    private Text2TextAdapter adapter2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(layout.fragment_home, container, false);

        recyclerView = view.findViewById(id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView2=view.findViewById(id.recyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView3=view.findViewById(id.recyclerView3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
//        recyclerView4=view.findViewById(id.recyclerView4);
//        recyclerView4.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        // Replace this with your actual data
        List<ImageTextItem> data = new ArrayList<>();
        data.add(new ImageTextItem(drawable.plane, "Apply Leave"));
        data.add(new ImageTextItem(drawable.ticket, "Raise Ticket"));
        data.add(new ImageTextItem(drawable.receipt, "Raise Expense"));
        data.add(new ImageTextItem(drawable.poll, "Leave Balance"));
        adapter = new HomeAdapter(data);
        recyclerView.setAdapter(adapter);
        List<ImageTextItem> data2 = new ArrayList<>();
        data2.add(new ImageTextItem(drawable.off, "Name1"));
        data2.add(new ImageTextItem(drawable.off, "Name2"));
        data2.add(new ImageTextItem(drawable.off, "Name3"));
        data2.add(new ImageTextItem(drawable.off, "Name4"));
        data2.add(new ImageTextItem(drawable.off, "Name5"));
        data2.add(new ImageTextItem(drawable.off, "Name6"));
        data2.add(new ImageTextItem(drawable.off, "Name7"));
        data2.add(new ImageTextItem(drawable.off, "Name8"));
        adapter = new HomeAdapter(data2);
        recyclerView2.setAdapter(adapter);
        List<ImageTextItem> data3 = new ArrayList<>();
        data3.add(new ImageTextItem(drawable.bd, "Name1"));
        data3.add(new ImageTextItem(drawable.bd, "Name2"));
        data3.add(new ImageTextItem(drawable.bd, "Name3"));
        data3.add(new ImageTextItem(drawable.bd, "Name4"));
        data3.add(new ImageTextItem(drawable.bd, "Name5"));
        data3.add(new ImageTextItem(drawable.bd, "Name6"));
        data3.add(new ImageTextItem(drawable.bd, "Name7"));
        data3.add(new ImageTextItem(drawable.bd, "Name8"));
        adapter = new HomeAdapter(data3);
        recyclerView3.setAdapter(adapter);
//        List<Text2TextItem> data4 = new ArrayList<>();
//        data4.add(new Text2TextItem( "Name1","12"));
//        adapter2 = new Text2TextAdapter(data4);
//        recyclerView4.setAdapter(adapter2);


        recyclerView4 = view.findViewById(R.id.recyclerView4);

        List<Text2TextItem> cardItems = new ArrayList<>();

        cardItems.add(new Text2TextItem("holi","sunday"));
        cardItems.add(new Text2TextItem("Shivratri","Monday"));
        cardItems.add(new Text2TextItem("Raksha","Saturday"));
        Text2TextAdapter adapter = new Text2TextAdapter(cardItems);
        recyclerView4.setAdapter(adapter);

        recyclerView4.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));


        return view;
    }
}
