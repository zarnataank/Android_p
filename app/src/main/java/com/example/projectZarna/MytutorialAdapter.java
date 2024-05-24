package com.example.projectZarna;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.R;

import java.util.ArrayList;

public class MytutorialAdapter extends RecyclerView.Adapter<MytutorialAdapter.MyviewHodler> {


    ArrayList<MytutorialModel> mytutorialmodel;
    Context context;
    public  MytutorialAdapter(ArrayList<MytutorialModel> mytutorialmodel, FragmentActivity context)
    {

        this.mytutorialmodel=mytutorialmodel;
        this.context=context;
    }


    @NonNull
    @Override
    public MytutorialAdapter.MyviewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.myview,parent,false);
        return new MyviewHodler(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MytutorialAdapter.MyviewHodler holder, int position) {

        MytutorialModel mytutorialModel=mytutorialmodel.get(position);
        holder.textView.setText((CharSequence) mytutorialModel.text);
        switch (position)
        {
            case 0:
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(view.getContext(),Introduction.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 1:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(view.getContext(), Datatypes.class);
                        view.getContext().startActivity(intent);

                    }
                });
                break;
            case 2:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(view.getContext(),Controlstatements.class);
                        view.getContext().startActivity(intent);

                    }
                });
                break;
            case  3:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(view.getContext(),String.class);
                        view.getContext().startActivity(intent);

                    }
                });
                break;
            case 4:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(view.getContext(), Array.class);
                        view.getContext().startActivity(intent);

                    }
                });
                break;
            case 5:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(view.getContext(), Wrapper.class);
                        view.getContext().startActivity(intent);

                    }
                });
                break;
            case 6:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(view.getContext(), oopsbasic.class);
                        view.getContext().startActivity(intent);

                    }
                });
                break;
            case 7:
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(view.getContext(), oopsfeature.class);
                        view.getContext().startActivity(intent);

                    }
                });
                break;
        }


    }

    @Override
    public int getItemCount() {

        return mytutorialmodel.size();
    }

    public class MyviewHodler extends RecyclerView.ViewHolder {
        TextView textView;
        public MyviewHodler(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.texts);
        }
    }
}
