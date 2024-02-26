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

public class MymcqsAdapter extends RecyclerView.Adapter<MymcqsAdapter.mcqs> {

    ArrayList<MymcqsModel> mymcqsModels;
    Context context;
    public MymcqsAdapter(ArrayList<MymcqsModel> mymcqsModels,Context context)
    {
        this.mymcqsModels=mymcqsModels;
        this.context=context;
    }

    @NonNull
    @Override
    public MymcqsAdapter.mcqs onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.my_mcqs,parent,false);
        return new mcqs(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MymcqsAdapter.mcqs holder, int position) {
        MymcqsModel mymcqsModel= mymcqsModels.get(position);
        holder.textView.setText(mymcqsModel.questions);




    }

    @Override
    public int getItemCount() {
        return mymcqsModels.size();
    }

    public class mcqs extends RecyclerView.ViewHolder {
        TextView textView;


        public mcqs(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.texts);


        }
    }
}
