package com.example.mynabers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ollNeighbors extends Fragment {

    private RecyclerView myRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    static final String keybundel = "keybundel";
    private ArrayList<neighbor> myNeighbors = arreyNeighbor();

    private ollNeighbors() {
    }

    public static ollNeighbors newInstansOllNeighbors(boolean bul){
        ollNeighbors newOllNeighbors = new ollNeighbors();
        Bundle be = new Bundle();
        be.putBoolean(ollNeighbors.keybundel,bul);
        newOllNeighbors.setArguments(be);
        return newOllNeighbors;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vieww = inflater.inflate(R.layout.fragment,container,false);

        if (getArguments().getBoolean(ollNeighbors.keybundel)){
            ArrayList<neighbor> newNeighbors = new ArrayList<>();
            for (int ii = 0; ii < myNeighbors.size() ; ii++) {
                if (myNeighbors.get(ii).isFaivorit()){
                    newNeighbors.add(myNeighbors.get(ii));
                }
            }
            myNeighbors = newNeighbors;
        }

        myRecyclerView = vieww.findViewById(R.id.my_recycler_view);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new recyclerAdapter(myNeighbors,getContext());
        myRecyclerView.setAdapter(mAdapter);

        return vieww;
    }

    private ArrayList<neighbor> arreyNeighbor() {
        ArrayList <neighbor> arreyNeighbors = new ArrayList<neighbor>();
//        arreyNeighbors.add(new neighbor("Bibi","Ntanyau","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Benyamin_Netanyahu%2C_FOJ_2019_%2848238884272%29_%28cropped%29.jpg/220px-Benyamin_Netanyahu%2C_FOJ_2019_%2848238884272%29_%28cropped%29.jpg"));
//        arreyNeighbors.add(new neighbor("Beny","Gantz","https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Benny_Gantz_2019.jpg/250px-Benny_Gantz_2019.jpg"));
//        arreyNeighbors.add(new neighbor("Naftali","Benet","https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Naftali-Bennett.jpg/200px-Naftali-Bennett.jpg"));
//        arreyNeighbors.add(new neighbor("Yahakov","Litzman","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/%D7%94%D7%A8%D7%91_%D7%99%D7%A2%D7%A7%D7%91_%D7%9C%D7%99%D7%A6%D7%9E%D7%9F.jpg/220px-%D7%94%D7%A8%D7%91_%D7%99%D7%A2%D7%A7%D7%91_%D7%9C%D7%99%D7%A6%D7%9E%D7%9F.jpg"));
//        arreyNeighbors.add(new neighbor("Moshe","Gafni","pload.wikimedia.org/wikipedia/commons/thumb/d/d0/Gafni_%28cropped%29.png/220px-Gafni_%28cropped%29.png"));
//        arreyNeighbors.add(new neighbor("Aryeh","Deray","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/%D7%90%D7%A8%D7%99%D7%94_%D7%93%D7%A8%D7%A2%D7%99_2.jpg/250px-%D7%90%D7%A8%D7%99%D7%94_%D7%93%D7%A8%D7%A2%D7%99_2.jpg"));
//        arreyNeighbors.add(new neighbor("Achmad","Tibi","https://upload.wikimedia.org/wikipedia/commons/3/35/Ahmad_Tibi.jpg"));
//        arreyNeighbors.add(new neighbor("Jamal","Zachalka","https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/%D7%92%27%D7%9E%D7%90%D7%9C_%D7%96%D7%97%D7%90%D7%9C%D7%A7%D7%94_%28cropped%29.JPG/250px-%D7%92%27%D7%9E%D7%90%D7%9C_%D7%96%D7%97%D7%90%D7%9C%D7%A7%D7%94_%28cropped%29.JPG"));

        arreyNeighbors.add(new neighbor("Bibi","Ntanyau","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Benyamin_Netanyahu%2C_FOJ_2019_%2848238884272%29_%28cropped%29.jpg/220px-Benyamin_Netanyahu%2C_FOJ_2019_%2848238884272%29_%28cropped%29.jpg"));

        return arreyNeighbors;
    }
}
