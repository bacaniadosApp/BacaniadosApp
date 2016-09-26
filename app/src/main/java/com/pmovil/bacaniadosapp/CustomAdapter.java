package com.pmovil.bacaniadosapp;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class CustomAdapter extends PagerAdapter {

    private int[] imgs = {R.drawable.finca1,R.drawable.finca2,R.drawable.finca3,R.drawable.finca4};
    private LayoutInflater inflater;
    private Context ctx;

    public CustomAdapter(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view ==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.swipe,container,false);
        ImageView img = (ImageView)v.findViewById(R.id.imageView2);
        TextView tv = (TextView)v.findViewById(R.id.textView6);
        img.setImageResource(imgs[position]);
        tv.setText("Imagen :"+position);
        container.addView(v);
        return v;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.invalidate();
    }
}
