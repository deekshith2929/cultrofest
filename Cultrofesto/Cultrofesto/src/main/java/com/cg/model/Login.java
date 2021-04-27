package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="adminlogin")
public class Login {
	
	    @Id
	    @Column(name = "admin_id")
	    private long adminid;

		@Column(name= "Password")
	    private String password;

		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Login(long adminid, String password) {
			super();
			this.adminid = adminid;
			this.password = password;
		}

		public long getAdminid() {
			return adminid;
		}

		public void setAdminid(long adminid) {
			this.adminid = adminid;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Login [adminid=" + adminid + ", password=" + password + "]";
		}


}
