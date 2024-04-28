package Music;

public class MusicPlayerTest {
    public static void main(String[] args) {

        System.out.println("------------单曲循环------------");
        MusicPlayer musicPlayer4 = new MusicPlayer(0,2);
        musicPlayer4.start();
        System.out.println("-------------随机播放-----------");
        MusicPlayer musicPlayer = new MusicPlayer(0,5);
        musicPlayer.start();
        System.out.println("-------------单曲播放--------------");
        MusicPlayer musicPlayer2 = new MusicPlayer(1,3);
        musicPlayer2.start();
        System.out.println("---------------顺序播放------------");
        MusicPlayer musicPlayer3 = new MusicPlayer(1,4);
        musicPlayer3.start();
        System.out.println("---------------循环播放------------");
        MusicPlayer musicPlayer5 = new MusicPlayer(1,1);
        musicPlayer5.start();
        System.out.println("------------上一首-----------");
        musicPlayer5.next();
        System.out.println(musicPlayer5.toString());
        System.out.println("-------------下一首-----------");
        musicPlayer5.previous();
        System.out.println(musicPlayer5.toString());
        System.out.println("----------添加歌曲-----------");
        musicPlayer5.addToList(new Music("锦鲤抄","银临"));
        System.out.println(musicPlayer5.toString());
        System.out.println("-------------再次添加相同歌曲歌曲--------------");
        musicPlayer5.addToList(new Music("锦鲤抄","银临"));
        System.out.println(musicPlayer5.toString());
        System.out.println("-----------加到下一首播放-----------");
        musicPlayer5.addToNext(new Music("吹梦到西洲","黄诗扶"));
        System.out.println(musicPlayer5.toString());


    }
}
