package app.nutrimeat.meat.org.nutrimeat.Textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class p_MyCustomTextView_regular extends TextView {

    public p_MyCustomTextView_regular(Context context, AttributeSet arrt) {
        super(context,arrt);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Regular.ttf"));
    }


    public p_MyCustomTextView_regular(Context context) {
        super(context);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Regular.ttf"));
    }
}
