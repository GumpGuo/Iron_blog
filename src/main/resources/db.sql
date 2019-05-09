DROP DATABASE IF  EXISTS iron_blog;
/*创建数据库，并设置编码*/
CREATE DATABASE iron_blog DEFAULT CHARACTER utf8;

USE iron_blog;

-- 创建博客的表
CREATE TABLE `blog`(
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '博客id',
  `title` VARCHAR (200) NOT NULL COMMENT '博客标题',
  `author` VARCHAR(200) NOT NULL COMMENT '博客作者',
  `summary` VARCHAR(200) DEFAULT NULL COMMENT '博客摘要',
  `releaseDate` DATETIME DEFAULT NULL COMMENT '发布日期',
  `clickHit` INT(11) DEFAULT NULL COMMENT '点击数',
  `content` TEXT COMMENT '博客内容',
  `keyWord` VARCHAR(200) DEFAULT NULL COMMENT '关键字',
  `type_id` INT(11) DEFAULT NULL COMMENT '外键关联博客类型',
  PRIMARY KEY(`id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `blog_ibfk_1` FOREIGN KEY(`type_id`) REFERENCES `blogtype`(`id`)
)ENGINE=INNODB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;


-- 创建博客种类的表格
CREATE TABLE `blogtype`(
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '博客类型id',
	`typeName` VARCHAR(200) DEFAULT NULL COMMENT '博客类型名称',
	`orderNum` INT(11) DEFAULT NULL COMMENT '博客类型优先级',
	PRIMARY KEY(`id`)
) ENGINE=INNODB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;


-- 创建关于链接的表格
CREATE TABLE `link`(
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '链接id',
	`linkName` VARCHAR(200) DEFAULT NULL COMMENT '链接名称',
	`linkUrl`  VARCHAR(200) DEFAULT NULL COMMENT '链接的url',
	`orderNum` INT(11) DEFAULT NULL COMMENT '链接的优先级',
	PRIMARY KEY(`id`)
) ENGINE=INNODB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


-- 创建用户类的表格
CREATE TABLE `user`(
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
	`userName` VARCHAR(200) NOT NULL COMMENT '用户名',
	`password` VARCHAR(200) NOT NULL COMMENT '用户密码',
	`sign` VARCHAR(200) DEFAULT NULL COMMENT '用户签名',
	`profile` VARCHAR(200) DEFAULT NULL COMMENT '用户简介',
	`imageAddress` VARCHAR(200) DEFAULT NULL COMMENT '用户头像位置',
	`email` VARCHAR(200) DEFAULT NULL COMMENT '用户邮箱',
	PRIMARY KEY(`id`)
)ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


-- 创建视频表格
CREATE TABLE `video`(
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '视频id',
	`title` VARCHAR(200) DEFAULT NULL COMMENT '视频标题',
	`timeLength` INT(11) DEFAULT NULL COMMENT '视频长度，单位秒',
	`type_id` INT(11) DEFAULT NULL COMMENT '外键关联视频种类',
	PRIMARY KEY(`id`),
	KEY `type_id`(`type_id`),
	CONSTRAINT `video_ibfk_1` FOREIGN KEY(`type_id`) REFERENCES `videotype`(`id`) 
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


-- 创建视频类的表格
CREATE TABLE `videotype`(
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '视频种类id',
	`typeName`  VARCHAR(200) DEFAULT NULL COMMENT '视频种类名称',
	`orderNum` INT(11) DEFAULT NULL COMMENT '视频种类优先级',
	PRIMARY KEY(`id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;