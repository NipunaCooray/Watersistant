package com.nipunacooray.waterbuddy.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.nipunacooray.waterbuddy.R;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder>{


    List<String> mTimeList;

    public void setDateList(List <String> timeList) {
        mTimeList = timeList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder mainViewHolder, int position) {
        mainViewHolder.mDateEntry.setText( mTimeList.get(position));
    }

    @Override
    public int getItemCount() {
        if (null == mTimeList) return 0;
        return mTimeList.size();
    }

    public  class MainViewHolder extends RecyclerView.ViewHolder  {

        public final TextView mDateEntry;
        public final CheckBox mCheckBox;


        public MainViewHolder(@NonNull View view) {
            super(view);

            mDateEntry = (TextView) view.findViewById(R.id.time);
            mCheckBox = (CheckBox) view.findViewById(R.id.mark_as_done);

        }


    }
}
