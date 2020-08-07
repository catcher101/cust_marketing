package com.icbc.demo.config;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

/**
 * 解决mybatis逆向工程数据表字段映射到实体类属性类型 不符合需求 的问题
 * 即数据表字段的int型映射到Java实体类的属性变成了Integer
 **/
public class MyJavaTypeResolverDefaultImpl extends JavaTypeResolverDefaultImpl {
    @Override
    protected FullyQualifiedJavaType overrideDefaultType(IntrospectedColumn column, FullyQualifiedJavaType defaultType) {
        FullyQualifiedJavaType answer = defaultType;
        switch(column.getJdbcType()) {
            case 4://int型字段的getJdbcType()都是4
                if("INT".equals(column.getActualTypeName())){
                    answer = new FullyQualifiedJavaType("int");//返回int型
                }
                break;
            case -7:
                answer = calculateBitReplacement(column, defaultType);
                break;
            case 2:
            case 3:
                answer = this.calculateBigDecimalReplacement(column, defaultType);
                break;
            case 91:
                answer = this.calculateDateType(column, defaultType);
                break;
            case 92:
                answer = this.calculateTimeType(column, defaultType);
                break;
            case 93:
                answer = this.calculateTimestampType(column, defaultType);
        }

        return answer;
    }


}
