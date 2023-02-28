package cn.itcast.musicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }
    @Override
    public int onStartCommand(Intent intent, int flags,int startId){
        MediaPlayer player = new MediaPlayer();//创建音乐播放器对象
         player.reset();//重置音乐播放器
        //加载多媒体文件
        player = MediaPlayer.create(getApplicationContext(), R.raw.music);
        player.start();//播放音乐
        return super.onStartCommand(intent,flags,startId);
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
