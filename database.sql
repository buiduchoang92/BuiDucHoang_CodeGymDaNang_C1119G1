insert into furama_database.loaikhach values(1000,"Diamond");
insert into furama_database.loaikhach values(1001,"Platinium");
insert into furama_database.loaikhach values(1002,"Gold");
insert into furama_database.loaikhach values(1003,"Silver");
insert into furama_database.loaikhach values(1004,"Member");
insert into furama_database.khachhang values(1001,1004,"Bui Duc Viet",19921025,2345676,987654321,"viet@vn.com","DaNang");
insert into furama_database.khachhang values(1002,1003,"Dang Quoc Truong",20051125,21345678,09876123,"truong@vn.com","QuangNam");
insert into furama_database.khachhang values(1003,1002,"Luu Dinh Quoc",19980223,9876532,5432167890,"quoc@vn.com","QuangTri");
insert into furama_database.khachhang values(1004,1001,"Tran Minh Trieu",19960313,543876,9876054321,"trieu@vn.com","QuangNinh");
insert into furama_database.khachhang values(1005,1000,"Nguyen Phu Quy",19500415,09876123,123458765,"quy@vn.com","HoChiMinh");
insert into furama_database.kieuthue values(1000,"Nam",15000);
insert into furama_database.kieuthue values(1001,"Thang",150);
insert into furama_database.kieuthue values(1002,"Ngay",15);
insert into furama_database.kieuthue values(1003,"Gia",5);
insert into furama_database.dichvudikem values(1000,"Massage",100,"DoLa","KhaQuan");
insert into furama_database.dichvudikem values(1001,"Karaoke",50,"DoLa","KhaQuan");
insert into furama_database.dichvudikem values(1002,"ThucAn",55,"DoLa","KhaQuan");
insert into furama_database.dichvudikem values(1003,"NuocUong",10,"DoLa","KhaQuan");
insert into furama_database.dichvudikem values(1004,"XeDiChuyen",65,"DoLa","KhaQuan");
insert into furama_database.loaidichvu values(1000,"Villa");
insert into furama_database.loaidichvu values(1001,"House");
insert into furama_database.loaidichvu values(1002,"Room");
insert into furama_database.dichvu values(1000,"Villa1",150,4,5,170,1000,1000,"KhaQuan");
insert into furama_database.dichvu values(1001,"Room1",160,1,2,170,1001,1002,"KhaQuan");
insert into furama_database.dichvu values(1002,"Villa2",170,3,3,170,1002,1000,"KhaQuan");
insert into furama_database.dichvu values(1003,"House2",110,5,4,170,1003,1001,"KhaQuan");
insert into furama_database.dichvu values(1004,"House1",120,6,5,170,1001,1001,"KhaQuan");
insert into furama_database.dichvu values(1005,"Villa3",130,2,6,170,1003,1002,"KhaQuan");
insert into furama_database.hopdong values(1000,1001,1000,1000,20191025,20200125,15,700);
insert into furama_database.hopdong values(1001,1000,1000,1000,20191025,20200125,15,700);
insert into furama_database.hopdong values(1002,1002,1000,1001,20191025,20200225,15,700);
insert into furama_database.hopdong values(1003,1003,1001,1001,20191025,20200325,15,700);
insert into furama_database.hopdong values(1004,1004,1001,1002,20191025,20200425,15,700);
insert into furama_database.hopdong values(1005,1001,1002,1003,20191025,20191125,15,700);
insert into furama_database.hopdong values(1006,1000,1005,1004,20191025,20201027,15,700);
insert into furama_database.hopdong values(1007,1002,1003,1005,20191025,20201026,15,700);
insert into furama_database.hopdong values(1008,1004,1004,1002,20181025,20201025,15,700);
---2
select*
from nhanvien 
where (HoTen like  "%k___") or (HoTen like "%h____") or (HoTen like "%t_____") ;
---3
select*
from nhanvien
where (((DiaChi = "DaNang") or (DiaChi = "QuangTri")) and ((year(now()) - year(NgaySinh)) between 18 and 50))
---4
select furama_database.hopdong.IDHopDong,furama_database.khachhang.HoTen,count(furama_database.hopdong.IDKhachHang)
as demhopdong
from furama_database.khachhang
inner join furama_database.hopdong
on furama_database.hopdong.IDKhachHang = furama_database.khachhang.IDKhachHang
where furama_database.loaikhach.TenLoaiKhach = 1000
group by furama_database.khachhang.HoTen
---5
select furama_database.khachhang.IDKhachHang,furama_database.khachhang.HoTen,
furama_database.hopdong.IDHopDong,furama_database.dichvu.TenDichVu,
furama_database.hopdong.NgayLamHopDong,furama_database.hopdong.NgayKetThuc,
sum(furama_database.dichvu.ChiPhiThue+furama_database.dichvudikem.Gia*furama_database.hopdongchitiet.SoLuong) as tongtien
from furama_database.khachhang
left join furama_database.hopdong on hopdong.IDKhachHang = khachhang.IDKhachHang
left join furama_database.dichvu on hopdong.IDDichVu = dichvu.IDDichVu
left join furama_database.hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
left join furama_database.dichvudikem on dichvudikem.IDDichVuDiKem = hopdongchitiet.IDDichVuDiKem
group by khachhang.HoTen
---6
select furama_database.dichvu.IDDichVu,furama_database.dichvu.TenDichVu,furama_database.dichvu.DienTich,
furama_database.dichvu.ChiPhiThue,furama_database.loaidichvu.TenLoaiDichVu
from furama_database.dichvu
inner join furama_database.loaidichvu on furama_database.dichvu.IDLoaiDichVu = furama_database.loaidichvu.IDLoaiDichVu
where not exists(select furama_database.hopdong.IDHopDong from furama_database.hopdong 
where(furama_database.hopdong.NgayLamHopDong between "2019-01-01" and "2019-03-31")
and furama_database.hopdong.IDDichVu = furama_database.dichvu.IDDichVu);
---7
select furama_database.dichvu.IDDichVu,furama_database.dichvu.TenDichVu,furama_database.dichvu.DienTich,
furama_database.dichvu.SoNguoiToiDa,furama_database.dichvu.ChiPhiThue,furama_database.loaidichvu.TenLoaiDichVu
from furama_database.dichvu
inner join furama_database.loaidichvu on furama_database.dichvu.IdLoaiDichVu = furama_database.loaidichvu.IDLoaiDichVu
where exists(select furama_database.hopdong.IDHopDong from furama_database.hopdong where year(furama_database.hopdong.NgayLamHopDong)= "2018" and furama_database.hopdong.IDDichVu = furama_database.dichvu.IDDichVu)
and not exists(select furama_database.hopdong.IDHopDong from furama_database.hopdong where year(furama_database.hopdong.NgayLamHopDong)= "2019" and furama_database.hopdong.IDDichVu = furama_database.dichvu.IDDichVu)
---8
select distinct furama_database.khachhang.HoTen from furama_database.khachhang
select furama_database.khachhang.HoTen from furama_database.khachhang group by furama_database.khachhang.HoTen
select furama_database.khachhang.HoTen from furama_database.khachhang union select furama_database.khachhang.HoTen from furama_database.khachhang
---9
select temp.month,count(month(furama_database.hopdong.NgayLamHopDong)) as SoKhachHangDangKi, sum(furama_database.hopdong.TongTien) as Tong_Tien from
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
left join furama_database.hopdong on month(furama_database.hopdong.NgayLamHopDong) = temp.month
left join furama_database.khachhang on furama_database.khachhang.IDKhachHang = furama_database.hopdong.IDKhachHang
where year(furama_database.hopdong.NgayLamHopDong)="2019"
group by temp.month
order by temp.month 
---10
select furama_database.hopdong.IDHopDong,furama_database.hopdong.NgayLamHopDong,furama_database.hopdong.NgayKetThuc,furama_database.hopdong.TienDatCoc,count(furama_database.hopdongchitiet.IDDichVuDiKem) as SoLuongDichVuDiKem
from furama_database.hopdong
inner join furama_database.hopdongchitiet on furama_database.hopdong.IDHopDong = furama_database.hopdongchitiet.IDHopDong
group by furama_database.hopdong.IDHopDong;
---11
select furama_database.dichvudikem.TenDichVuDiKem,furama_database.dichvudikem.Gia,furama_database.dichvudikem.DonVi from furama_database.hopdong
inner join furama_database.hopdongchitiet on furama_database.hopdong.IDHopDong = furama_database.hopdongchitiet.IDHopDong
inner join furama_database.dichvudikem on furama_database.dichvudikem.IDDichVuDiKem = furama_database.hopdongchitiet.IDDichVuDiKem
inner join furama_database.khachhang on furama_database.khachhang.IDKhachHang = furama_database.hopdong.IDKhachHang
inner join furama_database.loaikhach on furama_database.loaikhach.IDLoaiKhach = furama_database.khachhang.IDLoaiKhach
where furama_database.loaikhach.TenLoaiKhach = "Diamond" and furama_database.khachhang.DiaChi in ("Vinh","QuangNgai");
---12
select furama_database.hopdong.IDhopDong,furama_database.nhanvien.HoTen,furama_database.khachhang.HoTen,furama_database.khachhang.SDT,furama_database.dichvu.TenDichVu,
count(furama_database.hopdongchitiet.IDDichVuDiKem) as SoLuongDichVuDiKem
from furama_database.hopdong
inner join furama_database.nhanvien on furama_database.nhanvien.IDNhanVien = furama_database.hopdong.IDNhanVien
inner join furama_database.khachhang on furama_database.khachhang.IDKhachHang = furama_database.hopdong.IDKhachHang
inner join furama_database.dichvu on furama_database.dichvu.IDDichVu = furama_database.hopdong.IDDichVu
inner join furama_database.hopdongchitiet on furama_database.hopdongchitiet.IDHopDong = furama_database.hopdong.IDHopDong
where not exists(select furama_database.hopdong.IDHopDong where furama_database.hopdong.NgayLamHopDong between "2019-01-01" and "2019-06-31")
and exists(select furama_database.hopdong.IDHopDong where furama_database.hopdong.NgayLamHopDong between "2019-09-01" and "2019-12-31");
---13
create temporary table temp
select furama_database.dichvudikem.TenDichVuDiKem as ten_dich_vu_di_kem,
count(furama_database.hopdongchitiet.IDDichVuDiKem) as so_lan_su_dung from furama_database.hopdongchitiet
inner join furama_database.dichvudikem on dichvudikem.IDDichVuDiKem = hopdongchitiet.IDDichVuDiKem
group by furama_database.dichvudikem.TenDichVuDiKem; 
select * from temp;

create temporary table temp1
select max(temp.so_lan_su_dung) as max_so_lan_su_dung from temp;
select * from temp1;

select temp.ten_dich_vu_di_kem,temp.so_lan_su_dung from temp inner join temp1 on temp.so_lan_su_dung = temp1.max_so_lan_su_dung;

drop temporary table temp;
drop temporary table temp1;
---14
select furama_database.hopdong.IDHopDong,furama_database.dichvu.TenDichVu,furama_database.dichvudikem.TenDichVuDiKem,
count(furama_database.hopdongchitiet.IDDichVuDiKem) as so_lan_su_dung from furama_database.hopdong
inner join furama_database.dichvu on furama_database.hopdong.IDDichVu = furama_database.dichvu.IDDichVu
inner join furama_database.hopdongchitiet on furama_database.hopdongchitiet.IDHopDong = furama_database.hopdong.IDHopDong
inner join furama_database.dichvudikem on furama_database.dichvudikem.IDDichVuDiKem = furama_database.hopdongchitiet.IDDichVuDiKem
group by (furama_database.dichvudikem.TenDichVuDiKem) having so_lan_su_dung = 1;
---15
select furama_database.nhanvien.HoTen,furama_database.nhanvien.IDNhanVien,furama_database.trinhdo.TrinhDo,
furama_database.bophan.TenBoPhan,furama_database.nhanvien.SDT,furama_database.nhanvien.DiaChi, count(furama_database.hopdong.IDNhanVien) as lan_lam_HD
from furama_database.hopdong
inner join furama_database.nhanvien on furama_database.hopdong.IDNhanVien = furama_database.nhanvien.IDNhanVien
inner join furama_database.trinhdo on furama_database.nhanvien.IDTrinhDo = furama_database.trinhdo.IDTrinhDo
inner join furama_database.bophan on furama_database.bophan.IDBoPhan = furama_database.nhanvien.IDBoPhan
where year(furama_database.hopdong.NgayLamHopDong) between "2018" and "2019"
group by (furama_database.nhanvien.HoTen) having lan_lam_HD < 4;
---16
create temporary table table1
select furama_database.nhanvien.IDNhanVien as idNV,furama_database.hopdong.IDHopDong as idHD from hopdong
inner join nhanvien on hopdong.IDNhanVien = nhanvien.IDNhanVien
where not exists (select nhanvien.IDNhanVien from furama_database.hopdong
where hopdong.NgayLamHopDong between "2017-01-01" and "2019-12-31" and hopdong.IDNhanVien = nhanvien.IDNhanVien);
select* from furama_database.table1;
delete from furama_database.table1 where hopdong.IDHopDong in (select table1.idHD from table1);
delete from furama_database.table1 where nhanvien.IDNhanVien in (select table1.idNV from table1);
SET SQL_SAFE_UPDATES = 0;
---17
update khachhang,(select hopdong.IDKhachHang as id, sum(hopdong.TongTien) as tong_tien from hopdong
where year(hopdong.NgayLamHopDong) = "2019" 
group by hopdong.IDKhachHang
having tong_tien > 500) as temp
set khachhang.IDLoaiKhach=(select loaikhach.IDLoaiKhach from loaikhach where loaikhach.TenLoaiKhach = "Diamond" )
where khachhang.IDLoaiKhach=(select loaikhach.IDLoaiKhach from loaikhach where loaikhach.TenLoaiKhach = "Platinium")
and temp.id = khachhang.IDLoaiKhach;
---18
delete khachhang,hopdong,hopdongchitiet from hopdong
inner join khachhang on khachhang.IDKhachHang = hopdong.IDHopDong
inner join hopdongchitiet on hopdongchitiet.IDHopDong = hopdong.IDHopDong
where not exists( select hopdong.IDHopDong where year(hopdong.NgayLamHopDong)>2016 and hopdong.IDKhachHang = khachhang.IDKhachHang);
---19
update furama_database.dichvudikem,(select dichvudikem.TenDichVuDiKem as ten_dich_vu_di_kem,count(furama_database.hopdongchitiet.IDDichVuDiKem) as so_lan_su_dung from hopdong
inner join furama_database.hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
inner join furama_database.dichvudikem on hopdongchitiet.IDDichVuDiKem = dichvudikem.IDDichVuDiKem
where year(hopdong.NgayLamHopDong)=2019
group by hopdongchitiet.IDDichVuDiKem 
having so_lan_su_dung > 3) as temp 
set dichvudikem.Gia=dichvudikem.Gia*2
where dichvudikem.TenDichVuDiKem = temp.ten_dich_vu_di_kem;
---20
select furama_database.nhanvien.IDNhanVien as ID,furama_database.nhanvien.DiaChi,furama_database.nhanvien.Email,
furama_database.nhanvien.HoTen,furama_database.nhanvien.NgaySinh,furama_database.nhanvien.SDT,
furama_database.nhanvien.SoCMND,"nhanvien" as fromTABLE from nhanvien
union all
select furama_database.khachhang.IDKhachHang as ID,furama_database.khachhang.DiaChi,furama_database.khachhang.Email,
furama_database.khachhang.HoTen,furama_database.khachhang.NgaySinh,furama_database.khachhang.SDT,
furama_database.khachhang.SoCMND,"khachhang" as fromTABLE from khachhang
