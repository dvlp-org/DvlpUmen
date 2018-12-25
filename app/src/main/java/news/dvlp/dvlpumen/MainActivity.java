package news.dvlp.dvlpumen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.umeng.message.PushAgent;

import static anet.channel.util.Utils.context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //在所有的Activity 的onCreate 方法或在应用的BaseActivity的onCreate方法中添加以下方法
        PushAgent.getInstance(context).onAppStart();
    }
}
