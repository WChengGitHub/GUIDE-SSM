package com.guide.ssm.module.user.pojo;

import java.util.Date;

public class TbReply {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_reply.Rid
     *
     * @mbggenerated
     */
    private String rid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_reply.Title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_reply.Reply
     *
     * @mbggenerated
     */
    private String reply;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_reply.ADid
     *
     * @mbggenerated
     */
    private String adid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_reply.Time
     *
     * @mbggenerated
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_reply.Aid
     *
     * @mbggenerated
     */
    private String aid;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reply
     *
     * @mbggenerated
     */
    public TbReply(String rid, String title, String reply, String adid, Date time, String aid) {
        this.rid = rid;
        this.title = title;
        this.reply = reply;
        this.adid = adid;
        this.time = time;
        this.aid = aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_reply.Rid
     *
     * @return the value of tb_reply.Rid
     *
     * @mbggenerated
     */
    public String getRid() {
        return rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_reply.Title
     *
     * @return the value of tb_reply.Title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_reply.Reply
     *
     * @return the value of tb_reply.Reply
     *
     * @mbggenerated
     */
    public String getReply() {
        return reply;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_reply.ADid
     *
     * @return the value of tb_reply.ADid
     *
     * @mbggenerated
     */
    public String getAdid() {
        return adid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_reply.Time
     *
     * @return the value of tb_reply.Time
     *
     * @mbggenerated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_reply.Aid
     *
     * @return the value of tb_reply.Aid
     *
     * @mbggenerated
     */
    public String getAid() {
        return aid;
    }
}