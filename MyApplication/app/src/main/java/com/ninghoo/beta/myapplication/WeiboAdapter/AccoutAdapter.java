package com.ninghoo.beta.myapplication.WeiboAdapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ninghoo.beta.myapplication.R;
import com.ninghoo.beta.myapplication.WeiboModel.AccessTokenKeeper;
import com.ninghoo.beta.myapplication.WeiboModel.User;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.CircleBitmapDisplayer;

import java.util.ArrayList;

/**
 * Created by ningfu on 17-4-5.
 */

public class AccoutAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<User> mUserList = new ArrayList<User>();
    private LayoutInflater layoutInflater;
    private DisplayImageOptions mAvatorOptions = new DisplayImageOptions.Builder()
            .showImageOnLoading(R.drawable.avator_default)
            .showImageForEmptyUri(R.drawable.avator_default)
            .showImageOnFail(R.drawable.avator_default)
            .bitmapConfig(Bitmap.Config.RGB_565)
            .imageScaleType(ImageScaleType.EXACTLY)
            .cacheInMemory(true)
            .cacheOnDisk(true)
            .considerExifParams(true)
            .resetViewBeforeLoading(false)
            .displayer(new CircleBitmapDisplayer(14671839, 1))
            .build();

    public AccoutAdapter(Context context, ArrayList<User> userList) {
        this.mContext = context;
        this.mUserList = userList;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mUserList.size();
    }

    @Override
    public User getItem(int position) {
        return mUserList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void setData(ArrayList<User> tokenList) {
        mUserList = tokenList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        final AccoutViewHolder holder;
        if (convertView == null) {
            view = layoutInflater.inflate(R.layout.accout_layout_item, parent, false);
            holder = new AccoutViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (AccoutViewHolder) view.getTag();
        }
        initAccoutViewHolder(holder, position);
        return view;
    }


    private void initAccoutViewHolder(AccoutViewHolder holder, int position) {
        holder.accoutName.setText(mUserList.get(position).name);
        if (getItem(position).id.equals(AccessTokenKeeper.readAccessToken(mContext).getUid())) {
            holder.accout_hightlight.setVisibility(View.VISIBLE);
        } else {
            holder.accout_hightlight.setVisibility(View.INVISIBLE);
        }
        ImageLoader.getInstance().displayImage(mUserList.get(position).avatar_hd, holder.profileImg, mAvatorOptions);
    }


    protected static class AccoutViewHolder {
        public ImageView profileImg;
        public ImageView accout_hightlight;
        public TextView accoutName;

        public AccoutViewHolder(View view) {
            profileImg = (ImageView) view.findViewById(R.id.profileImg);
            accout_hightlight = (ImageView) view.findViewById(R.id.highligh);
            accoutName = (TextView) view.findViewById(R.id.accout_name);
        }
    }


}
