package com.icbc.demo.config;//修改当前类所在的包名

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.util.StringUtility;

/**
 * mybatis generator 自定义注释 的自定义类
 */
public class MyCommentGenerator implements CommentGenerator {
    private Properties properties = new Properties();
    private boolean suppressDate = false;
    private boolean suppressAllComments = false;
    private boolean addRemarkComments = false;
    private SimpleDateFormat dateFormat;

    public MyCommentGenerator() {
    }

    public void addJavaFileComment(CompilationUnit compilationUnit) {
    }

    /**
     * 生成xxxMapper.xml文件注释的方法
     * @param xmlElement
     */
    public void addComment(XmlElement xmlElement) {
//        if (!this.suppressAllComments) {
//            xmlElement.addElement(new TextElement("<!--"));
//            StringBuilder sb = new StringBuilder();
//            sb.append("  WARNING - ");
//            sb.append("@mbg.generated");
//            xmlElement.addElement(new TextElement(sb.toString()));
//            xmlElement.addElement(new TextElement("  This element is automatically generated by MyBatis Generator, do not modify."));
//            String s = this.getDateString();
//            if (s != null) {
//                sb.setLength(0);
//                sb.append("  This element was generated on ");
//                sb.append(s);
//                sb.append('.');
//                xmlElement.addElement(new TextElement(sb.toString()));
//            }
//
//            xmlElement.addElement(new TextElement("-->"));
//        }
    }

    public void addRootComment(XmlElement rootElement) {
    }

    /**
     * 在xxxMapper.java中的方法上 生成注解 的方法
     * @param method
     * @param introspectedTable
     * @param set
     */
    @Override
    public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> set) {

    }

    /**
     * 在xxxMapper.java中的方法上 生成注解 的方法
     * @param method
     * @param introspectedTable
     * @param set
     */
    @Override
    public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> set) {

    }

    /**
     * 在实体类的属性上  生成注解  的方法
     * @param field
     * @param introspectedTable
     * @param set
     */
    @Override
    public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> set) {

    }

    /**
     * 在实体类的属性上  生成注解  的方法
     * @param field
     * @param introspectedTable
     * @param set
     */
    @Override
    public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> set) {

    }

    /**
     * 在实体类上  生成类注解  的方法
     * @param innerClass
     * @param introspectedTable
     * @param set
     */
    @Override
    public void addClassAnnotation(InnerClass innerClass, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> set) {

    }

    /**
     * 从generatorConfig.xml中获取相应的配置项
     * @param properties
     */
    public void addConfigurationProperties(Properties properties) {
        this.properties.putAll(properties);
        this.suppressDate = StringUtility.isTrue(properties.getProperty("suppressDate"));
        this.suppressAllComments = StringUtility.isTrue(properties.getProperty("suppressAllComments"));
        this.addRemarkComments = StringUtility.isTrue(properties.getProperty("addRemarkComments"));
        String dateFormatString = properties.getProperty("dateFormat");
        if (StringUtility.stringHasValue(dateFormatString)) {
            this.dateFormat = new SimpleDateFormat(dateFormatString);
        }

    }

    /**
     * 打上标签
     * @param javaElement
     * @param markAsDoNotDelete
     */
    protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
        javaElement.addJavaDocLine(" *");
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append("@mbg.generated");
        if (markAsDoNotDelete) {
            sb.append(" do_not_delete_during_merge");
        }

        String s = this.getDateString();
        if (s != null) {
            sb.append(' ');
            sb.append(s);
        }

        javaElement.addJavaDocLine(sb.toString());
    }

    /**
     * 获取时间
     * @return
     */
    protected String getDateString() {
        if (this.suppressDate) {
            return null;
        } else {
            return this.dateFormat != null ? this.dateFormat.format(new Date()) : (new Date()).toString();
        }
    }

    /**
     * 给实体类 添加 类注释
     * @param innerClass
     * @param introspectedTable
     */
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        if (!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            innerClass.addJavaDocLine("/**");
            innerClass.addJavaDocLine(" * This class was generated by MyBatis Generator.");
            sb.append(" * This class corresponds to the database table ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            innerClass.addJavaDocLine(sb.toString());
            this.addJavadocTag(innerClass, false);
            innerClass.addJavaDocLine(" */");
        }
    }

    /**
     * 给创建数据库表对应的实体类 添加 注释
     * @param topLevelClass
     * @param introspectedTable
     */
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        if (!this.suppressAllComments && this.addRemarkComments) {
            StringBuilder sb = new StringBuilder();
            topLevelClass.addJavaDocLine("/**");
            String remarks = introspectedTable.getRemarks();
            if (this.addRemarkComments && StringUtility.stringHasValue(remarks)) {
                topLevelClass.addJavaDocLine(" * Database Table Remarks:");
                String[] remarkLines = remarks.split(System.getProperty("line.separator"));
                String[] var6 = remarkLines;
                int var7 = remarkLines.length;

                for(int var8 = 0; var8 < var7; ++var8) {
                    String remarkLine = var6[var8];
                    topLevelClass.addJavaDocLine(" *   " + remarkLine);
                }
            }

            topLevelClass.addJavaDocLine(" *");
            topLevelClass.addJavaDocLine(" * This class was generated by MyBatis Generator.");
            sb.append(" * This class corresponds to the database table ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            topLevelClass.addJavaDocLine(sb.toString());
            this.addJavadocTag(topLevelClass, true);
            topLevelClass.addJavaDocLine(" */");
        }
    }

    /**
     * 给实体类的枚举类型  添加注释
     * @param innerEnum
     * @param introspectedTable
     */
    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
        if (!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            innerEnum.addJavaDocLine("/**");
            innerEnum.addJavaDocLine(" * This enum was generated by MyBatis Generator.");
            sb.append(" * This enum corresponds to the database table ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            innerEnum.addJavaDocLine(sb.toString());
            this.addJavadocTag(innerEnum, false);
            innerEnum.addJavaDocLine(" */");
        }
    }

    /**
     * 给实体类的属性  添加注释
     * @param field
     * @param introspectedTable
     * @param introspectedColumn
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (!this.suppressAllComments) {
            field.addJavaDocLine("/**");
            String remarks = introspectedColumn.getRemarks();
            /*if (this.addRemarkComments && StringUtility.stringHasValue(remarks)) {
                field.addJavaDocLine(" * Database Column Remarks:");
                String[] remarkLines = remarks.split(System.getProperty("line.separator"));
                String[] var6 = remarkLines;
                int var7 = remarkLines.length;

                for(int var8 = 0; var8 < var7; ++var8) {
                    String remarkLine = var6[var8];
                    field.addJavaDocLine(" *   " + remarkLine);
                }
            }*/

            /*field.addJavaDocLine(" *");
            field.addJavaDocLine(" * This field was generated by MyBatis Generator.");*/
            StringBuilder sb = new StringBuilder();
            sb.append(" * " + remarks);//这个就是字段的注释
            /*sb.append(" * This field corresponds to the database column ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            sb.append('.');
            sb.append(introspectedColumn.getActualColumnName());*/
            field.addJavaDocLine(sb.toString());
            /*this.addJavadocTag(field, false);*/
            field.addJavaDocLine(" */");
        }
    }

    /**
     * 给实体类的属性  添加注释
     * @param field
     * @param introspectedTable
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
//        if (!this.suppressAllComments) {
//            StringBuilder sb = new StringBuilder();
//            field.addJavaDocLine("/**");
//            field.addJavaDocLine(" * This field was generated by MyBatis Generator.");
//            sb.append(" * This field corresponds to the database table ");
//            sb.append(introspectedTable.getFullyQualifiedTable());
//            field.addJavaDocLine(sb.toString());
//            this.addJavadocTag(field, false);
//            field.addJavaDocLine(" */");
//        }
    }

    /**
     * 给xxxMapper.java的方法添加注释
     * @param method
     * @param introspectedTable
     */
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
//        if (!this.suppressAllComments) {
//            StringBuilder sb = new StringBuilder();
//            method.addJavaDocLine("/**");
//            method.addJavaDocLine(" * This method was generated by MyBatis Generator.");
//            sb.append(" * This method corresponds to the database table ");
//            sb.append(introspectedTable.getFullyQualifiedTable());
//            method.addJavaDocLine(sb.toString());
//            this.addJavadocTag(method, false);
//            method.addJavaDocLine(" */");
//        }
    }

    /**
     * 给实体类的getter方法添加注释
     * @param method
     * @param introspectedTable
     * @param introspectedColumn
     */
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
//        if (!this.suppressAllComments) {
//            StringBuilder sb = new StringBuilder();
//            method.addJavaDocLine("/**");
//            method.addJavaDocLine(" * This method was generated by MyBatis Generator.");
//            sb.append(" * This method returns the value of the database column ");
//            sb.append(introspectedTable.getFullyQualifiedTable());
//            sb.append('.');
//            sb.append(introspectedColumn.getActualColumnName());
//            method.addJavaDocLine(sb.toString());
//            method.addJavaDocLine(" *");
//            sb.setLength(0);
//            sb.append(" * @return the value of ");
//            sb.append(introspectedTable.getFullyQualifiedTable());
//            sb.append('.');
//            sb.append(introspectedColumn.getActualColumnName());
//            method.addJavaDocLine(sb.toString());
//            this.addJavadocTag(method, false);
//            method.addJavaDocLine(" */");
//        }
    }

    /**
     * 给实体类的setter方法添加注释
     * @param method
     * @param introspectedTable
     * @param introspectedColumn
     */
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
//        if (!this.suppressAllComments) {
//            StringBuilder sb = new StringBuilder();
//            method.addJavaDocLine("/**");
//            method.addJavaDocLine(" * This method was generated by MyBatis Generator.");
//            sb.append(" * This method sets the value of the database column ");
//            sb.append(introspectedTable.getFullyQualifiedTable());
//            sb.append('.');
//            sb.append(introspectedColumn.getActualColumnName());
//            method.addJavaDocLine(sb.toString());
//            method.addJavaDocLine(" *");
//            Parameter parm = (Parameter)method.getParameters().get(0);
//            sb.setLength(0);
//            sb.append(" * @param ");
//            sb.append(parm.getName());
//            sb.append(" the value for ");
//            sb.append(introspectedTable.getFullyQualifiedTable());
//            sb.append('.');
//            sb.append(introspectedColumn.getActualColumnName());
//            method.addJavaDocLine(sb.toString());
//            this.addJavadocTag(method, false);
//            method.addJavaDocLine(" */");
//        }
    }

    /**
     * 给实体类添加类注释
     * @param innerClass
     * @param introspectedTable
     * @param markAsDoNotDelete
     */
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
        if (!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            innerClass.addJavaDocLine("/**");
            innerClass.addJavaDocLine(" * This class was generated by MyBatis Generator.");
            sb.append(" * This class corresponds to the database table ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            innerClass.addJavaDocLine(sb.toString());
            this.addJavadocTag(innerClass, markAsDoNotDelete);
            innerClass.addJavaDocLine(" */");
        }
    }
}
