-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 31 Agu 2023 pada 15.57
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bekuin`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(150) NOT NULL,
  `harga_barang` int(50) NOT NULL,
  `kategori_barang` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `harga_barang`, `kategori_barang`) VALUES
(1, 'fiesta karage', 50000, 'nugget'),
(7, 'fiesta cheese', 47000, 'nugget'),
(8, 'fiesta crispy crunch', 28000, 'nugget'),
(9, 'fiesta dino', 48000, 'nugget'),
(10, 'fiesta nugget', 45000, 'nugget'),
(11, 'fiesta pok-pok', 48000, 'nugget'),
(12, 'fiesta stikie', 45000, 'nugget'),
(13, 'champ ABC', 34500, 'nugget'),
(14, 'champ coin', 34500, 'nugget'),
(15, 'champ stik', 37000, 'nugget'),
(16, 'akumo nugget', 25000, 'nugget'),
(17, 'champ nugget', 37000, 'nugget'),
(18, 'okey stik', 23000, 'nugget'),
(19, 'so good alphabet', 42000, 'nugget'),
(20, 'so good animal', 42000, 'nugget'),
(21, 'so good dinobites', 42000, 'nugget'),
(22, 'so good nugget original', 40000, 'nugget'),
(23, 'so good katsu', 45000, 'nugget'),
(24, 'so good donat', 43000, 'nugget'),
(25, 'so good spicy wing', 49000, 'nugget'),
(26, 'so nice sedaaap', 28000, 'nugget'),
(27, 'so eco nugget', 21000, 'nugget'),
(28, 'goldstar nugget', 36000, 'nugget'),
(29, 'goldstar stik cheese', 38000, 'nugget'),
(30, 'goldstar karage', 40000, 'nugget'),
(31, 'goldstar pok-pok', 39000, 'nugget'),
(32, 'goldstar katsu', 38500, 'nugget'),
(33, 'goldstar gold karage', 44000, 'nugget'),
(34, 'minaku kaki naga', 16000, 'nugget'),
(35, 'minaku sisik naga', 17500, 'nugget'),
(36, 'minaku n.hati', 15000, 'nugget'),
(37, 'minaku n.ice cream', 15000, 'nugget'),
(38, 'minaku n.stik', 16000, 'nugget'),
(39, 'minaku n.ikan', 23000, 'nugget'),
(40, 'minaku n.udang', 24000, 'nugget'),
(41, 'minaku n.original', 17000, 'nugget'),
(42, 'bernadi bakso sapi 16 pcs', 27000, 'bakso'),
(43, 'bernadi bakso sapi curah', 35000, 'bakso'),
(44, 'prima bakso besar', 73000, 'bakso'),
(45, 'prima bakso kecil', 39000, 'bakso'),
(46, 'champ chicken ball', 28000, 'bakso'),
(47, 'minaku bola ikan', 24000, 'bakso'),
(48, 'minaku fried fish ball', 25000, 'bakso'),
(49, 'daitsabu mix fish ball', 20000, 'bakso'),
(50, 'minaku bola cumi', 27500, 'bakso'),
(51, 'minaku bola salmon', 27500, 'bakso'),
(52, 'minaku bola lobster', 27500, 'bakso'),
(53, 'minaku bola kepiting', 27500, 'bakso'),
(54, 'minaku bola udang', 27500, 'bakso'),
(55, 'bernadi sosis10 cm', 69000, 'sosis'),
(56, 'bernadi horeka sosis', 68000, 'sosis'),
(57, 'bernadi sosis 6 pcs', 66000, 'sosis'),
(58, 'bernadi delicious sosis 6 pcs', 25000, 'sosis'),
(59, 'vitalia sosis sapi', 59000, 'sosis'),
(60, 'vitalia sosis bakar', 66000, 'sosis'),
(61, 'minaku sosis bakar', 32000, 'sosis'),
(62, 'champ sosis sapi', 33000, 'sosis'),
(63, 'champ', 42000, 'sosis'),
(64, 'asimo', 18000, 'sosis'),
(65, 'sedaaap', 17000, 'sosis'),
(66, 'okey', 21000, 'sosis'),
(67, 'so nice ayam 1 toples', 21000, 'sosis'),
(68, 'so nice sapi 1 toples', 21000, 'sosis'),
(69, 'so nice 1 pcs', 1000, 'sosis'),
(70, 'vitalia', 58000, 'sosis'),
(71, 'delmonte sambal', 21000, 'sauce'),
(72, 'delmonte tomat', 15000, 'sauce'),
(73, 'mc lewis sambal 1 kg', 14000, 'sauce'),
(74, 'mc lewis tomat 1 kg', 14000, 'sauce'),
(75, 'aaa sambal bangkok', 9000, 'sauce'),
(76, 'euro mayo botol', 18500, 'sauce'),
(77, 'euro mayo 1 kg', 29000, 'sauce'),
(78, 'maestro mayo 180', 9000, 'sauce'),
(79, 'maestro mayo 1 kg', 29500, 'sauce'),
(80, 'delmonte bbq 250', 9000, 'sauce'),
(81, 'mc lewis bbq 1 kg', 39000, 'sauce'),
(82, 'delmonte spaghetti', 9000, 'sauce'),
(83, 'AAA saus tiram', 16000, 'sauce'),
(84, 'saori tiram', 20000, 'sauce'),
(85, 'saori teriyaki', 20000, 'sauce'),
(86, 'AAA marinade', 15000, 'sauce'),
(87, 'lee kum kee saus tiram', 30000, 'sauce'),
(88, 'AAA kecap asin ', 6000, 'sauce'),
(89, 'AAA seafood soy', 7000, 'sauce'),
(90, 'AAA sedap rasa', 12000, 'sauce'),
(91, 'AAA sesame oil', 34000, 'sauce'),
(92, 'AAA suki 140', 9000, 'sauce'),
(93, 'AAA suki 275', 16000, 'sauce'),
(94, 'raja rasa 300 ml', 18000, 'sauce'),
(95, 'raja rasa 600 ml', 32000, 'sauce'),
(96, 'euro saus keju cair 500 gram', 22000, 'sauce'),
(97, 'bu daeng sambal ijo ', 18500, 'sauce'),
(98, 'bu daeng sambal ebi', 18500, 'sauce'),
(99, 'bu daeng sambal ikan asap', 18500, 'sauce'),
(100, 'bu daeng sambal korek', 18500, 'sauce'),
(101, 'bu daeng sambal balacan', 18500, 'sauce '),
(102, 'bu daeng sambal teri', 18500, 'sauce'),
(103, 'abcdefgh', 15000, 'nugget');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kategori`
--

CREATE TABLE `kategori` (
  `id_kategori` int(11) NOT NULL,
  `kategori` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `kategori`) VALUES
(1, 'nugget'),
(2, 'sosis'),
(3, 'bakso'),
(4, 'saus');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` int(11) NOT NULL,
  `kode_pelanggan` varchar(100) NOT NULL,
  `nama_pelanggan` varchar(150) NOT NULL,
  `alamat_pelanggan` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `kode_pelanggan`, `nama_pelanggan`, `alamat_pelanggan`) VALUES
(1, 'P0001', 'Tata Surya', 'Menanggal'),
(2, 'P0002', 'Rosalia', 'Waru'),
(3, 'P0003', 'Jaja Juju', 'Gedangan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `kode_transaksi` varchar(200) NOT NULL,
  `kasir` varchar(100) NOT NULL,
  `kode_pelanggan` varchar(100) NOT NULL,
  `jenis_pembeli` varchar(50) NOT NULL,
  `nama_pembeli` varchar(150) NOT NULL,
  `barang` varchar(150) NOT NULL,
  `harga` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `grand_total` int(11) NOT NULL,
  `tanggal` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `kode_transaksi`, `kasir`, `kode_pelanggan`, `jenis_pembeli`, `nama_pembeli`, `barang`, `harga`, `jumlah`, `total`, `grand_total`, `tanggal`) VALUES
(21, 'bERQwXiJln', 'Nadiya', 'P0002', 'Pelanggan', 'Rosalia', 'fiesta dino', 48000, 2, 96000, 361000, '2023-04-12 03:57:21'),
(22, 'bERQwXiJln', 'Nadiya', 'P0002', 'Pelanggan', 'Rosalia', 'minaku bola lobster', 27500, 2, 55000, 0, '2023-04-12 03:57:25'),
(23, 'bERQwXiJln', 'Nadiya', 'P0002', 'Pelanggan', 'Rosalia', 'champ', 42000, 5, 210000, 0, '2023-04-12 03:57:30'),
(24, 'l2cdyjm3Qr', 'Nadiya', '-', 'Pembeli', 'Jaja Juju', 'AAA sesame oil', 34000, 2, 68000, 268500, '2023-04-12 03:48:07'),
(25, 'l2cdyjm3Qr', 'Nadiya', '-', 'Pembeli', 'Jaja Juju', 'AAA saus tiram', 16000, 3, 48000, 0, '2023-04-12 03:48:07'),
(26, 'l2cdyjm3Qr', 'Nadiya', '-', 'Pembeli', 'Jaja Juju', 'aaa sambal bangkok', 9000, 3, 27000, 0, '2023-04-12 03:48:07'),
(27, 'l2cdyjm3Qr', 'Nadiya', '-', 'Pembeli', 'Jaja Juju', 'euro mayo botol', 18500, 2, 37000, 0, '2023-04-12 03:48:07'),
(28, 'l2cdyjm3Qr', 'Nadiya', '-', 'Pembeli', 'Jaja Juju', 'maestro mayo 1 kg', 29500, 3, 88500, 0, '2023-04-12 03:48:07'),
(29, '2I7C3FNj65', 'Dedi', 'P0001', 'Pelanggan', 'Tata Surya', 'okey stik', 23000, 3, 69000, 222000, '2023-04-12 03:56:58'),
(30, '2I7C3FNj65', 'Dedi', 'P0001', 'Pelanggan', 'Tata Surya', 'minaku kaki naga', 16000, 3, 48000, 0, '2023-04-12 03:57:01'),
(31, '2I7C3FNj65', 'Dedi', 'P0001', 'Pelanggan', 'Tata Surya', 'bernadi bakso sapi curah', 35000, 3, 105000, 0, '2023-04-12 03:57:05'),
(32, '641t9lTMuq', 'Dedi', 'P0001', 'Pelanggan', 'Tata Surya', 'fiesta dino', 48000, 3, 144000, 302000, '2023-04-12 03:57:09'),
(33, '641t9lTMuq', 'Dedi', 'P0001', 'Pelanggan', 'Tata Surya', 'fiesta stikie', 45000, 3, 135000, 0, '2023-04-12 03:57:11'),
(34, '641t9lTMuq', 'Dedi', 'P0001', 'Pelanggan', 'Tata Surya', 'okey stik', 23000, 1, 23000, 0, '2023-04-12 03:57:18'),
(35, 'UicoEjNs5U', 'Dedi', 'P0002', 'Pelanggan', 'Rosalia', 'fiesta dino', 48000, 4, 192000, 253800, '2023-04-12 04:00:41'),
(36, 'UicoEjNs5U', 'Dedi', 'P0002', 'Pelanggan', 'Rosalia', 'fiesta stikie', 45000, 2, 90000, 0, '2023-04-12 04:00:41');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `nama_user` varchar(150) NOT NULL,
  `username` varchar(150) NOT NULL,
  `password` varchar(100) NOT NULL,
  `level` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `nama_user`, `username`, `password`, `level`) VALUES
(1, 'Nana', 'admin_nana', 'nana123', 'admin'),
(2, 'Dedi', 'kasir_dedi', 'dedi123', 'kasir'),
(3, 'Nadiya', 'kasir_nadiya', 'nadiya123', 'kasir');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indeks untuk tabel `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `barang`
--
ALTER TABLE `barang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=104;

--
-- AUTO_INCREMENT untuk tabel `kategori`
--
ALTER TABLE `kategori`
  MODIFY `id_kategori` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `id_pelanggan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
