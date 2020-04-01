/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50725
Source Host           : 127.0.0.1:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-08-15 21:41:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `admain` bit(1) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('4', '唐伯虎', '123456', '', 't@qq.com');
INSERT INTO `employee` VALUES ('5', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('6', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('7', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('8', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('9', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('10', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('11', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('12', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('13', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('14', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('15', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('16', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('17', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('18', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('19', '大仙', '123456', '\0', 'daxian@qq.com');
INSERT INTO `employee` VALUES ('21', '大仙', '123456', '\0', 'daxian@qq.com');
