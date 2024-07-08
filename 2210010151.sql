-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 08, 2024 at 11:12 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `2210010151`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kode_barang` varchar(20) NOT NULL,
  `nama_barang` varchar(255) NOT NULL,
  `satuan` varchar(255) NOT NULL,
  `harga_beli` varchar(255) NOT NULL,
  `harga_jual` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kode_barang`, `nama_barang`, `satuan`, `harga_beli`, `harga_jual`) VALUES
('12', 'poll', '23', '250000', '300000'),
('2', 'dca', '32', '22', '3'),
('22', 'pupuk', '23', '400', '600'),
('34', 'plastik', '4', '40', '50');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `kode_pelanggan*` int(15) NOT NULL,
  `nama_pelanggan` varchar(20) NOT NULL,
  `alamat_pelanggan` varchar(20) NOT NULL,
  `telp_pelanggan` int(20) NOT NULL,
  `fax_pelanggan` int(15) NOT NULL,
  `email_pelanggan` int(20) NOT NULL,
  `tgl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE `pembelian` (
  `kode_beli` varchar(20) NOT NULL,
  `kode_suplier` varchar(20) NOT NULL,
  `nofaktur` varchar(15) NOT NULL,
  `tglfaktur` varchar(50) NOT NULL,
  `harga_beli` varchar(20) NOT NULL,
  `harga_jual` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`kode_beli`, `kode_suplier`, `nofaktur`, `tglfaktur`, `harga_beli`, `harga_jual`) VALUES
('02', '02', '02', '12-10-2024', '2', '2'),
('1', '2', '213', '12-10-2024', '800.000', '1.300.000');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `kode_penjualan` varchar(255) NOT NULL,
  `nofaktur` varchar(255) NOT NULL,
  `tglfaktur` varchar(255) NOT NULL,
  `harga_beli` varchar(255) NOT NULL,
  `harga_jual` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`kode_penjualan`, `nofaktur`, `tglfaktur`, `harga_beli`, `harga_jual`) VALUES
('02', '02', '12-10-2024', '1', '2'),
('1', '213', '12-10-2024', '1.000.000', '1.500.000');

-- --------------------------------------------------------

--
-- Table structure for table `suplier`
--

CREATE TABLE `suplier` (
  `kode_suplier` varchar(20) NOT NULL,
  `nama_suplier` varchar(150) NOT NULL,
  `alamat_suplier` varchar(255) NOT NULL,
  `telp_suplier` varchar(255) NOT NULL,
  `email_suplier` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `suplier`
--

INSERT INTO `suplier` (`kode_suplier`, `nama_suplier`, `alamat_suplier`, `telp_suplier`, `email_suplier`) VALUES
('09', 'sn', 'ihciancicnjcb', 'sjub', 'ush'),
('1', 'PT BASIRIH', 'JL. GUBERNUR SOEBARJO', '0511 2811 22', 'basirih@company.com');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userid**` int(255) NOT NULL,
  `pass` int(255) NOT NULL,
  `level_user` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`kode_pelanggan*`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`kode_beli`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`kode_penjualan`);

--
-- Indexes for table `suplier`
--
ALTER TABLE `suplier`
  ADD PRIMARY KEY (`kode_suplier`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userid**`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
