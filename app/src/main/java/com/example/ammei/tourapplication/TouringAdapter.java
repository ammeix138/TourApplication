package com.example.ammei.tourapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ammei on 11/9/2016.
 */

public class TouringAdapter extends ArrayAdapter<Touring> {

    public TouringAdapter(Activity context, ArrayList<Touring> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the word object currently at this position in the list_item.
        Touring currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.title_of_content);
        // Set this text on the name TextView
        nameTextView.setText(currentWord.getTitleOfContent());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_of_content);
        // Set this text on the number TextView
        descriptionTextView.setText(currentWord.getDescriptionOfContent());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentWord.hasImage()) {
            // If the fragment has picture, it should get the correct image with the ID
            imageView.setImageResource(currentWord.getImageResourceId());
            // Reiteration to the device that picture should be visible to user.
            imageView.setVisibility(View.VISIBLE);
        } else {
            // If there is NO image, hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        // Check if an image is provided for this item or not
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
