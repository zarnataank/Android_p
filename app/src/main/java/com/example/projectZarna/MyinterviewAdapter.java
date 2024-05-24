package com.example.projectZarna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.R;

import java.util.ArrayList;

public class MyinterviewAdapter extends RecyclerView.Adapter<MyinterviewAdapter.interviews> {
    ArrayList<MyinterviewModel> myinterviewModelArrayList;
    Context context;

    public MyinterviewAdapter(ArrayList<MyinterviewModel> myinterviewModelArrayList,Context context)
    {
        this.myinterviewModelArrayList=myinterviewModelArrayList;
        this.context=context;

    }

    @NonNull
    @Override
    public interviews onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        @SuppressLint("ResourceType") View view=layoutInflater.inflate(R.layout.my_interview,parent,false);
        return new interviews(view);
    }

    @Override
    public void onBindViewHolder(@NonNull interviews holder, int position) {
        MyinterviewModel myinterviewModel=myinterviewModelArrayList.get(position);
        holder.textView.setText((CharSequence) myinterviewModel.questions);
        holder.textViewtwo.setText((CharSequence) myinterviewModel.answer);
        boolean isExpnaded=myinterviewModelArrayList.get(position).isExpnadable();
        holder.expnadable.setVisibility(isExpnaded? View.VISIBLE:View.GONE);

    }

    @Override
    public int getItemCount() {
        return myinterviewModelArrayList.size();
    }

    public class interviews extends RecyclerView.ViewHolder {
        TextView textView,textViewtwo;
        ConstraintLayout expnadable;

        public interviews(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.question);
            textViewtwo=itemView.findViewById(R.id.answer);
            expnadable=itemView.findViewById(R.id.expandable);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MyinterviewModel myinterviewModel=myinterviewModelArrayList.get(getAdapterPosition());
                    myinterviewModel.setExpnadable(!myinterviewModel.isExpnadable());
                    notifyItemChanged(getAdapterPosition());

                }
            });

        }
    }
}
