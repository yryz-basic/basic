CREATE TABLE `basic_email_config` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `trans_code` varchar(20) NOT NULL COMMENT '交易编码',
  `send_info` text COMMENT '发件人信息',
  `host` varchar(50) DEFAULT NULL COMMENT '服务器地址',
  `auth` varchar(10) DEFAULT NULL COMMENT '授权标识',
  `receiverList` varchar(1000) DEFAULT NULL COMMENT '收件人列表',
  `subject` varchar(200) DEFAULT NULL COMMENT '主题',
  `type_model` varchar(10) DEFAULT NULL COMMENT '模版类型',
  `email_model` varchar(50) DEFAULT NULL COMMENT '邮件模版',
  `email_flag` tinyint(3) unsigned DEFAULT NULL COMMENT '邮件状态',
  `del_flag` tinyint(3) unsigned DEFAULT '0' COMMENT '删除标识 0正常，1已删除',
  `create_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_user_id` varchar(20) DEFAULT NULL COMMENT '创建人',
  `last_update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  `last_update_user_id` varchar(20) DEFAULT NULL COMMENT '更新人',
  `revision` int(10) DEFAULT '1' COMMENT '版本号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='email配置表';


==================================================================

CREATE TABLE `qshop_code` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `type` varchar(40) NOT NULL COMMENT '业务类型',
  `current` bigint(20) unsigned NOT NULL COMMENT '当前值',
  `code_length` int(20) DEFAULT NULL,
  `create_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_index` (`type`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='系统code发号表';

==================================================================

CREATE TABLE `qshop_worker_node` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id主键',
  `host_name` varchar(64) NOT NULL COMMENT '机器host名',
  `port` varchar(64) NOT NULL COMMENT '端口号',
  `type` tinyint(3) unsigned NOT NULL DEFAULT '2' COMMENT '节点类型: CONTAINER(1), ACTUAL(2)',
  `launch_date` date NOT NULL COMMENT '启动日期',
  `create_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='IDGenerator WorkerID配置表';