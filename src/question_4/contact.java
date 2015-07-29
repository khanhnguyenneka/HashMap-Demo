package question_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class contact {
	private static int counter;
	private String str;
	
	public static void main(String args[]){
		contact a = new contact();
		HashMap<String, String> hm = a.insert(new HashMap<String, String>());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhập vào giá trị cần kiểm tra...");
		try {
			String str = br.readLine();
			if (a.searchForValue(hm, str)) {
				System.out.print("Giá trị " + str+ " có tồn tại trong contact");
			} else {
				System.out.println("Giá trị " + str + " không tồn tại trong contact");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Nhập vào khóa cần kiểm tra...");
		try {
			String str = br.readLine();
			if (a.searchForKey(hm, str)) {
				System.out.println("Khóa " + str + " có tồn tại trong contact");
			} else {
				System.out.println("Khóa " + str + " không tồn tại trong contact");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Tìm kiếm số điện thoại của");
		try {
			String str = br.readLine();
			System.out.println("Số điện thoại của " + str + " là "
					+ a.get(hm, str));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Bạn muốn xóa số điện thoại của ai?");
		try {
			String str = br.readLine();
			a.delete(hm, str);
			System.out.println("Số điện thoại của " + str + " đã được xóa");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Danh sách các mẩu tin còn lại là ");
		System.out.println(a.show(hm));

	}

	public HashMap<String, String> insert(HashMap<String, String> hm) {
		System.out.println("Số lượng ptử: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			str = br.readLine();
			counter = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("Kí tự nhập vào không phải là 1 số");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int index = 0; index < counter; index++) {
			System.out.println("Nhập vào KEY ");
			String str1;
			String str2;
			try {
				str1 = br.readLine();
				System.out.println("Nhập vào VALUE ");
				str2 = br.readLine();
				hm.put(str1, str2);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return hm;
	}

	public boolean searchForValue(HashMap<String, String> hm, String value) {
		return hm.containsValue(value);
	}

	public boolean searchForKey(HashMap<String, String> hm, String key) {
		return hm.containsKey(key);
	}

	public String get(HashMap<String, String> hm, String key) {
		return hm.get(key);
	}

	public void delete(HashMap<String, String> hm, String key) {
		hm.remove(key);
	}

	public String show(HashMap<String, String> hm) {
		return hm.toString();
	}
}		


