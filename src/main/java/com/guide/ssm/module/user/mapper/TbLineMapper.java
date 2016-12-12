package com.guide.ssm.module.user.mapper;

import com.guide.ssm.module.user.pojo.TbLine;
import com.guide.ssm.module.user.pojo.TbLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TbLineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_line
     *
     * @mbggenerated
     */
    int countByExample(TbLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_line
     *
     * @mbggenerated
     */
    int deleteByExample(TbLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_line
     *
     * @mbggenerated
     */
    @Delete({
        "delete from tb_line",
        "where Lid = #{lid,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String lid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_line
     *
     * @mbggenerated
     */
    @Insert({
        "insert into tb_line (Lid, Line, ",
        "Time, Style)",
        "values (#{lid,jdbcType=CHAR}, #{line,jdbcType=VARCHAR}, ",
        "#{time,jdbcType=BIT}, #{style,jdbcType=CHAR})"
    })
    int insert(TbLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_line
     *
     * @mbggenerated
     */
    int insertSelective(TbLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_line
     *
     * @mbggenerated
     */
    List<TbLine> selectByExample(TbLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_line
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "Lid, Line, Time, Style",
        "from tb_line",
        "where Lid = #{lid,jdbcType=CHAR}"
    })
    @ResultMap("BaseResultMap")
    TbLine selectByPrimaryKey(String lid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_line
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbLine record, @Param("example") TbLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_line
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbLine record, @Param("example") TbLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_line
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_line
     *
     * @mbggenerated
     */
    @Update({
        "update tb_line",
        "set Line = #{line,jdbcType=VARCHAR},",
          "Time = #{time,jdbcType=BIT},",
          "Style = #{style,jdbcType=CHAR}",
        "where Lid = #{lid,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(TbLine record);
}