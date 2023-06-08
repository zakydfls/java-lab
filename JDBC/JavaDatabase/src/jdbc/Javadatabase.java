package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Javadatabase {
		static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	    static final String DB_URL = "jdbc:mysql://127.0.0.1/javadb";
	    static final String USER = "root";
	    static final String PASS = "";
	    static final String checkQuery = "SELECT * FROM barang WHERE nm_brg=?";
	    
	    static Connection conn;
	    static Statement stmt;
	    static ResultSet rs;
	    static PreparedStatement ps;
	    
	public static void main(String[] args) {
		boolean menu = true;
		Scanner sc = new Scanner(System.in);
		String kode_brg;
		String nama_brg, old_nama_brg;
		String satuan;
		int stok;
		int stok_min;
	        do {
	        	System.out.println("==Menu CRUD==");
	        	System.out.println("1.Show Data");
	        	System.out.println("2.Insert Data");
	        	System.out.println("3.Update Data");
	        	System.out.println("4.Delete Data");
	        	System.out.print("Pilihan : ");
	        	int pilihan = sc.nextInt();
	        	sc.nextLine();
	        	switch (pilihan) {
                case 1:
                	show();
                	break;
                case 2:
                	System.out.print("Kode Barang : ");
                	kode_brg = sc.nextLine();
                	System.out.print("Nama Barang : ");
                	nama_brg = sc.nextLine();
                	System.out.print("Satuan : ");
                	satuan = sc.nextLine();
                	System.out.print("Stok Barang : ");
                	stok = sc.nextInt();
                	sc.nextLine();
                	System.out.print("Stok min Barang : ");
                	stok_min = sc.nextInt();
                	sc.nextLine();
                	insert(kode_brg, nama_brg, satuan, stok, stok_min);
                	break;
                case 3:
                	System.out.print("Nama barang yang akan diupdate : ");
                	old_nama_brg = sc.nextLine();
                	System.out.println("===Data Baru untuk Update===");
                	System.out.print("Kode Barang : ");
                	kode_brg = sc.nextLine();
                	System.out.print("Nama Barang : ");
                	nama_brg = sc.nextLine();
                	System.out.print("Satuan : ");
                	satuan = sc.nextLine();
                	System.out.print("Stok Barang : ");
                	stok = sc.nextInt();
                	sc.nextLine();
                	System.out.print("Stok min Barang : ");
                	stok_min = sc.nextInt();
                	sc.nextLine();
                	update(old_nama_brg, kode_brg, nama_brg, satuan, stok, stok_min);
                	break;
                case 4:
                	System.out.print("Nama barang yang ingin dihapus data : ");
                	nama_brg = sc.nextLine();
                	delete(nama_brg);
                	break;
                default:
                		break;
	        	}
	        	
	        }while(menu = true);
	    }

	public static void insert(String kode_brg, String nama_brg, String satuan, int stok,int stok_min)
		{
			try {
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				stmt = conn.createStatement();
				
				String sql = "INSERT INTO barang (kd_brg,nm_brg,satuan,stok_brg,stok_min) VALUES (?,?,?,?,?)";
				ps = conn.prepareStatement(sql);
				
				ps.setString(1, kode_brg);
				ps.setString(2, nama_brg);
				ps.setString(3, satuan);
				ps.setInt(4, stok);
				ps.setInt(5, stok_min);
				
				ps.execute();
				
				stmt.close();
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

		public static void show()
		{
			try {
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				stmt = conn.createStatement();
				
				rs = stmt.executeQuery("SELECT * FROM barang");
				int i = 1;
				while(rs.next())
				{
					System.out.println("====================");
					System.out.println("Data ke-"+i);
					System.out.println("Kode Barang: " + rs.getString("kd_brg"));
					System.out.println("Nama Barang: "+rs.getString("nm_brg"));
					System.out.println("Satuan: "+rs.getString("satuan"));
					System.out.println("Stok: "+rs.getString("stok_brg"));
					System.out.println("Stok minimal: "+rs.getString("stok_min"));
					i++;
					System.out.println("====================");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public static void update(String old, String newKode, String newNama, String newSatuan, int newStok, int newStokMin) {
			try {
				String updateCheck = "SELECT * FROM barang WHERE nm_brg=?";
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				ps = conn.prepareStatement(updateCheck);
	            ps.setString(1, old);
	            rs = ps.executeQuery();
	            if (rs.next()) {
	            	ps = conn.prepareStatement("UPDATE barang SET kd_brg=?, nm_brg=?, satuan=?, stok_brg=?, stok_min=? WHERE nm_brg=?");
//	            	ps = conn.prepareStatement("UPDATE barang SET (kd_brg, nm_brg, satuan, stok_brg, stok_min)(?,?,?,?,?) WHERE nm_brg=?");
	                ps.setString(1, newKode);
	                ps.setString(2, newNama);
	                ps.setString(3, newSatuan);
	                ps.setInt(4, newStok);
	                ps.setInt(5, newStokMin);
	                ps.setString(6, old);
	                ps.executeUpdate();
	                System.out.println("User updated successfully!");
	            } else {
	                System.out.println("User not found for update.");
	            }
				stmt.close();
				conn.close();
			} catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void delete(String nama_brg) {
			try {
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				ps = conn.prepareStatement(checkQuery);
				ps.setString(1, nama_brg);
				rs = ps.executeQuery();
				if(rs.next()) {
					ps = conn.prepareStatement("DELETE FROM barang WHERE nm_brg=?");
					ps.setString(1, nama_brg);
					int rowsAffected = ps.executeUpdate();
					if(rowsAffected > 0) {
						System.out.println("Barang berhasil dihapus");
					}else {
						System.out.println("Barang gagal dihapus");
					}
				}else {
					System.out.println("Barang tidak ada di database");
				}
				conn.close();
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
	}