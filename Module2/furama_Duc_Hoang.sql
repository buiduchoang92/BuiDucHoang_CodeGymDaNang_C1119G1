 drop database if exists furama_resort_hoang;
create database furama_resort_hoang;
use furama_resort_hoang;

CREATE TABLE IF NOT EXISTS ViTri (
    IDViTri INT NOT NULL PRIMARY KEY,
    TenViTri VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS TrinhDo (
    IDTrinhDo INT NOT NULL PRIMARY KEY,
    TrinhDo VARCHAR(45)
)  ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS BoPhan (
    IDBoPhan INT NOT NULL PRIMARY KEY,
    TenBoPhan VARCHAR(45)
)  ENGINE=INNODB;


CREATE TABLE IF NOT EXISTS LoaiKhach (
    IDLoaiKhach INT NOT NULL PRIMARY KEY,
    TenLoaiKhach VARCHAR(45)
)  ENGINE=INNODB;


CREATE TABLE IF NOT EXISTS KieuThue (
    IDKieuThue INT NOT NULL PRIMARY KEY,
    TenKieuThue VARCHAR(45),
    Gia INT
)  ENGINE=INNODB;


CREATE TABLE IF NOT EXISTS LoaiDichVu (
    IDLoaiDichVu INT NOT NULL PRIMARY KEY,
    TenLoaiDichVu VARCHAR(45)
)  ENGINE=INNODB;


CREATE TABLE IF NOT EXISTS NhanVien (
    IDNhanVien INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    HoTen VARCHAR(45) NOT NULL,
    IDViTri INT NOT NULL,
    IDTrinhDo INT NOT NULL,
    IDBoPhan INT NOT NULL,
    NgaySinh DATE NOT NULL,
    SoCMND VARCHAR(45) NOT NULL,
    Luong VARCHAR(45) NOT NULL,
    SDT VARCHAR(45) NOT NULL,
    Email VARCHAR(45) NOT NULL,
    DiaChi VARCHAR(45) NOT NULL,
    FOREIGN KEY (IDViTri)
        REFERENCES ViTri (IDViTri),
    FOREIGN KEY (IDTrinhDo)
        REFERENCES TrinhDo (IDTrinhDo),
    FOREIGN KEY (IDBoPhan)
        REFERENCES BoPhan (IDBoPhan)
)  ENGINE=INNODB;


CREATE TABLE IF NOT EXISTS Khachhang (
    IDKhachHang INT NOT NULL PRIMARY KEY,
    IDLoaiKhach INT NOT NULL,
    HoTen VARCHAR(45),
    NgaySinh DATE,
    SoCMND VARCHAR(45),
    SDT VARCHAR(45),
    Email VARCHAR(45),
    DiaChi VARCHAR(45),
    FOREIGN KEY (IDLoaiKhach)
        REFERENCES LoaiKhach (IDLoaiKhach)
)  ENGINE=INNODB;


CREATE TABLE IF NOT EXISTS DichVu (
    IDDichVu INT NOT NULL PRIMARY KEY,
    TenDichVu VARCHAR(45),
    DienTich INT,
    SoTang INT,
    SoNguoiToiDa VARCHAR(45),
    ChiPhiThue VARCHAR(45),
    IdKieuThue INT,
    IdLoaiDichVu INT,
    TrangThai VARCHAR(45),
    FOREIGN KEY (IDLoaiDichVu)
        REFERENCES LoaiDichVu (IDLoaiDichVu),
    FOREIGN KEY (IDKieuThue)
        REFERENCES KieuThue (IDKieuThue)
)  ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS HopDong (
    IDHopDong INT NOT NULL PRIMARY KEY,
    IDNhanVien INT,
    IDKhachHang INT,
    IDDichVu INT,
    NgayLamHopDong DATE,
    NgayKetThuc DATE,
    TienDatCoc INT,
    TongTien INT,
    FOREIGN KEY (IDNhanVien)
        REFERENCES NhanVien (IDNhanVien),
    FOREIGN KEY (IDKhachHang)
        REFERENCES KhachHang (IDKhachHang),
    FOREIGN KEY (IDDichVu)
        REFERENCES DichVu (IDDichVu)
)  ENGINE=INNODB;


CREATE TABLE IF NOT EXISTS DichVuDiKem (
    IDDichVuDiKem INT NOT NULL PRIMARY KEY,
    TenDichVuDiKem VARCHAR(45),
    Gia INT,
    DonVi VARCHAR(45),
    TrangThaiKhaDung VARCHAR(45)
)  ENGINE=INNODB;


CREATE TABLE IF NOT EXISTS HopDongChiTiet (
    IDHopDongChiTiet INT NOT NULL PRIMARY KEY,
    IDHopDong INT,
    IDDichVuDiKem INT,
    SoLuong INT,
    FOREIGN KEY (IDHopDong)
        REFERENCES HopDong (IDHopDong),
    FOREIGN KEY (IDDichVuDiKem)
        REFERENCES DichVuDiKem (IDDichVuDiKem)
)  ENGINE=INNODB;
insert into loaikhach values(1000,"Diamond");
insert into loaikhach values(1001,"Platinium");
insert into loaikhach values(1002,"Gold");
insert into loaikhach values(1003,"Silver");
insert into loaikhach values(1004,"Member");
insert into khachhang values(1000,1004,"Bui Duc Ha",19920525,2345676,987654321,"ha@vn.com","DaNang");
insert into khachhang values(1001,1004,"Bui Duc Viet",19921025,2345676,987654321,"viet@vn.com","DaNang");
insert into khachhang values(1002,1003,"Dang Quoc Truong",20051125,21345678,09876123,"truong@vn.com","QuangNam");
insert into khachhang values(1003,1002,"Luu Dinh Quoc",19980223,9876532,5432167890,"quoc@vn.com","QuangTri");
insert into khachhang values(1004,1001,"Tran Minh Trieu",19960313,543876,9876054321,"trieu@vn.com","QuangNinh");
insert into khachhang values(1005,1000,"Nguyen Phu Quy",19500415,09876123,123458765,"quy@vn.com","HoChiMinh");
insert into kieuthue values(1000,"Nam",15000);
insert into kieuthue values(1001,"Thang",150);
insert into kieuthue values(1002,"Ngay",15);
insert into kieuthue values(1003,"Gia",5);
insert into dichvudikem values(1000,"Massage",100,"DoLa","KhaQuan");
insert into dichvudikem values(1001,"Karaoke",50,"DoLa","KhaQuan");
insert into dichvudikem values(1002,"ThucAn",55,"DoLa","KhaQuan");
insert into dichvudikem values(1003,"NuocUong",10,"DoLa","KhaQuan");
insert into dichvudikem values(1004,"XeDiChuyen",65,"DoLa","KhaQuan");
insert into loaidichvu values(1000,"Villa");
insert into loaidichvu values(1001,"House");
insert into loaidichvu values(1002,"Room");
insert into dichvu values(1000,"Villa1",150,4,5,170,1000,1000,"KhaQuan");
insert into dichvu values(1001,"Room1",160,1,2,170,1001,1002,"KhaQuan");
insert into dichvu values(1002,"Villa2",170,3,3,170,1002,1000,"KhaQuan");
insert into dichvu values(1003,"House2",110,5,4,170,1003,1001,"KhaQuan");
insert into dichvu values(1004,"House1",120,6,5,170,1001,1001,"KhaQuan");
insert into dichvu values(1005,"Villa3",130,2,6,170,1003,1002,"KhaQuan");
insert into vitri values(1000,"GiamDoc");
insert into vitri values(1001,"QuanLi");
insert into vitri values(1002,"NVBuongPhong");
insert into vitri values(1003,"NVBaoVe");
insert into vitri values(1004,"NVLeTan");
insert into trinhdo values(1000,"ThacSi");
insert into trinhdo values(1001,"DaiHoc");
insert into trinhdo values(1002,"CaoDang");
insert into trinhdo values(1003,"TrungCap");
insert into trinhdo values(1004,"PhoThong");
insert into bophan values(1000,"KiThuat");
insert into bophan values(1001,"ChamSocKhachHang");
insert into bophan values(1002,"QuanLi");
insert into nhanvien values(1000,"NguyenThanhKien",1000,1001,1002,19931112,2134567,15000000,34567,"ha","QuangTri");
insert into nhanvien values(1001,"BuiDinhVu",1001,1001,1002,19931112,2134567,15000000,34567,"ha","DaNang");
insert into nhanvien values(1002,"NguyenCongTruong",1002,1001,1001,19931112,2134567,15000000,34567,"ha","QuangNgai");
insert into nhanvien values(1003,"BuiDucHoang",1003,1001,1000,19931112,2134567,15000000,34567,"ha","Hue");
insert into nhanvien values(1004,"LuuVanDuc",1002,1002,1001,19931112,2134567,15000000,34567,"ha","QuangTri");
insert into hopdong values(1000,1001,1000,1000,20191025,20200125,15,700);
insert into hopdong values(1001,1000,1000,1000,20191025,20200125,15,700);
insert into hopdong values(1002,1002,1000,1001,20191025,20200225,15,700);
insert into hopdong values(1003,1003,1001,1001,20191025,20200325,15,700);
insert into hopdong values(1004,1004,1001,1002,20191025,20200425,15,700);
insert into hopdong values(1005,1001,1002,1003,20191025,20191125,15,700);
insert into hopdong values(1006,1000,1005,1004,20191025,20201027,15,700);
insert into hopdong values(1007,1002,1003,1005,20191025,20201026,15,700);
insert into hopdong values(1008,1004,1004,1002,20181025,20201025,15,700);
insert into hopdongchitiet values(1000,1000,1001,3);
insert into hopdongchitiet values(1001,1001,1003,1);
insert into hopdongchitiet values(1002,1002,1004,2);
insert into hopdongchitiet values(1003,1004,1003,1);
insert into hopdongchitiet values(1004,1005,1002,2);
insert into hopdongchitiet values(1005,1003,1000,1);
-- 2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select*from nhanvien 
where (HoTen like  "%k___") or (HoTen like "%h____") or (HoTen like "%t_____") ;
-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ 
-- ở “Đà Nẵng” hoặc “Quảng Trị”.
select*from nhanvien
where (((DiaChi = "DaNang") or (DiaChi = "QuangTri")) and ((year(now()) - year(NgaySinh)) between 18 and 50));
--- 4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “VIP”.
select hopdong.IDHopDong,khachhang.HoTen,count(hopdong.IDKhachHang)as demhopdong from khachhang
inner join hopdong on hopdong.IDKhachHang = khachhang.IDKhachHang
inner join loaikhach on loaikhach.IDLoaiKhach = khachhang.IDLoaiKhach
where loaikhach.IDLoaiKhach = 1000
group by khachhang.HoTen;
-- 5.Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select khachhang.IDKhachHang,khachhang.HoTen,
hopdong.IDHopDong,dichvu.TenDichVu,
hopdong.NgayLamHopDong,hopdong.NgayKetThuc,
sum(dichvu.ChiPhiThue+hopdongchitiet.SoLuong*dichvudikem.Gia) as tongtien
from khachhang
left join hopdong on hopdong.IDKhachHang = khachhang.IDKhachHang
left join dichvu on hopdong.IDDichVu = dichvu.IDDichVu
left join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
left join dichvudikem on dichvudikem.IDDichVuDiKem = hopdongchitiet.IDDichVuDiKem
group by khachhang.HoTen;
-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select dichvu.IDDichVu,dichvu.TenDichVu,dichvu.DienTich,
dichvu.ChiPhiThue,loaidichvu.TenLoaiDichVu
from dichvu
inner join loaidichvu on dichvu.IDLoaiDichVu = loaidichvu.IDLoaiDichVu
where not exists(select hopdong.IDHopDong from hopdong 
where(hopdong.NgayLamHopDong between "2019-01-01" and "2019-03-31")
and hopdong.IDDichVu = dichvu.IDDichVu);
-- 7.Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select dichvu.IDDichVu,dichvu.TenDichVu,dichvu.DienTich,dichvu.SoNguoiToiDa,dichvu.ChiPhiThue,loaidichvu.TenLoaiDichVu from dichvu
inner join loaidichvu on dichvu.IdLoaiDichVu = loaidichvu.IDLoaiDichVu
where exists(select hopdong.IDHopDong from hopdong where year(hopdong.NgayLamHopDong)= "2018" and hopdong.IDDichVu = dichvu.IDDichVu)
and not exists(select hopdong.IDHopDong from hopdong where year(hopdong.NgayLamHopDong)= "2019" and hopdong.IDDichVu = dichvu.IDDichVu);
--- 8.Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
select distinct khachhang.HoTen from khachhang;
select khachhang.HoTen from khachhang group by khachhang.HoTen;
select khachhang.HoTen from khachhang union select khachhang.HoTen from khachhang;
--- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select temp.month,count(month(hopdong.NgayLamHopDong)) as SoKhachHangDangKi, sum(hopdong.TongTien) as Tong_Tien from
(select 1 as month
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as temp
left join hopdong on month(hopdong.NgayLamHopDong) = temp.month
left join khachhang on khachhang.IDKhachHang = hopdong.IDKhachHang
where year(hopdong.NgayLamHopDong)="2019"
group by temp.month
order by temp.month ;
-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select hopdong.IDHopDong,hopdong.NgayLamHopDong,hopdong.NgayKetThuc,hopdong.TienDatCoc,count(hopdongchitiet.IDDichVuDiKem) as SoLuongDichVuDiKem
from hopdong
inner join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
group by hopdong.IDHopDong;
-- 11.Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “VIP” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select dichvudikem.TenDichVuDiKem,dichvudikem.Gia,dichvudikem.DonVi from hopdong
inner join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
inner join dichvudikem on dichvudikem.IDDichVuDiKem = hopdongchitiet.IDDichVuDiKem
inner join khachhang on khachhang.IDKhachHang = hopdong.IDKhachHang
inner join loaikhach on loaikhach.IDLoaiKhach = khachhang.IDLoaiKhach
where loaikhach.TenLoaiKhach = "Diamond" and khachhang.DiaChi in ("Vinh","QuangNgai");
-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select hopdong.IDhopDong,nhanvien.HoTen,khachhang.HoTen,khachhang.SDT,dichvu.TenDichVu,
count(hopdongchitiet.IDDichVuDiKem) as SoLuongDichVuDiKem
from hopdong
inner join nhanvien on nhanvien.IDNhanVien = hopdong.IDNhanVien
inner join khachhang on khachhang.IDKhachHang = hopdong.IDKhachHang
inner join dichvu on dichvu.IDDichVu = hopdong.IDDichVu
inner join hopdongchitiet on hopdongchitiet.IDHopDong = hopdong.IDHopDong
where not exists(select hopdong.IDHopDong where hopdong.NgayLamHopDong between "2019-01-01" and "2019-06-31")
and exists(select hopdong.IDHopDong where hopdong.NgayLamHopDong between "2019-09-01" and "2019-12-31");
-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
create temporary table temp
select dichvudikem.TenDichVuDiKem as ten_dich_vu_di_kem,
count(hopdongchitiet.IDDichVuDiKem) as so_lan_su_dung from hopdongchitiet
inner join dichvudikem on dichvudikem.IDDichVuDiKem = hopdongchitiet.IDDichVuDiKem
group by dichvudikem.TenDichVuDiKem; 
create temporary table temp1
select max(temp.so_lan_su_dung) as max_so_lan_su_dung from temp;
select temp.ten_dich_vu_di_kem,temp.so_lan_su_dung from temp
inner join temp1 on temp.so_lan_su_dung = temp1.max_so_lan_su_dung;
drop temporary table temp;
drop temporary table temp1;
-- 14.Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung;
select hopdong.IDHopDong,dichvu.TenDichVu,dichvudikem.TenDichVuDiKem,
count(hopdongchitiet.IDDichVuDiKem) as so_lan_su_dung from hopdong
inner join dichvu on hopdong.IDDichVu = dichvu.IDDichVu
inner join hopdongchitiet on hopdongchitiet.IDHopDong = hopdong.IDHopDong
inner join dichvudikem on dichvudikem.IDDichVuDiKem = hopdongchitiet.IDDichVuDiKem
group by (dichvudikem.TenDichVuDiKem) having so_lan_su_dung = 1;
-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
select nhanvien.HoTen,nhanvien.IDNhanVien,trinhdo.TrinhDo,
bophan.TenBoPhan,nhanvien.SDT,nhanvien.DiaChi, count(hopdong.IDNhanVien) as lan_lam_HD
from hopdong
inner join nhanvien on hopdong.IDNhanVien = nhanvien.IDNhanVien
inner join trinhdo on nhanvien.IDTrinhDo = trinhdo.IDTrinhDo
inner join bophan on bophan.IDBoPhan = nhanvien.IDBoPhan
where year(hopdong.NgayLamHopDong) between "2018" and "2019"
group by (nhanvien.HoTen) having lan_lam_HD < 4;
-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
create temporary table table3
select nhanvien.IDNhanVien as idNV,hopdong.IDHopDong as idHD from hopdong
inner join nhanvien on hopdong.IDNhanVien = nhanvien.IDNhanVien
where not exists (select nhanvien.IDNhanVien from hopdong
where hopdong.NgayLamHopDong between "2017-01-01" and "2019-12-31" and hopdong.IDNhanVien = nhanvien.IDNhanVien);
select* from table3;
delete from table3 where hopdong.IDHopDong in (select table3.idHD from table3);
delete from table3 where nhanvien.IDNhanVien in (select table3.idNV from table3);
SET SQL_SAFE_UPDATES = 0;
--- 17.Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ VIP1 lên VIP, chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
update khachhang,(select hopdong.IDKhachHang as id, sum(hopdong.TongTien) as tong_tien from hopdong
where year(hopdong.NgayLamHopDong) = "2019" 
group by hopdong.IDKhachHang
having tong_tien > 500) as temp
set khachhang.IDLoaiKhach=(select loaikhach.IDLoaiKhach from loaikhach where loaikhach.TenLoaiKhach = "Diamond" )
where khachhang.IDLoaiKhach=(select loaikhach.IDLoaiKhach from loaikhach where loaikhach.TenLoaiKhach = "Platinium")
and temp.id = khachhang.IDLoaiKhach;
--- 18
delete khachhang,hopdong,hopdongchitiet from hopdong
inner join khachhang on khachhang.IDKhachHang = hopdong.IDKhachHang
inner join hopdongchitiet on hopdongchitiet.IDHopDong = hopdong.IDHopDong
where not exists( select hopdong.IDHopDong where year(hopdong.NgayLamHopDong) > 2016 and hopdong.IDKhachHang = khachhang.IDKhachHang);
--- 19
update dichvudikem,(select dichvudikem.TenDichVuDiKem as ten_dich_vu_di_kem,count(hopdongchitiet.IDDichVuDiKem) as so_lan_su_dung from hopdong
inner join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
inner join dichvudikem on hopdongchitiet.IDDichVuDiKem = dichvudikem.IDDichVuDiKem
where year(hopdong.NgayLamHopDong)=2019
group by hopdongchitiet.IDDichVuDiKem 
having so_lan_su_dung > 3) as temp 
set dichvudikem.Gia=dichvudikem.Gia*2
where dichvudikem.TenDichVuDiKem = temp.ten_dich_vu_di_kem;
--- 20
select nhanvien.IDNhanVien as ID,nhanvien.DiaChi,nhanvien.Email,
nhanvien.HoTen,nhanvien.NgaySinh,nhanvien.SDT,
nhanvien.SoCMND,"nhanvien" as fromTABLE from nhanvien
union all
select khachhang.IDKhachHang as ID,khachhang.DiaChi,khachhang.Email,
khachhang.HoTen,khachhang.NgaySinh,khachhang.SDT,
khachhang.SoCMND,"khachhang" as fromTABLE from khachhang