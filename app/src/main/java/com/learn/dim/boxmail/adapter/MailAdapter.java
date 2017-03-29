package com.learn.dim.boxmail.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.learn.dim.boxmail.R;
import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by DIM on 29/03/2017.
 */

public class MailAdapter extends RecyclerView.Adapter<MailAdapter.MailViewHolder> {
    @Override
    public MailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MailViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MailViewHolder extends RecyclerView.ViewHolder {

        TextView from;


        public MailViewHolder(View itemView) {
            super(itemView);
        }
    }
}
