package com.guide.ssm.module.user.pojo;

public class TbVisitor {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_visitor.Vid
     *
     * @mbggenerated
     */
    private String vid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_visitor.Visitor
     *
     * @mbggenerated
     */
    private String visitor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_visitor.Password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_visitor.Gender
     *
     * @mbggenerated
     */
    private Boolean gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_visitor.Telephone
     *
     * @mbggenerated
     */
    private String telephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_visitor.Email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_visitor.Lockstate
     *
     * @mbggenerated
     */
    private Boolean lockstate;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_visitor
     *
     * @mbggenerated
     */
    public TbVisitor(String vid, String visitor, String password, Boolean gender, String telephone, String email, Boolean lockstate) {
        this.vid = vid;
        this.visitor = visitor;
        this.password = password;
        this.gender = gender;
        this.telephone = telephone;
        this.email = email;
        this.lockstate = lockstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_visitor.Vid
     *
     * @return the value of tb_visitor.Vid
     *
     * @mbggenerated
     */
    public String getVid() {
        return vid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_visitor.Visitor
     *
     * @return the value of tb_visitor.Visitor
     *
     * @mbggenerated
     */
    public String getVisitor() {
        return visitor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_visitor.Password
     *
     * @return the value of tb_visitor.Password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_visitor.Gender
     *
     * @return the value of tb_visitor.Gender
     *
     * @mbggenerated
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_visitor.Telephone
     *
     * @return the value of tb_visitor.Telephone
     *
     * @mbggenerated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_visitor.Email
     *
     * @return the value of tb_visitor.Email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_visitor.Lockstate
     *
     * @return the value of tb_visitor.Lockstate
     *
     * @mbggenerated
     */
    public Boolean getLockstate() {
        return lockstate;
    }
}