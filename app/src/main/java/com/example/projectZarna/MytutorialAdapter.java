package com.example.projectZarna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.R;

import java.util.ArrayList;

public class MytutorialAdapter extends RecyclerView.Adapter<MytutorialAdapter.MyviewHodler> {


    ArrayList<MytutorialModel> mytutorialmodel;
    Context context;
    public  MytutorialAdapter(ArrayList<MytutorialModel> mytutorialmodel,Context context)
    {

        this.mytutorialmodel=mytutorialmodel;
        this.context=context;
    }


    @NonNull
    @Override
    public MytutorialAdapter.MyviewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_view,parent,false);
        return new MyviewHodler(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MytutorialAdapter.MyviewHodler holder, int position) {

        MytutorialModel mytutorialModel=mytutorialmodel.get(position);
        holder.textView.setText(mytutorialModel.text);


    }

    @Override
    public int getItemCount() {

        return 15;
    }

    public class MyviewHodler extends RecyclerView.ViewHolder {
        TextView textView;
        public MyviewHodler(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.texts);
        }
    }
}
