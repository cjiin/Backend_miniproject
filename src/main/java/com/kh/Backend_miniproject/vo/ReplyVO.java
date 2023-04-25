package com.kh.Backend_miniproject.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

@AllArgsConstructor
@Setter
@Getter
public class ReplyVO {
    private int replyNum;
    private int postNum;
    private int memberNum;
    private String replyContent;
    private Date writeDate;
    private String nickname;
    private String pfImg;

    public ReplyVO() {}
}
