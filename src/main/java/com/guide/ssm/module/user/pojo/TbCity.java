package com.guide.ssm.module.user.pojo;

public class TbCity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_city.Cid
     *
     * @mbggenerated
     */
    private String cid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_city.City
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_city.Pid
     *
     * @mbggenerated
     */
    private String pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_city
     *
     * @mbggenerated
     */
    public TbCity(String cid, String city, String pid) {
        this.cid = cid;
        this.city = city;
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_city.Cid
     *
     * @return the value of tb_city.Cid
     *
     * @mbggenerated
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_city.City
     *
     * @return the value of tb_city.City
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_city.Pid
     *
     * @return the value of tb_city.Pid
     *
     * @mbggenerated
     */
    public String getPid() {
        return pid;
    }
}