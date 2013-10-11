package com.elimak.chap11combinedviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by elimak on 10/11/13.
 */
public class PropertyView extends RelativeLayout {

    private TextView mAddressTextView;
    private TextView mPriceTextView;
    private ImageView mThumbnailImageView;

    public PropertyView(Context context) {
        super(context);
        init(context);
    }

    public PropertyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public PropertyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    public void setProperty(Property property){
        StringBuilder sb = new StringBuilder();
        sb.append(property.getStreetAddress())
                .append('\n')
                .append(property.getCity())
                .append(", ")
                .append(property.getState());
        mAddressTextView.setText(sb.toString());

        mPriceTextView.setText(property.getPrice());
        mThumbnailImageView.setImageResource(R.drawable.house);
    }

    private void init( Context context){
        inflate(context, R.layout.property, this);
        mAddressTextView = (TextView) findViewById(R.id.address);
        mPriceTextView = (TextView) findViewById(R.id.price);
        mThumbnailImageView = (ImageView) findViewById(R.id.thumbnail);
    }
}
