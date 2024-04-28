package Music;

import java.util.Objects;

public class Music {
//            (1)成员变量：歌曲名称musicName，歌手singer
    private String musicName;
    private String singer;
//            (2)构造方法，2个参数，为musicName和singer赋初值。

    public Music(String musicName, String singer) {
        this.musicName = musicName;
        this.singer = singer;
    }

//            (3)get和set方法

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

//            (4)toString方法，返回“歌手-歌名”组合而成的字符串

    @Override
    public String toString() {
        return musicName + '-' + singer;
    }

//            (5)equals方法，如果两首歌的歌名和歌手都相同，认为两首歌相同

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return Objects.equals(musicName, music.musicName) && Objects.equals(singer, music.singer);
    }

}
