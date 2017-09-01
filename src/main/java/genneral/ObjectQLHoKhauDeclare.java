package genneral;

import org.openqa.selenium.By;

public class ObjectQLHoKhauDeclare {
	//----------------------------tim kiem------------------------------------------
	public static By btnXemChiTiet() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[7]/div/a[1]/i");
	}

	public static By xpathXemChiTiet() {
		return By.xpath("html/body/div[1]/div/div/div[1]/h4");
	}

	public static By btnDongXemChiTiet() {
		return By.xpath("html/body/div[1]/div/div/div[2]/div[4]/button");
	}

	public static By dropThonXom() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div/address-picker-role/form/div/div[4]/div/div[1]/span/i");
	}

	public static By xpathThonXom() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div/address-picker-role/form/div/div[4]/div/ul/li/div[3]/span/div");
	}

	public static By txtChuHo() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div[1]/div/input");
	}

	public static By btnTimKiem() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/button");
	}

	public static By btnThaoTacXoa() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr[1]/td[7]/div/a[3]/i");
	}
	public static By btnXoa() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[2]");
	}

	public static By btnQuanLyHoKhau() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[1]/div/ul/li[3]/ul/li[2]/a");
	}

	public static By btnChinhSuaHK() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[7]/div/a[2]/i");
	}
	
	public static By btnThaoTacXoaNK1() {
		return By.xpath("html/body/div[1]/div/div/form/div[2]/div[10]/div[1]/div/div[2]/table/tbody/tr[1]/td[5]/a[2]/i");
	}
	
	public static By btnThaoTacSuaNK1() {
		return By.xpath("html/body/div[1]/div/div/form/div[2]/div[10]/div[1]/div/div[2]/table/tbody/tr[1]/td[5]/a[1]/i");
	}
	
	public static By btnThaoTacXoaNK2() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[10]/div[1]/div/div[2]/table/tbody/tr[2]/td[5]/a[2]/i");
	}

	public static By btnThaoTacSuaNK2() {
		return By.xpath("html/body/div[1]/div/div/form/div[2]/div[10]/div[1]/div/div[2]/table/tbody/tr[2]/td[5]/a[1]/i");
	}
	
	public static By btnDongYXoaNK2() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[2]");
	}

	public static By btnDongYChinhSuaHK() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[1]");
	}
	//----------------------------them ho khau----------------------------------------
	public static By btnTaoMoiHK() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[3]");
	}

	public static By xpathMHThemMoiHK() {
		return By.xpath("html/body/div[1]/div/div/form/div[1]/h4");
	}
	
	public static By btnThemMoiHK() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/button[1]");
	}

	public static  By dropChuHo() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[1]/div[2]/div/span/button");
	}

	public static By txtMaYTCNSearch() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input");
	}                    

	public static By btnTimKiemSearch() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[2]/div/button");
	}

	public static By btnThaoTacSearch() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[2]/table/tbody/tr/td[8]/a/i");
	}
	public static By btnBoDiaChiChuHo() {
		return By.xpath("html/body/div[1]/div/div/form/div[2]/div[3]/div/div/address-picker/div/div[1]/div/div[1]/span/a/i");
	}

	public static By btnHuyTachKhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/form/div[3]/button[1]");
	}
	public static By btnLuu() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[2]");
	}

	public static By linkChuHo() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[10]/div[1]/div/div[2]/table/tbody/tr/td[1]/a");
	}


	public static By xpathMaYTCNChuHo() {
		return By.xpath(".//*[@id='ttCaNhan']/div/div/div[2]/form/div[1]/div[1]/p");
	}

	public static By xpathQHVoiChuHo() {
		return By.xpath(".//*[@id='ttCaNhan']/div/div/div[2]/form/div[2]/div[2]/p");
	}

	public static By btnDong() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[3]/button");
	}                          

	public static By btnDongThemNK() {
		return By.xpath("html/body/div[1]/div/div/div/form/div[3]/a[1]/span[2]");
	}
	
	public static By btnThemNhanKhau() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[10]/div[1]/div/div[1]/div/div/a/span[2]");
	}

	public static By btnChonDSNhanKhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/form/div[2]/div/div[1]/div/span/button");
	}                    
	public static By dropQHVoiChuHo() {
		return By.xpath(".//*[@id='field_loaiQh']");
	}

	public static By xpathKhungQHVoiChuHo() {
		return By.xpath("html/body/div[1]/div/div/div/form/div[2]/div/div[2]/select");
	}
	
	public static By xpathMHThemNKVaoHK() {
		return By.xpath("html/body/div[1]/div/div/div/form/div[1]/h4");
	}
	
	public static By dropQHVoChuHo() {
		return By.xpath(".//*[@id='field_loaiQh']/option[6]");
	}

	public static By btnLuuThemNK() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/form/div[3]/a[2]");
	}

	public static By linkNK() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[10]/div[1]/div/div[2]/table/tbody/tr[2]/td[1]/a");
	}  

	public static By xpathmessageLoiChonChuHo() {
		return By.xpath(".//*[@id='toast-container']/div/div/div/div");
	}
	
	public static By btnDongChonChuHo() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[1]/button");
	}

	public static By btnDongThemChuHo() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[1]");
	}                            

	public static By xpathmessageChuyenHoKhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/form/div[2]/p");
	}

	public static By xpathmessageXacNhanXoa() {
		return By.xpath("html/body/div[1]/div/div/form/div[2]/p");
	}

	public static By btnDongChuyenHoKhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/form/div[3]/button[1]");
	}                    

	public static By btnDongXoaHoKhau() {
		return By.xpath("html/body/div[1]/div/div/form/div[3]/button[1]");
	}
	public static By btnDongHoKhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[1]");
	}       
}
