package top.mothership.cabbage.pojo.osu;

import lombok.Data;

@Data
public class MpBeatmap {
    private Integer id;
    private Integer beatmapId;
    private Integer recommender;
    private String group;
    private Integer mods;
}
