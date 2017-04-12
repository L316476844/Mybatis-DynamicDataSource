CREATE TABLE `realtor_admin` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
	`username` VARCHAR(20) NULL DEFAULT NULL COMMENT '用户名',
	`password` VARCHAR(50) NULL DEFAULT NULL COMMENT '密码',
	`type` TINYINT(2) NULL DEFAULT NULL COMMENT '管理员类型 0-经纪机构 1-门店',
	`company_id` BIGINT(20) NULL DEFAULT NULL COMMENT '经纪公司ID',
	`company_name` VARCHAR(40) NULL DEFAULT NULL COMMENT '公司名称',
	`store_id` BIGINT(20) NULL DEFAULT NULL COMMENT '经纪门店ID',
	`status` TINYINT(2) NULL DEFAULT NULL COMMENT '账号状态  0-正常 1-停用 9-异常',
	`contact_name` VARCHAR(20) NULL DEFAULT NULL COMMENT '联系人',
	`contact_mobile` VARCHAR(20) NULL DEFAULT NULL COMMENT '联系电话',
	`contract_no` VARCHAR(30) NULL DEFAULT NULL COMMENT '服务合同编号',
	`creater` BIGINT(20) NULL DEFAULT NULL COMMENT '创建人ID',
	`create_time` DATETIME NULL DEFAULT NULL COMMENT '创建时间',
	`modifier` BIGINT(20) NULL DEFAULT NULL COMMENT '最后修改人',
	`modify_time` DATETIME NULL DEFAULT NULL COMMENT '最后修改时间',
	`version` BIGINT(20) NULL DEFAULT NULL COMMENT '版本号',
	PRIMARY KEY (`id`),
	UNIQUE INDEX `username` (`username`)
)
COMMENT='经纪合作平台管理员表'
ENGINE=InnoDB
ROW_FORMAT=DEFAULT
AUTO_INCREMENT=4

INSERT INTO `realtor_admin` (`id`, `username`, `password`, `type`, `company_id`, `company_name`, `store_id`, `status`, `contact_name`, `contact_mobile`, `contract_no`, `creater`, `create_time`, `modifier`, `modify_time`, `version`) VALUES (1, 'write', '111', 0, 1, 'write', NULL, 0, 'write', '1223344554', 'asas', -1, '2016-11-04 13:38:12', NULL, NULL, 0);

INSERT INTO `realtor_admin` (`id`, `username`, `password`, `type`, `company_id`, `company_name`, `store_id`, `status`, `contact_name`, `contact_mobile`, `contract_no`, `creater`, `create_time`, `modifier`, `modify_time`, `version`) VALUES (1, 'read', '123456', 0, 1, 'read', NULL, 0, 'read', '123456789', 'xdssddsd', -1, '2016-11-04 13:37:13', NULL, NULL, 0);

