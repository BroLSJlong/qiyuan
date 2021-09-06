/*
Navicat MySQL Data Transfer

Source Server         : ALiyun
Source Server Version : 50735
Source Host           : 112.74.44.189:3306
Source Database       : qiyuan

Target Server Type    : MYSQL
Target Server Version : 50735
File Encoding         : 65001

Date: 2021-09-06 10:45:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for accounttable
-- ----------------------------
DROP TABLE IF EXISTS `accounttable`;
CREATE TABLE `accounttable` (
  `idCard` varchar(18) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `pwd` varchar(16) NOT NULL,
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for dynamicdetailtable
-- ----------------------------
DROP TABLE IF EXISTS `dynamicdetailtable`;
CREATE TABLE `dynamicdetailtable` (
  `dynamicId` varchar(32) NOT NULL,
  `imgId` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for dynamictable
-- ----------------------------
DROP TABLE IF EXISTS `dynamictable`;
CREATE TABLE `dynamictable` (
  `dynamicId` varchar(32) NOT NULL,
  `idCard` varchar(18) NOT NULL,
  `content` varchar(200) NOT NULL,
  `time` varchar(32) NOT NULL,
  `thumb` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`dynamicId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for dynamictalktable
-- ----------------------------
DROP TABLE IF EXISTS `dynamictalktable`;
CREATE TABLE `dynamictalktable` (
  `dynamicId` varchar(32) NOT NULL,
  `idCard` varchar(18) NOT NULL,
  `talkContent` varchar(200) NOT NULL,
  `talkTime` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for friendtable
-- ----------------------------
DROP TABLE IF EXISTS `friendtable`;
CREATE TABLE `friendtable` (
  `idCard` varchar(18) NOT NULL,
  `fIdCard` varchar(18) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for imgtable
-- ----------------------------
DROP TABLE IF EXISTS `imgtable`;
CREATE TABLE `imgtable` (
  `imgId` varchar(40) NOT NULL,
  `idCard` varchar(18) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for messagetable
-- ----------------------------
DROP TABLE IF EXISTS `messagetable`;
CREATE TABLE `messagetable` (
  `idCard` varchar(18) NOT NULL,
  `messageIdCard` varchar(18) NOT NULL,
  `message` varchar(200) NOT NULL,
  `messageTime` varchar(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for usertable
-- ----------------------------
DROP TABLE IF EXISTS `usertable`;
CREATE TABLE `usertable` (
  `userName` varchar(32) DEFAULT NULL,
  `realName` varchar(12) DEFAULT NULL,
  `age` varchar(2) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `idCard` varchar(18) NOT NULL,
  `born` varchar(14) DEFAULT NULL,
  `area` varchar(36) DEFAULT NULL,
  `imgId` varchar(40) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `food` varchar(10) DEFAULT NULL,
  `kids` varchar(8) DEFAULT NULL,
  `state` varchar(10) DEFAULT NULL,
  `height` varchar(3) DEFAULT NULL,
  `userPhone` varchar(11) DEFAULT NULL,
  `language` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idCard`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
