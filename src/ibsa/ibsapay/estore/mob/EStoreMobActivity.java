package ibsa.ibsapay.estore.mob;

import android.os.Bundle;
import org.apache.cordova.*;

public class EStoreMobActivity extends DroidGap  {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadUrl("file:///android_asset/www/index.html");
    }
}