create database if not exists Furama_database;
use Furama_database;
create table if not exists ViTri(
IDViTri int not null primary key,
TenViTri varchar(45)
)engine = InnoDB;
use Furama_database;
create table if not exists TrinhDo(
IDTrinhDo int not null primary key,
TrinhDo varchar(45)
)engine = InnoDB;
use Furama_database;
create table if not exists BoPhan(
IDBoPhan int not null primary key,
TenBoPhan varchar(45)
)engine = InnoDB;
use Furama_database;

create table if not exists LoaiKhach(
IDLoaiKhach int not null primary key,
TenLoaiKhach varchar(45)
)engine = InnoDB;

use Furama_database;
create table if not exists KieuThue(
IDKieuThue int not null primary key,
TenKieuThue varchar(45),
Gia int
)engine = InnoDB;

use Furama_database;
create table if not exists LoaiDichVu(
IDLoaiDichVu int not null primary key,
TenLoaiDichVu varchar(45)
)engine = InnoDB;

use Furama_database;
create table if not exists NhanVien(
IDNhanVien int not null primary key auto_increment,
HoTen varchar(45) not null,
IDViTri int not null,
IDTrinhDo int not null,
IDBoPhan int not null,
NgaySinh date not null,
SoCMND varchar(45) not null,
Luong varchar(45) not null,
SDT varchar(45) not null,
Email varchar(45) not null,
DiaChi varchar(45) not null,
foreign key (IDViTri) references ViTri(IDViTri),
foreign key (IDTrinhDo) references TrinhDo(IDTrinhDo),
foreign key (IDBoPhan) references BoPhan(IDBoPhan)
)engine = InnoDB;

use Furama_database;
create table if not exists Khachhang(
IDKhachHang int not null primary key,
IDLoaiKhach int not null,
HoTen varchar(45),
NgaySinh date,
SoCMND varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45),
foreign key (IDLoaiKhach) references LoaiKhach(IDLoaiKhach)
)engine = InnoDB;

use Furama_database;
create table if not exists DichVu(
IDDichVu int not null primary key,
TenDichVu varchar(45),
DienTich int,
SoTang int,
SoNguoiToiDa varchar(45),
ChiPhiThue varchar(45),
IdKieuThue int,
IdLoaiDichVu int,
TrangThai varchar(45),
foreign key (IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu),
foreign key (IDKieuThue) references KieuThue(IDKieuThue)
)engine = InnoDB;

use Furama_database;
create table if not exists HopDong(
IDHopDong int not null primary key,
IDNhanVien int,
IDKhachHang int,
IDDichVu int,
NgayLamHopDong date,
NgayKetThuc date,
TienDatCoc int,
TongTien int,
foreign key (IDNhanVien) references NhanVien(IDNhanVien),
foreign key (IDKhachHang) references KhachHang(IDKhachHang),
foreign key (IDDichVu) references DichVu(IDDichVu)
)engine = InnoDB;

use Furama_database;
create table if not exists DichVuDiKem(
IDDichVuDiKem int not null primary key,
TenDichVuDiKem varchar(45),
Gia int,
DonVi int,
TrangThaiKhaDung varchar(45)
)engine = InnoDB;

use Furama_database;
create table if not exists HopDongChiTiet(
IDHopDongChiTiet int not null primary key,
IDHopDong int,
IDDichVuDiKem int,
SoLuong int,
foreign key (IDHopDong) references HopDong(IDHopDong),
foreign key (IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)

)engine = InnoDB;

