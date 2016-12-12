package callback.jdjz.com.callback;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by tchl on 2016-12-12.
 */
public class ManagerFields  {
    Context mContext;

    public ManagerFields(Context mContext) {
        this.mContext = mContext;
    }


    public void doSomething(){
        TimeUtil timeUtil = new TimeUtil(new TimeListener() {
            @Override
            public void returnTime(long bjTime) {
               Log.d("ManagerFields:","time:"+bjTime);
            }
        });

        timeUtil.getBJTime();
    }


}
