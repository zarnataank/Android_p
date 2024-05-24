package com.example.projectZarna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.R;

import java.util.ArrayList;
import java.util.List;

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
        holder.textView.setText((CharSequence) mymcqsModel.questions);
        holder.textViewtwo.setText((CharSequence) mymcqsModel.answer);
        boolean isExpnaded=mymcqsModels.get(position).isExpandable();
        holder.expandaleLayout.setVisibility(isExpnaded? View.VISIBLE:View.GONE);

    }

    @Override
    public int getItemCount() {
        return mymcqsModels.size();
    }

    public class mcqs extends RecyclerView.ViewHolder {
        TextView textView,textViewtwo;
      ConstraintLayout expandaleLayout;

        public mcqs(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.question);
            textViewtwo=itemView.findViewById(R.id.answer);
            expandaleLayout=itemView.findViewById(R.id.expandable);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MymcqsModel mymcqsModel=mymcqsModels.get(getAdapterPosition());
                    mymcqsModel.setExpandable(!mymcqsModel.isExpandable());
                    notifyItemChanged(getAdapterPosition());

                }
            });



        }
    }
}
