package com.sandipbhattacharya.listviewwithimage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramViewHolder {
    // Declare the object references for our views
    ImageView itemImage;
    TextView programTitle;
    TextView programDescription;
    // Get the handles by calling findViewById() on View object inside the constructor
    ProgramViewHolder(View v)
    {
        itemImage = v.findViewById(R.id.imageView);
        programTitle = v.findViewById(R.id.textView1);
        programDescription = v.findViewById(R.id.textView2);
    }
}
