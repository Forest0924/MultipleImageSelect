package com.darsh.multipleimageselect.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.darsh.multipleimageselect.R;
import com.darsh.multipleimageselect.models.Album;
<<<<<<< HEAD
=======
import com.bumptech.glide.Glide;
>>>>>>> origin/develop

import java.util.ArrayList;

/**
 * Created by Darshan on 4/14/2015.
 */
public class CustomAlbumSelectAdapter extends CustomGenericAdapter<Album> {
    public CustomAlbumSelectAdapter(Context context, ArrayList<Album> albums) {
        super(context, albums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.grid_view_item_album_select, null);

            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.image_view_album_image);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.text_view_album_name);

            convertView.setTag(viewHolder);
            convertView.setTag(R.id.image_view_album_image, viewHolder.imageView);
            convertView.setTag(R.id.text_view_album_name, viewHolder.textView);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.imageView.getLayoutParams().width = size;
        viewHolder.imageView.getLayoutParams().height = size;

<<<<<<< HEAD
        viewHolder.textView.setText(arrayList.get(position).name);
        Glide.with(context)
                .load(arrayList.get(position).cover)
                .placeholder(R.drawable.image_placeholder).centerCrop().into(viewHolder.imageView);
=======
        Album album = getItem(position);
        viewHolder.textView.setText(album.name);
        File file = new File(album.imagePath);
        Glide.with(context).load(file).into(viewHolder.imageView);
>>>>>>> origin/develop

        return convertView;
    }

    private static class ViewHolder {
        protected ImageView imageView;
        protected TextView textView;
    }
}
