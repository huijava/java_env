/*
Navicat MySQL Data Transfer

Source Server         : phpstudy
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : jikeh

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2018-05-26 23:47:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '极客慧', '28', '1');
INSERT INTO `user` VALUES ('2', 'Java慧', '24', '2');
INSERT INTO `user` VALUES ('3', 'PHP慧', '30', '1');
