/*
SQLyog Ultimate v8.32 
MySQL - 5.5.45 : Database - db_goods
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_goods` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_goods`;

/*Table structure for table `t_goodslist` */

DROP TABLE IF EXISTS `t_goodslist`;

CREATE TABLE `t_goodslist` (
  `gid` int(11) NOT NULL,
  `gname` varchar(10) NOT NULL,
  `gprice` double NOT NULL,
  `gnum` int(11) DEFAULT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_goodslist` */

insert  into `t_goodslist`(`gid`,`gname`,`gprice`,`gnum`) values (1,'足球',35,5),(2,'篮球',52.5,20),(3,'乒乓球',0.5,100),(4,'羽毛球',1.5,200),(5,'棒球',30,20),(6,'橄榄球',55.55,20),(7,'桌球',30,20);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
