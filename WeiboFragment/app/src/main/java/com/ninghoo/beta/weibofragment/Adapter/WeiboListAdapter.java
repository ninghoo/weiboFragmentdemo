//package com.ninghoo.beta.weibofragment.Adapter;
//
//import android.content.ContentUris;
//import android.content.Context;
//import android.content.Intent;
//import android.net.Uri;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.animation.Animation;
//import android.view.animation.AnimationUtils;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.ninghoo.beta.weibofragment.R;
//
//import java.util.ArrayList;
//
///**
// * Created by ningfu on 17-3-28.
// */
//
//public class WeiboListAdapter extends RecyclerView.Adapter<WeiboListAdapter.ViewHolder>
//{
//
////    public WeiboListAdapter(Context context, ArrayList<Audio> data)
////    {
////        this.mData = data;
////        this.mContext = context;
////    }
//
//    static class ViewHolder extends RecyclerView.ViewHolder
//    {
//        View itemView;
//
//        ImageView AlbumFront;
//        TextView MusicName;
//        TextView MusicArtist;
//
//        /* 这里传入的view就是单个item的rootView。
//        ViewHolder里面与控件绑定。
//        由于上面声明了自定义的mMusicListOnItemClick对象，这我们在构造函数中把它传入，已适应点击实事件。
//         */
//        public ViewHolder(View view)
//        {
//            super(view);
//            this.itemView = view;
//
//            AlbumFront = (ImageView) view.findViewById(R.id.);
//            MusicName = (TextView) view.findViewById(R.id.);
//            MusicArtist = (TextView) view.findViewById(R.id.);
//
//        }
//
//    }
//
//    // 以下3个方法均是RecyclerView和ViewHolder需要继承的方法。
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
//    {
//        mMaxPosition = getItemCount();
//
//        WeydioApplication.setmMaxPosition(mMaxPosition);
//
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_musiclist, parent, false);
//
//        // 上面定义了ViewHolder，并要求要传入参数view，上面初始化view，然后将其传入。
//        final ViewHolder holder = new ViewHolder(view);
//
//        holder.itemView.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//
//            }
//        });
//
//        holder.itemView.setOnLongClickListener(new View.OnLongClickListener()
//        {
//            @Override
//            public boolean onLongClick(View v)
//            {
//
//                return true;
//            }
//        });
//
//        return holder;
//    }
//
//
//    // 该方法会传入holder和position对象，通过position，可以获取单个音乐文件。
//    // onBindViewHolder方法与视图绑定。
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position)
//    {
//
//        // 这里的ImageLoader，并没有用MediaUtils去获取专辑图片，而是直接获取歌曲专辑的地址。
//        ImageLoader.getInstance().displayImage(url, holder.AlbumFront, WeydioApplication.mOptions);
//        setAnimation(holder.AlbumFront, position);
//
//        holder.MusicName.setText(audio.getmTitle());
//        holder.MusicArtist.setText("." + audio.getmArtist() + " .《" +audio.getmAlbum() + "》");
//    }
//
//    @Override
//    public int getItemCount()
//    {
//        return 0;
////        return mData.size();
//    }
//
//    private void setAnimation(View viewToAnimate, int position)
//    {
//        Animation animation = AnimationUtils.loadAnimation(viewToAnimate.getContext(),
//                R.anim.);
//        viewToAnimate.startAnimation(animation);
//
//    }
//
//    public interface OnItemClickListener{
//        void onItemClick(View view, int position);
//    }
//
//    public interface OnItemLongClickListener{
//        void onItemLongClick(View view, int position);
//    }
//
//    public void setOnItemClickListener(OnItemClickListener mOnItemClickListener){
//        this.mOnItemClickListener = mOnItemClickListener;
//    }
//
//    public void setOnItemLongClickListener(OnItemLongClickListener mOnItemLongClickListener) {
//        this.mOnItemLongClickListener = mOnItemLongClickListener;
//    }
//
//}
//}
