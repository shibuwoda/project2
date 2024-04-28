package Music;

import java.util.ArrayList;
import java.util.Random;

public class MusicPlayer {
//    (1)成员变量：
//            播放列表playList，存放若干首歌曲
    private static final ArrayList<Music> playList =new ArrayList<>();
    static {
        playList.add(new Music("本草纲目","周杰伦"));
        playList.add(new Music("凄美地","郭顶"));
        playList.add(new Music("可能","程响"));
    }
//当前歌曲索引index
    private int index;
//播放模式mode
    private int mode;


    public MusicPlayer(int index,int mode) {
        this.index = index;
        this.mode = mode;
    }

    //代表5种播放模式的静态常量
    public final static int ALL_REPEAT__MODE = 1; // 循环播放
    public final static int SINGLE_REPEAT__MODE = 2; // 单曲循环
    public final static int SINGLE_MODE = 3; // 单曲播放
    public final static int ORDER_MODE = 4; // 顺序播放
    public final static int SHUFFLE_MODE = 5; // 随机播放
//(2)mode的get和set方法

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

//            (3)public void addToList(Music music)：将歌曲加入播放列表的末尾
    public void addToList(Music music){
            if(!isExists(music)){
                playList.add(music);
            }
    }
//            (4)	public void addToNext(Music music) ：将歌曲加入当前歌曲之后（下一首播放）
    public void addToNext(Music music){

        if(!isExists(music)){
            //        如果播放到末尾，直接加入元素即可
            playList.add(music);
            if(index == playList.size()-1){
                return ;
            }else {
//        插入元素
                playList.add(index+1,music);
            }
        }


    }
//            (5)public void remove(Music music) ：从播放列表中删除指定歌曲
    public void remove(Music music){
            playList.remove(music);
    }
//            (6)public void remove(int index) ：按照索引，从播放列表中删除歌曲
    public void remove(int index){
            playList.remove(index);
    }
//            (7)	public void next() : 切换到下一首歌，然后开始播放（随机模式的下一首是随机的，其它模式的下一首按播放列表顺序）
    public void next(){
        if(mode == SHUFFLE_MODE){
            randomMusic();
        }else {
            index++;
            if(index == playList.size()-1){
                index=0;
            }
        }

    }
//            (8)	public void previous () : 切换到上一首歌，然后开始播放（随机模式的上一首是随机的，其它模式的上一首按播放列表顺序）
    public void previous (){
        if(mode == SHUFFLE_MODE){
            randomMusic();
        }else {
            index--;
            if(index == 0){
                index = playList.size()-1;
            }
        }
    }
//            (9)	public void start() : 从当前位置开始播放，模拟时只需输出歌曲信息，由于3种模式实际情况下是无限循环，由用户“暂停“控制，目前无法模拟，故给出具体的循环次数要求：
    public void start(){
        switch (mode) {
            case ALL_REPEAT__MODE:
                // 循环播放,循环次数要求为播放列表长度×2
                sout(playList.size()*2);
                break;
            case ORDER_MODE:
                // 顺序播放
                sout(playList.size());
                break;
            case SINGLE_REPEAT__MODE:
                // 单曲循环,循环次数要求为播放列表长度
                for (int i = 0; i < playList.size(); i++) {
                    System.out.println(playList.get(index).getMusicName()+"-"+playList.get(index).getSinger());
                }
                break;
            case SHUFFLE_MODE:
                //随机播放,循环次数要求为播放列表长度×2
                for (int i = 0; i < playList.size()*2; i++) {
                    randomMusic();
                    System.out.println(playList.get(index).getMusicName()+"-"+playList.get(index).getSinger());
                }
                break;
            case SINGLE_MODE:
                //单曲播放
                System.out.println(playList.get(index).getMusicName()+"-"+playList.get(index).getSinger());
                break;
        }
    }
//随机模式，循环次数要求为播放列表长度×2
//单曲循环模式，循环次数要求为播放列表长度
//循环播放模式，循环次数要求为播放列表长度×2
//            (10)	toString方法: 返回当前的播放列表，以及当前歌曲组合而成的字符串，格式自定。
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Music m : playList) {
            sb.append(m.getMusicName()).append("-").append(m.getSinger()).append("\n");
        }
        return sb.toString();
    }

    private void randomMusic(){
        Random random = new Random();
        index = random.nextInt(playList.size());
    }
//    指针打印方法
    private void sout(int i){
        while (true){
            index++;
            if (index==playList.size()){
                index=0;
            }
            System.out.println(playList.get(index).getMusicName()+"-"+playList.get(index).getSinger());
            i--;
            if(i==0){
                break;
            }
        }
    }
//    存在返回true
    private boolean isExists(Music music){
        boolean flag=false;
        for (Music m : playList) {
            if(music.equals(m)){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
