package com.wsw.myelasticsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

/**
 * @Author WangSongWen
 * @Date: Created in 14:02 2020/12/18
 * @Description:
 *
 * Document: 用来标记文档对象,包含了该文档的一些元信息,索引副本数,分片数
 * Id: 文档的标识符
 * Field: 文档字段的一些元信息配置,类型,名称,分词器等等
 *
 */
@Document(indexName = "blogs")
@Data
public class Blog {
    @Id
    private String blogId;
    private String blogTitle;
    private String author;
    private String content;
    private String url;
    @Field(type = FieldType.Date, format = DateFormat.date_hour_minute_second)
    private LocalDateTime publishedTime;
}
