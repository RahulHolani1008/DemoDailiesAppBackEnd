-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 05, 2020 at 10:32 AM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_dailies`
--

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
CREATE TABLE IF NOT EXISTS `class` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `classname` text NOT NULL,
  `description` text NOT NULL,
  `starttime` text NOT NULL,
  `endtime` text NOT NULL,
  `daysofweek` text NOT NULL,
  `teacherid` int(255) NOT NULL,
  `countofstudent` int(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`id`, `classname`, `description`, `starttime`, `endtime`, `daysofweek`, `teacherid`, `countofstudent`) VALUES
(1, '12th', 'Ram', '7PM', '6PM', '8', 1, 4),
(2, '10th', 'Ram', '7PM', '6PM', '8', 1, 0),
(3, '8th', 'Raaj', '7PM', '6PM', '8', 1, 4);

-- --------------------------------------------------------

--
-- Table structure for table `perant`
--

DROP TABLE IF EXISTS `perant`;
CREATE TABLE IF NOT EXISTS `perant` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `fullname` text NOT NULL,
  `email` text NOT NULL,
  `password` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perant`
--

INSERT INTO `perant` (`id`, `fullname`, `email`, `password`) VALUES
(1, 'Rahul', 'abc@gamil.com', 'abcde');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classid` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `parentid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `classid`, `email`, `fullname`, `parentid`) VALUES
(1, 0, 'Peeyusgc@gamil.com', 'Peeyush', 1),
(2, 2, 'suresh@gmail.com', 'suresh', 1),
(3, 2, 'mukesh@gmail.com', 'mukesh', 1),
(4, 2, 'rishabh@gmail.com', 'rishabh', 1),
(5, 2, 'pankaj@gmail.com', 'pankaj', 1),
(6, 2, 'sachin', 'sachin', 1);

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE IF NOT EXISTS `teacher` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `fullname` text NOT NULL,
  `email` text NOT NULL,
  `password` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`id`, `fullname`, `email`, `password`) VALUES
(1, 'Deepak', 'pqr@gamil.com', 'bbcde');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
