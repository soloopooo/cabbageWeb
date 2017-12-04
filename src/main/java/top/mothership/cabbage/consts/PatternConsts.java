package top.mothership.cabbage.consts;

import java.util.regex.Pattern;

/**
 * 正则表达式的常量类。
 * @author QHS
 */
public class PatternConsts {
    /**
     * 主过滤器：匹配出所有命令，命令后半参数
     */
    public final static Pattern MAIN_FILTER_REGEX = Pattern.compile("[!！]([^ \\u4e00-\\u9fa5]+)([\\u892a\\u88d9\\u9000\\u7fa4\\u767d\\u83dcA-Za-z0-9\\[\\] :#-_]*+)");
    /**
     * 匹配出带图片的消息
     */
    public final static Pattern IMG_REGEX =  Pattern.compile("\\[CQ:image,file=.+]");
    /**
     * 匹配出纯图片的消息
     */
    public final static Pattern SINGLE_IMG_REGEX =  Pattern.compile("^\\[CQ:image,file=.+]$");
    /**
     * 匹配出sudo命令
     */
    public final static Pattern ADMIN_CMD_REGEX =  Pattern.compile("[!！]sudo ([^ ]*)(.*)");
    /**
     * 匹配出带数字的常规命令
     * 当处理!statme类命令时：group(1)为statme，2和3为""
     * !setid xxx类命令是：group(1)为setid，group(2)为xxx，3为""
     * !bp xx #n类命令时：group(1)为setid，group(2)为xxx ，3为n，注意group(2)有一个空格
     * !bpme #n类命令时：group(1)为setid，group(2)为""，3为n
     */
    public final static Pattern CMD_REGEX_NUM =  Pattern.compile("[!！]([^ ]+)[ ]?([^#]*)[ ]?[#]*(.*)");
    /**
     * 匹配出带中文/特殊符号的命令
     */
    public final static Pattern MAIN_FILTER_REGEX_CHINESE =  Pattern.compile("[!！]([^ \\u4e00-\\u9fa5]+)(.*+)");
    /**
     * 复读禁言时抗干扰的匹配表达式
     */
    public final static Pattern REPEAT_FILTER_REGEX =  Pattern.compile("[^\\u4e00-\\u9fa5a-zA-Z0-9]");
    /**
     * 从.osu文件中匹配出BG文件名的表达式
     */
    public final static Pattern BGNAME_REGEX =  Pattern.compile("(?<=[\\d*],[\\d*],\")(?:.*\\\\)*(.*\\.(?i)(jpg|png|jpeg))");
    /**
     * 从下载文件的HTTP头中取出文件名的表达式
     */
    public final static Pattern DOWNLOAD_FILENAME_REGEX = Pattern.compile("(?<=filename=\")([^\";]*)");
    /**
     * osu官网中添加好友连接的表达式
     */
    public final static Pattern ADD_FRIEND_REGEX = Pattern.compile("<div class='centrep'>\\n<a href='([^']*)");
    /**
     * osu search命令的表达式
     * 2017-12-4 10:45:55 现在支持分隔符前后带空格了
     */
    public final static Pattern OSU_SEARCH_KETWORD =  Pattern.compile("^([^-]*)-[ ]*(.*)[ ]*\\[(.*)][ ]*\\((.*)\\)");


}